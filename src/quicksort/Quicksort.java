package quicksort;

import java.util.Arrays;

public class Quicksort {

  
    public static void main(String[] args) {
        //sample array
        int[] a = {5,4,10,7,6,2,44,3,6,1,9,8,11,8,53,66,9};
        System.out.print("The array before sorting: ");
        System.out.println(Arrays.toString(a));
        System.out.print("The array after sorting: ");
        System.out.println(Arrays.toString(QuickSort(a, 0, 16)));
        
    }
    
    public static int[] QuickSort(int[] array, int p, int r){
        if(p < r){
            int q = Partition(array, p, r);
            QuickSort(array, p, q-1);
            QuickSort(array, q , r);
            
        }
        return array;
    }
    public static int Partition(int[] array, int p, int r){
        int x = array[r];
        int i = p - 1;
        for(int j = p; j <= r - 1; j++){
            if (array[j] <= x){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[r];
        array[r] = array[i + 1];
        array[i + 1] = temp;
        return i + 1;
    }
}
