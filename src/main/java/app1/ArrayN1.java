package app1;

public class ArrayN1 {
    public static void main(String[] args) {
        int arr [][]=new int[7][12];
        int k=0;
        int z=0;
        int i=0;
        int j=0;
        for (i = 0; i <arr.length ; i++) {
            for (j = 0; j <arr[i].length/2 ; j++) {
            arr[i][j]=j;

            }
            k=j;
            for ( j =arr[i].length/2 ; j<arr[i].length;j++) {
                arr[i][j]=k;
                k--;

            }

        }



        for (i = 0; i <arr.length ; i++) {
            for (j = 0; j <arr[i].length ; j++) {

                System.out.print( arr[i][j]+" ");

            }
            System.out.println();

        }
    }
}
