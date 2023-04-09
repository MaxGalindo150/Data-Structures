/*This is an algorithm to sort an array using the bubble sort method. 
Let's go through the array by making pair comparations between its adjacent elements 
untill the array has been sorted.*/

package JavaDS.SortingMethods;


public class BubbleSort{
    public static void main(String[] args) {
        int[] array = {6,2,1,3,7,4,5,8};

        bubbleSort(array);

    }

    public static void bubbleSort(int[] array){
        int i=0;
        boolean s = false;
        while (i<array.length && s == false){
            s = true;

            System.out.println("-----------------------------------------------------------------------");
            printArray(array);

            for (int j=0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                   swap(array, j, j+1);
                   s = false;
                   System.out.println("Exchanging: " + array[j] + " and " + array[j+1]);
                }
            }
            i++;
        }
    }

    public static void printArray(int[] array){ 
        for (int i=0; i<array.length; i++){
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();
    }

    private static void swap(int[] array, int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }

}