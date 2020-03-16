package app.entity;

import java.io.Serializable;

public class User implements Serializable {
  private final static long SerialVersionUID = 1L;
  private int id;
  private String user_name;
  private String password;
  private String email;
  public User(int id, String username, String password, String email){
    this.id = id;
    this.user_name = username;
    this.password = password;
    this.email = email;
  }

  public User(String user_name, String password){
    this.user_name = user_name;
    this.password = password;
  }

  public String getUser_name() {
    return user_name;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public User(int id){
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", user_name='" + user_name + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
