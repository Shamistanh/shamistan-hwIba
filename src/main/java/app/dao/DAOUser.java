package app.dao;

import app.entity.Flight;
import app.entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DAOUser implements DAO<User> {
    File file;

    public DAOUser(File file) {
        this.file = file;
    }

    @Override
    public Optional<User> get(int id) {
        return getAll().stream().filter(s -> s.getId() == id).findFirst();
    }


    @Override
    public Collection<User> getAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            Object readed = ois.readObject();
            List<User> users = (ArrayList<User>) readed;
            return users;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

    public List<User> getAllby(Predicate<User> p) {
        return getAll().stream().filter(p).collect(Collectors.toList());
    }

    @Override
    public Collection<User> getAllBy(Predicate<User> p) {
        return getAll().stream().filter(p).collect(Collectors.toList());
    }

    @Override
    public void create(User data) {
        Collection<User> users = getAll();
        users.add(data);
        write(users);
    }

    @Override
    public void delete(int id) {
        Collection<User> users = getAllBy(s -> s.getId() != id);
        write(users);
    }

    private void write(Collection<User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            oos.writeObject(users);
        } catch (IOException ex) {
            throw new RuntimeException("DAO:write:IOException", ex);
        }
    }
}
