package HW9.DAO;

import HW9.entity.Family;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public interface DAO<A> {


    Collection<A> getAllFamilies();
    Collection<A> getFamilyByIndex(Predicate<A> p);
    Optional<A> get(int id);
    Family create(A data);
    void deleteFamily(int id);
    void deleteFamily(Predicate<A> p);


}
