package basics;

public class Arrays {
    public static void main(String[] args) {

        int arr[] = new int[20];    // the number of slots in the
        
        // Array = Very big bucket, having multiple slots

        arr[1] = 4;
        arr[0] = 3;
        arr[2] = 5;
        arr[3] = 10;

        // the minimum index of the array will be 0
        // the maximum index of the array will be length of array -1

        System.out.println(arr[1]);

        int arr1[] = new int[]{1,2,3,4};
        System.out.println(arr1[2]);

        // integer arrays are initialized with 0.

        String arr2[] = new String[4];
        arr2[0]="hello";
        arr2[1]="Siddharth";
        arr2[2]="Good Morning";

        System.out.println(arr2[2]);

    }
}
