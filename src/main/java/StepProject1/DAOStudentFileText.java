//package StepProject1;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Optional;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//public class DAOStudentFileText implements DAO<Flight> {
//
//    private File file;
//
//    public DAOStudentFileText(String filename) {
//        this.file = new File(filename);
//    }
//
//    @Override
//    public Collection<Flight> getAll() {
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            return br.lines().map(Flight::parse).collect(Collectors.toList());
//        } catch (IOException ex) {
//            return new ArrayList<>();
//        }
//    }
//
//    @Override
//    public Optional<Flight> get(int id) {
//        return getAll().stream().filter(s -> s.id == id).findFirst();
//    }
//
//    @Override
//    public Collection<Flight> getAllBy(Predicate<Flight> p) {
//        return getAll().stream().filter(p).collect(Collectors.toList());
//    }
//
//    @Override
//    public void create(Flight flight) {
//        Collection<Flight> flights = getAll();
//        flights.add(flight);
//        write(flights);
//    }
//
//    @Override
//    public void delete(int id) {
//        Collection<Flight> flights = getAllBy(s -> s.id != id);
//        write(flights);
//    }
//
//    private void write(Collection<Flight> flights) {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
//            for (Flight s: flights) {
//                bw.write(s.represent());
//                bw.write("\n");
//            }
//        } catch (IOException ex) {
//            throw new RuntimeException("DAO:write:IOException", ex);
//        }
//    }
//
//}
