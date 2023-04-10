package JavaDS.SortingMethods;


public class SelectionSort {

    public static void printArray(int[] array){ // This method prints the array elements  
        for (int i=0; i<array.length; i++){
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int[] array){
        
        
        int index;
        
        for (int i=0; i<array.length; i++){
            index = i;
            for (int j=i+1; j<array.length; j++){
                if (array[index]>array[j]){  
                    index = j;
                }     
            }
            swap(array, i, index);
        }

    }

    private static void swap(int[] array, int a, int b) { //This method exchanges the correspondig elements
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }


    
    public static void main(String[] args){

        int[] array = {4,96,45,79,10,1,5,7};
        
        selectionSort(array);
        printArray(array);    
    }
    
}
