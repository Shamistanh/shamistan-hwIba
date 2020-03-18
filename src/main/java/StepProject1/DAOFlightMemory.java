//package StepProject1;
//
//import java.util.*;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//public class DAOFlightMemory implements DAO<Flight> {
//
//    private final Map<Integer, Flight> storage = new HashMap<>();
//
//    @Override
//    public Optional<Flight> get(int id) {
//        try {
//            return Optional.of(storage.get(id));
//        } catch (NullPointerException ex) {
//            return Optional.empty();
//        }
//    }
//
//    @Override
//    public Collection<Flight> getAll() {
//        return storage.values();
//    }
//
//    @Override
//    public Collection<Flight> getAllBy(Predicate<Flight> p) {
//        return getAll().stream().filter(p).collect(Collectors.toList());
//    }
//
//    @Override
//    public void create(Flight data) {
//        storage.put(data.id, data);
//    }
//
//    @Override
//    public void delete(int id) {
//        storage.remove(id);
//    }
//}
