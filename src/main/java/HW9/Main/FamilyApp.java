package HW9.Main;

import HW9.DAO.CollectionFamilyDAO;
import HW9.Services.FamilyService;

public class FamilyApp {
    public static void main(String[] args) {
        CollectionFamilyDAO cfd = new CollectionFamilyDAO();
        FamilyService fs = new FamilyService(cfd);
    }
}
