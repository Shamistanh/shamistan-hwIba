package HW9.DAO;

import HW9.entity.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FamilyDao<A extends Identifiable> implements DAO<A> {
    private final File file;

    public FamilyDao(String filename) {
        this.file = new File(filename);
    }
    @Override
    public Collection<A> getAllFamilies() {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            Object readed = ois.readObject();
            List<Family> family = (ArrayList<Family>) readed;
            return (Collection<A>) family;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
//
    @Override
    public Collection<A> getFamilyByIndex(Predicate<A> p) {
        return (Collection) getAllFamilies().stream().filter(p).collect(Collectors.toList());
    }

    @Override
    public Optional get(int id) {
        return getAllFamilies().stream().filter(s->s.getId() == id).findFirst();
    }

    @Override
    public void create(A data) {
        Collection<A> as = getAllFamilies();
        as.add(data);
        write(as);
    }


    @Override
    public void deleteFamily(int id) {
        Collection<A> as = getFamilyByIndex(s -> s.getId() != id);
        write(as);
    }

    @Override
    public void deleteFamily(Predicate<A> p) {
        Collection<A> as = getFamilyByIndex(a -> !p.test(a));
        write(as);
    }

    private void write(Collection<A> as) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file))))
        {
            oos.writeObject(as);
        } catch (IOException ex) {
            throw new RuntimeException("DAO:write:IOException", ex);
        }
    }

}
