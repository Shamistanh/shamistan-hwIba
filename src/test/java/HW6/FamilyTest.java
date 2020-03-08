package HW6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    private Family app;
    Human as;
    @BeforeEach
    void setUp() {
        app = new Family();
       as = new Human("Name", "Surname",17);
    }

    @Test
    void addChild() {
        Human [] test = new Human[1];
        test [0] = as;
        assertEquals(Arrays.deepToString(test), Arrays.deepToString(app.addChild(as)));
    }

    @Test
    void deleteChild() {
        app.addChild(as);
        Human [] test = new Human[0];
        assertEquals(Arrays.deepToString(test),Arrays.deepToString(app.deleteChild(as)));
    }

    @Test
    void testDeleteChild() {
        app.addChild(as);
        Human [] test = new Human[0];
        assertEquals(Arrays.deepToString(test),Arrays.deepToString(app.deleteChild(0)));
    }

    @Test
    void countFamily() {
        app.addChild(as);
        assertEquals(3, app.countFamily()); // father, mother and one child
    }
    @Test
    void countFamily2() {
        app.addChild(as);
        app.deleteChild(as);
        assertEquals(2, app.countFamily()); // only father and mother
    }
}