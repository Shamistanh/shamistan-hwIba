package HW5;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human hmn = new Human();
    private Pet pet = new Pet();
    private Human mother =hmn.getMother();
    private Human father = hmn.getFather();
    private Human [] children;

    public Family(Human hmn, Pet pet, Human mother, Human father, Human[] children) {
        this.hmn = hmn;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(){}

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }


    public Human[] deleteChild(Human child){
        int j=0;
        if(children.length>1){
            Human[] humn = new Human[children.length-1];
            for(Human el: children){
                if(!el.equals(child)){
                    humn[j]=el;
                    j++;
                }
            }
            children=humn;
        }

        return children;
    }

    public Human[] addChild(Human child){
        Human[] chldrn = new Human[children.length+1];
        chldrn[children.length]=child;
        for (int i = 0; i <children.length ; i++) {
            chldrn[i]=children[i];
        }
        this.children=chldrn;
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(pet, family.pet) &&
                Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pet, mother, father);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "hmn=" + hmn +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';
    }



    //    public Family(String name, String surname, Human []children) {
//        this.name =name;
//        this.surname=surname;
//        this.children=children;
//    }
}
