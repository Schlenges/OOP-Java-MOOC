
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int num : array){
            if(num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int indexSmallest = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[indexSmallest]){
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexSmallest = index;
        
        for(int i = index; i < array.length; i++){
            if(array[i] < array[indexSmallest]){
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int copy1 = array[index1];
        
        array[index1] = array[index2];
        array[index2] = copy1;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        
        for(int i = 0; i < array.length; i++){
            int indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexSmallest);
            
            System.out.println(Arrays.toString(array));
        }
    }
  
}
