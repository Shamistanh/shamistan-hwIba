package HW9.DAO;

import HW9.entity.Family;
import HW9.entity.Human;
import StepProjectTRY4.entity.Flight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static StepProjectTRY4.util.RandomData.*;
import static StepProjectTRY4.util.RandomData.randomSeats;

public class CollectionFamilyDAO {
    public final DAO<Family> family;

    public CollectionFamilyDAO(){
        this.family = new FamilyDao<>("family.bin");


        if(family.getAllFamilies().isEmpty()){createInitialData();}
    }

    private void createInitialData() {
        List<Family> family = IntStream.range(0, 20).mapToObj((n) -> new Family(
             new Human("errerer","dfdfdfdf"),
                new Human("rtrtrtrttrt","bvbvbbnnnbvbbb")

        )).collect(Collectors.toList());
        family.forEach(f -> this.family.create(f));
    }

    List<Family> lf;
}
