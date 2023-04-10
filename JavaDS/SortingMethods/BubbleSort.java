/*This is an algorithm to sort an array using the bubble sort method. 
Let's go through the array by making pair comparations between its adjacent elements 
untill the array has been sorted.*/

package JavaDS.SortingMethods;


public class BubbleSort{
    public static void main(String[] args) {
        int[] array = {6,2,1,3,7,4,5,8}; // creating my array

        bubbleSort(array); //implementing the bubble sort method

    }

    public static void bubbleSort(int[] array){ //Bubble sort method
        
        int i=0; //counter
        boolean s = false; // boolean variable to know when have to stop

        while (i<array.length && s == false){
            
            s = true; /* Changing the boolean varibale state to avoid getting into the while-loop, 
                         if there is a comparision to perform we again chage the variable state at line 36*/ 

            //System.out.println("-----------------------------------------------------------------------");
            //printArray(array);
            for (int j=0; j<array.length-i-1; j++){
                
                System.out.println("-----------------------------------------------------------------------");
                printArray(array); //checking the array state
                
                if(array[j]>array[j+1]){ // comparing each adjacent element of the array
                   System.out.println(array[j] + " and " + array[j+1] + " were exchaged"); //printing which elements were exchanged
                   swap(array, j, j+1); // this method exchanges the corresponding elements
                   s = false; //changing the variable state to get into the while-loop
                }
            }
            i++; //incrementing the counter
        }
    }

    public static void printArray(int[] array){ // This method prints the array elements  
        for (int i=0; i<array.length; i++){
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();
    }

    private static void swap(int[] array, int a, int b) { //This method exchanges the correspondig elements
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }

}