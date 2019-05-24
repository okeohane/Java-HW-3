/*
Displays the palindromic prime numbers less than 1000
A palindromic prime is both a prime number and a palindromic number
*/

package javaapplication2;
import java.util.Scanner;

//find reverse of number
//compare reverse to original

public class JavaApplication2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("All palindromic prime numbers from 1-"+number);
        
        int rowCount = 0;
        for(int i = 2; i <= number; i++)
        {
            if(isPrime(i) && isPalindrome(i))
            {
                System.out.print(i + " ");
                rowCount++; //add one more number to the row
            }
            if(rowCount == 5)    //when a row has 5 numbers in it
            {
                System.out.println();
                rowCount = 0;    //reset numbers in each row to 0;
            }
        }
        System.out.println();
    }
    
    public static boolean isPrime(int num)
    {
        for(int i = 2; i < num; i++)    //start at 2 and end one before given number
        {
            if(num!=2 && num%i == 0)
                return false;    //if the number can be divided by another number != 1 or itself
            else
                continue;
        }
        return true;
    }
    public static boolean isPalindrome(int num)
    {
        //find reverse of number using %
        int reverse = 0;
        int original = num;
        while(num!=0)
        {
            int lastNum = num%10;
            num /= 10;
            
            reverse = reverse*10 + lastNum;
        }
        
        if(original == reverse)
            return true;
        else
            return false;
    }
}
