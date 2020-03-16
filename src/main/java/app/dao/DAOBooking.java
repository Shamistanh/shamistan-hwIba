package app.dao;


import app.entity.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DAOBooking implements DAO<Booking> {
  private File file;
  public DAOBooking(File file){
    this.file = file;
  }
  @Override
  public Optional<Booking> get(int id) {
    return Optional.empty();
  }

  @Override
  public Collection<Booking> getAll() {
    try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      Object readed = ois.readObject();
      List<Booking> bookings = (ArrayList<Booking>) readed;
      return bookings;
    } catch (IOException | ClassNotFoundException ex) {
      return new ArrayList<>();
    }
  }

  @Override
  public Collection<Booking> getAllBy(Predicate<Booking> p) {
    List<Booking> collect = getAll().stream().filter(p).collect(Collectors.toList());
    return collect;
  }

  @Override
  public void create(Booking data) {
      Collection<Booking> bookings = getAll();
      bookings.add(data);
      write(bookings);
  }

  @Override
  public void delete(int id) {
      Collection<Booking> bookings = getAllBy(s -> s.getUser_id() != id);
      write(bookings);

  }
  private void write(Collection<Booking> bookings) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      oos.writeObject(bookings);
    } catch (IOException ex) {
      throw new RuntimeException("DAO:write:IOException", ex);
    }
  }
}
