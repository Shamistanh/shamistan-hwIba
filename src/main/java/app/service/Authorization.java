package app.service;

import app.MainApp;
import app.dao.DAOUser;
import app.entity.User;
import app.io.ConsoleMain;
import java.io.File;

public class Authorization {
    int automatic_id = 0;
    String username;
    String password;
    String email;
    ConsoleMain cm = new ConsoleMain();
    MainApp ma = new MainApp();
    DAOUser daoUser = new DAOUser(new File("DAOUser1.txt"));

    public void register() {
        System.out.println("Welcome to registration))");

        System.out.print(" Please enter username ");
        username = cm.readLn();
        System.out.println();
        System.out.print(" Please enter password ");
        password = cm.readLn();
        System.out.println();
        System.out.print(" Please enter email ");
        email = cm.readLn();
        automatic_id = daoUser.getAll().size();
        daoUser.create(new User(automatic_id, username, password, email));
        System.out.println("Acount has been created successfully))");
        if (daoUser.getAll().size() < 1) {
            automatic_id = 1;
        } else {
            automatic_id = daoUser.getAll().size();
        }

    }


}
