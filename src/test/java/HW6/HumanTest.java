package HW6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human as;
    @BeforeEach
    void setUp() {
      //  as=new Human("Salam","sasasasas",70,new Human("fdfdf","fdfdfd",52),new Human("weerererf","zxzxzx",45),80, new Pet(Species.ROCK,"rock0",5,120,new String[]{"eat","fdfdfdf"}),new String[][]{{"tgy"},{"ghbnj"}});

    }

    @Test
    void greetPet() {
        assertEquals("I have a ROCK, he is 5 years old, he is very sly", as.describePet());
    }

    @Test
    void describePet() {
        assertEquals("Hello, rock0", as.greetPet());
    }
}