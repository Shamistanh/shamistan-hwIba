package HW5;

import java.util.Arrays;

public class Family {
    private Human hmn = new Human();
    private Pet pet = new Pet();
    private Human mother =hmn.getMother();
    private Human father = hmn.getFather();
    private Human [] children;

//    public Family(String name, String surname) {
//        this.name =name;
//        this.surname=surname;
//    }
//    public Family(Human mother, Human father, Pet pet, Human child){
//        this.mother=mother;
//        this.father=father;
//        this.pet=pet;
//    }


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

    public Human [] deleteChild(Human child){
        Human [] humn= new Human[80];
        int j=0;
        for (int i = 0; i <children.length; i++) {
            if(!child.equals(children[i])){
                humn[j]=children[i];
                j++;
            }
        }
        children=humn;
        return children;
    }

    public void addChild(Human child){
        Human [] chldrn = new Human[this.children.length+1];
        chldrn[this.children.length]=child;
        this.children=chldrn;
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
