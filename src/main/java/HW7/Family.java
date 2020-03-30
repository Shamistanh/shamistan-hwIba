package HW7;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human hmn = new Human();
    private Human mother = new Human();
    private Human[] children = new Human[0];

    public Family(Human hmn, Human mother, Human father, Human[] children) {
        this.hmn = hmn;
        this.mother = mother;
        this.children = children;
    }

    public Family() {

    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
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
        Human[] humn = new Human[children.length - 1];
        for (Human el : children) {
            if (!el.equals(child)) {
                humn[j] = el;
                j++;
            }
        }
        children = humn;
        return children;
    }

    public Human[] deleteChild(int index) {
        int j = 0;
        if (index > 0) {
            Human[] humn = new Human[children.length - 1];
            for (int i = 0; i < children.length; i++) {
                if (index != i) {
                    humn[j] = children[i];
                    j++;
                }
            }
            children = humn;
        } else {
            throw new IndexOutOfBoundsException("there is no child");
        }

        return children;
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
        return Objects.equals(hmn, family.hmn) &&
                Objects.equals(mother, family.mother) &&
                Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(hmn, mother);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "hmn=" + hmn +
                ", mother=" + mother +
                ", children=" + Arrays.deepToString(children) +
                '}';

    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Family class");
    }
}
