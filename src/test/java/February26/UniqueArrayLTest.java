package February26;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueArrayLTest {
    private NoDublicate task;
    @BeforeEach
    void setUp() {
        this.task = new UniqueArrayL();
    }
    @Test
    void filter1() {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(5);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(7);



        List<Integer> expected = Arrays.asList(1,3,5,7);
        ArrayList<Integer> actual = task.dublicateDel(arr1, arr2);
        assertEquals(expected, actual);
    }

    @Test
    void filter2() {
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(3);
        arr1.add(7);

        arr2.add(1);
        arr2.add(3);
        arr2.add(5);
        ArrayList<Integer> origin =  arr1;
        ArrayList<Integer> expected = arr2 ;
        ArrayList<Integer> actual = task.dublicateDel(origin, expected);
        assertEquals(expected, actual);
    }
}