/*
Implements the Babylonian method to find the square root of a number
  nextGuess = (lastGuess + n / lastGuess) / 2 
*/

package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        
        System.out.printf("The square root of %.4f is %.4f \n", num, sqrt(num));
    }
    
    public static double sqrt(double n)
    {
        double threshold = .0001;   //initialize threshold
        double difference = .1;  //initialize difference between next and last so loop starts
        
        double nextGuess = n/2; //initialize first guess as number/2
        double lastGuess = n;   //initialize last guess as number
        
        while(difference >= threshold)   //when difference <= thresh loop will stop
        {
            nextGuess = (lastGuess + (n/lastGuess))/2;  //Babylonian equation
            difference = Math.abs(nextGuess - lastGuess);   //calculates new difference
            lastGuess = nextGuess;  //if difference isn't less than threshold, update and continue
        }
        return nextGuess;
    }
}
