import java.util.Arrays;
import java.util.Random;
public class Tester{
    public static void main(String[]args){
        int[] testarr = new int[]{8,3,5,7,1,2,3};
        Sorts.bubbleSort(testarr);
        for(int i=0;i<testarr.length;i++){
            System.out.print(testarr[i]+" ");
        }
        System.out.println();

        Random rng = new Random();
        int[]arr1 = new int[1000];
        int[]arr2 = new int[1000];
        for(int i=0;i<1000;i++){
            arr1[i] = arr2[i] = rng.nextInt();
        }
        Sorts.bubbleSort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("It works");
        } else {
            System.out.println("It doesn't work");
        }
    }
}
