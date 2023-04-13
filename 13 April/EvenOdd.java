//Write a program to create thread. Where you will take the input from the user and
//find if the number is odd or even.



package Pack1;

import java.util.Scanner;

class EvenOdd extends Thread //create a class Evenodd 
{
    private int number; //decalre variable num
    
        EvenOdd(int number) { 
        this.number = number;
    }
    
    public void run() { 
        if (number % 2 == 0)//calculate evenodd
        {
            System.out.println(number + " is even.");//no.is even
        } else {
            System.out.println(number + " is odd."); //no.is odd
        }
    }
    
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);//input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        EvenOdd thread = new EvenOdd(number);
        thread.start();
    }
}


