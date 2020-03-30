package HW9.DAO;

import HW9.entity.Family;

import java.util.List;

public class CollectionFamilyDAO {
    public final DAO<Family> family;

    public CollectionFamilyDAO(){
        this.family = new FamilyDao<>("family.bin");
    }

    List<Family> lf;
}
