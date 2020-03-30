package HW8;


import java.util.*;

public class Family {
    private Human hmn = new Human();
    private Human mother = new Human();
    private List<Human> children = new ArrayList<>();




    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

//    public Pet getPet() {
//        return pet;
//    }
//
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }





    public List<Human> addChild(Human child){
        List<Human> adc = new ArrayList<>();
        if(!children.isEmpty()){
            adc.addAll(children);
        }
        adc.add(child);
        children=adc;

        return children;
    }

    public List<Human> deleteChild(Human child){
         children.remove(child);
         return children;
    }
    public List<Human> deleteChild(int index){
        if(!children.isEmpty()  && index < children.size()){
            children.remove(index);
        }

      return children;
    }
    public int countFamily(){
        int cnt=2; // father and mother
        cnt=cnt+children.size();

        return cnt;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(hmn, family.hmn) &&
                Objects.equals(mother, family.mother) &&
                Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hmn, mother, children);
    }


    @Override
    public String toString() {
        return "Family{" +
                "hmn=" + hmn +
                ", mother=" + mother +
                ", children=" + children +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Family class");
    }
}
