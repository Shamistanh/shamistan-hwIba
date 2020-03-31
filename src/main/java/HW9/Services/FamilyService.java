package HW9.Services;

import HW9.DAO.CollectionFamilyDAO;
import HW9.entity.Family;
import HW9.entity.Human;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FamilyService {
    private final CollectionFamilyDAO cfd;

    public FamilyService(CollectionFamilyDAO cfd) {
        this.cfd = cfd;
    }

    public Collection<Family> getAllFamilies(){
        return cfd.family.getAllFamilies();
    }
    public String displayAllFamilies(){
        return Arrays.toString(cfd.family.getAllFamilies().toArray());
    }

    public Collection<Family> getFamiliesBiggerThan(int n){
        return cfd.family.getAllFamilies().stream().filter(f->f.countFamily()>n).collect(Collectors.toList());
    }
    public Collection<Family> getFamiliesLessThan(int n){
        return cfd.family.getAllFamilies().stream().filter(f->f.countFamily()<n).collect(Collectors.toList());
    }
    public int countFamiliesWithMemberNumber(Family fm){
        return fm.countFamily();
    }

    public void createNewFamily(Human hm1, Human hm2){
        cfd.family.create(new Family(hm1, hm2));
    }

    public void deleteFamilyByIndex(int idx){
        cfd.family.deleteFamily(idx);
        System.out.println("Famil deleted successfully");
    }

    public Collection<Family> getFamilyById(int id){
        return cfd.family.getFamilyByIndex(f->f.getId()==id);
    }
}
