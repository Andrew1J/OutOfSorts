public class Sorts{
    /**Bubble sort of an int array.
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data){
        boolean sorted = false;
        for(int i=0;i<data.length-1 && !sorted;i++){
            sorted = true;
            for(int j=1;j<data.length-i;j++){
                if(data[j-1]>data[j]){
                    int temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                    sorted = false;
                }
            }
        }
    }
}
