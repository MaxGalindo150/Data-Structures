/* Problem 1: In a one-dimesional array, the total number of tons of cereals harvested over each 
month of the last year has been stored. Write a program that gets and prints the following information.
a) The annual average of harvested tons.
b) How many months did they have a harvest above the annual average?
c) How many months did they have a lower harvest than the annual average?
*/

import java.util.Arrays;

public class harvest
{
    public static void main(String[] args)
    {
        int[] tons;  // declare array named tons
        tons = new int[12]; // create the array object

        int ton, n, g, l; // declare number of tons
        double avr;

        n = tons.length;

        for (int i=0; i<n; i++)
        {
            ton =(int)(Math.random()*10+1); // create number ton

            tons[i] = ton;  //assinging each value
        }
        int sum = 0;

        for (int j=0; j<n; j++) //Add each element 
        {
            sum = sum + tons[j];
        }

        avr = sum/n; //Calculate the average

        g = 0;
        l = 0;

        for (int m=0; m<n; m++) 
        {
            if (tons[m]>avr)//count how many months have more tons than the average
            {
                g = g+1;
            }
            
            if(tons[m]<avr)//count how many months have less tons than the average
            {
                l = l+1;
            }

        }
        

        //Print results

        System.out.println("TONS PER MONTH (JAN-DIC):");
        System.out.println(Arrays.toString(tons) +"\n"); 

        System.out.println("AVERAGE: "+avr+"\n");

        System.out.println("a) "+g);
        System.out.println("b) "+l);    
    }
}