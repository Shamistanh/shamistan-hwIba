package March18;
import java.util.Arrays;
import java.util.Random;

public class MergeApp {
    public static void main(String[] args) {
        int[] data1 = new Random().ints(10, 30).limit(20).sorted().toArray();
        int[] data2 = new Random().ints(10, 30).limit(20).sorted().toArray();
        int[] data3 = merge(data1, data2);
        System.out.println(Arrays.toString(data1));
        System.out.println(Arrays.toString(data2));
        System.out.println(Arrays.toString(data3));
    }

    private static int[] merge(int[] data1, int[] data2) {
        int j=0;
        int data3 [] = new int [data1.length+data2.length];
        for (int i = 0; i < data3.length; i++) {
            if(i<data1.length){
                data3[i]=data1[i];

            }
            else if(i>=data1.length){
                data3[i]=data2[j];
                j++;
            }
        }
        return data3;
    }
}
