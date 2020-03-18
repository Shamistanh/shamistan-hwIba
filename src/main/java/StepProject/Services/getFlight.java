package StepProject.Services;

import StepProject.DAO.DAO;
import StepProject.DAO.DAOFlightFileText;
import StepProject.DAO.Flight;

import java.time.LocalDateTime;


public class getFlight {
    DAO<Flight> dao = new DAOFlightFileText("FLIGHTS.txt");
    LocalDateTime ldt;
    public String get(int i){

        String s = dao.get(i).map(Flight::represent).orElse("No flight found");
        return s;
    }

    public void generate(){
        for (int i = 0; i <20 ; i++) {
            dao.create(new Flight((int)(Math.random()*10+1),"Baku",ldt.of(2020,(int)(Math.random()*11)+1,(int)(Math.random()*27)+1,(int)(Math.random()*11)+1,(int)(Math.random()*59)+1)));

        }
    }
}
