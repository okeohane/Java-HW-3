/*
Plays a variation of the dice game Craps
*/

package javaapplication3;
public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        int firstRoll = getDice();
        int secondRoll = getDice();
        int sum = firstRoll + secondRoll;
        System.out.println("You rolled " + firstRoll + " + " + secondRoll + " = " + sum);
        if(sum == 2 || sum == 3 || sum == 12)   //lose
        {
            System.out.println("You lose");
        }
        else if(sum == 7 || sum == 11)  //natural = win
        {
            System.out.println("You win");
        }
        else
        {
            System.out.println("point is " + sum);
            
            int first, second, newSum;
            boolean cont = true;    //decides when to keep rolling or stop
            while(cont)
            {
                first = getDice();
                second = getDice();
                newSum = first + second;
                System.out.println("You rolled " + first + " + " + second + " = " +newSum);
                
                if(newSum == sum)   //if same point value is rolled, you win
                {
                    System.out.println("You win");
                    cont = false;
                }
                else if(newSum == 7)    //if seven is rolled, you lose
                {
                    System.out.println("You lose");
                    cont = false;
                }
            }
        }
    }
    public static int getDice()
    {
        int diceRoll = ((int)(Math.random()*6)) + 1;    //returns number [1, 7)
        return diceRoll;
    }
}
