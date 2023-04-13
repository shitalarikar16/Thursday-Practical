//. Write a program to take input of marks of 3 subjects from the user. Check 
//if the total of marks given by the user is greater than 50 else throw an exception 
//saying "You Failed". Or else print Grade is A if the total is greater than 280.
//Grade B if the total is greater than 200. 
//Grade C if the total is greater than 150.
//Grade D if the total is greater than 50.


package Pack1;
import java.util.Scanner;
public class Total//create class Total
 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//input from user
		System.out.print("Enter marks for Subject 1: ");
        int sub1 = input.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = input.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int sub3 = input.nextInt();
        int total = sub1 + sub2 + sub3;
        try   //try block
        {
        	if(total<=50) //check the condition
        	{
        		throw new Exception("You Failed"); //exception throw 
        	}
        	else {
        		 if(total > 280)
        		 {
        			 System.out.println("Grade A");
        		 }else if(total>200)
        		 {
        			 System.out.println("Grade B");
        		 }else if(total>150)
        		 {
        			 System.out.println("Grade C");
        		 }else if(total>50)
        		 {
        			 System.out.println("Grade D");
        		 }
        	}
        }
        catch(Exception e) {
        	 System.out.println(e.getMessage());
        }
	
	}

}
