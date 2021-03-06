package HW6;

import java.util.Arrays;
import java.util.Objects;

public class Family {


    private Human[] children = new Human[0];
    private Pet pet;
    private Human mother;
    private Human father;


    public Family(Human[] children, Pet pet, Human mother, Human father) {
        this.children = children;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Family() {

    }

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


    public Human[] addChild(Human child) {
        Human[] chldrn = new Human[children.length + 1];
        chldrn[children.length] = child;
        for (int i = 0; i < children.length; i++) {
            chldrn[i] = children[i];
        }
        this.children = chldrn;
        return children;
    }

    public Human[] deleteChild(Human child) {
        int j = 0;
        if (children.length > 1) {
            Human[] humn = new Human[children.length - 1];
            for (Human el : children) {
                if (!el.equals(child)) {
                    humn[j] = el;
                    j++;
                }
            }
            children = humn;
        }

        return children;
    }

    public Human[] deleteChild(int index) {
        int j = 0;
        if (index > 0 && index < children.length) {
            Human[] humn = new Human[children.length - 1];
            for (int i = 0; i < children.length; i++) {
                if (index != i) {
                    humn[j] = children[i];
                    j++;
                }
            }
            children = humn;
        } else {
            throw new IndexOutOfBoundsException("Please enter the correct index");
        }

        return children;
    }

    public String greetPet() {
        return "Hello, " + pet.getNickname();
    }

    public String describePet() {

        if (pet.getTricklevel() > 50) {
            return "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is very sly";
        } else {
            return "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is almost not sly";
        }

    }


    public int countFamily() {
        int cnt = 2; // father and mother
        cnt = cnt + children.length;

        return cnt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet) &&
                Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father);
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
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.deepToString(children) +
                '}';

    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Family class");
    }
}
