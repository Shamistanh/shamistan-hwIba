package HW9.Main;

import HW9.DAO.CollectionFamilyDAO;
import HW9.Services.FamilyService;
import HW9.entity.Human;

public class FamilyApp {
    public static void main(String[] args) {
        CollectionFamilyDAO cfd = new CollectionFamilyDAO();
        FamilyService fs = new FamilyService(cfd);

        fs.createNewFamily(new Human("Sffd","dfdfdf"),new Human("rere","frfrfr"));
        System.out.println(fs.getAllFamilies());
    }
}
