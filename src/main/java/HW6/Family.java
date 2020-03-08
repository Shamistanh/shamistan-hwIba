package HW6;

import java.util.Arrays;

public class Family {
    private Human hmn = new Human();
    private Pet pet = new Pet();
    private Human mother =hmn.getMother();
    private Human father = hmn.getFather();
    private Human[] children = new Human[0];



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





    public Human [] addChild(Human child){
        Human[] chldrn = new Human[children.length+1];
        chldrn[children.length]=child;
        for (int i = 0; i <children.length ; i++) {
            chldrn[i]=children[i];
        }
        this.children=chldrn;
        return children;
    }

    public Human[] deleteChild(Human child){
        int j=0;
        Human [] humn = new Human[children.length-1];
      for(Human el: children){
          if(!el.equals(child)){
              humn[j]=el;
              j++;
          }
      }
      children=humn;
        return children;
    }
    public Human[] deleteChild(int index){
        int j=0;
        Human [] humn = new Human[children.length-1];
        for (int i = 0; i <children.length ; i++) {
            if(index!=i){
                humn[j]=children[i];
                j++;
            }
        }
        children=humn;
        return children;
    }
    public int countFamily(){
        int cnt=2; // father and mother
            cnt=cnt+children.length;

        return cnt;
    }


    @Override
    public int hashCode() {
        return (int)(Math.random()*3+children.length);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Family{" +
                "hmn=" + hmn +
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
