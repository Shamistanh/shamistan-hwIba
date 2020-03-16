package app.Generation;

import app.dao.DAO;
import app.dao.DAOFlight;
import app.entity.Flight;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


public class generateFlight {
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.M.yyyy HH:mm");
    DAOFlight df = new DAOFlight(new File("DAOFlight.txt"));
    String dateFormat;

    public void genearate() {

        for (int i = 0; i < 100; i++) {
            LocalDateTime randomDate = LocalDateTime.of(2020, (int) (Math.random() * 6) + 3, (int) (Math.random() * 25) + 1, (int) (Math.random() * 12) + 1, (int) (Math.random() * 58) + 1);

            df.create(
                    new Flight(i, fmt.format(randomDate), randomCity(), (int) (Math.random() * 100) + 1)
            );

        }
    }

    public String randomCity() {
        int n = (int) (Math.random() * 10);
        String[] cities = {"Baku", "Ganja", "Sumgait", "Guba", "Zagatala", "Fuzuli", "Shamakhi", "Ordubad", "Sadarak", "Lankaran", "Tartar"};
        return cities[n];
    }

}
