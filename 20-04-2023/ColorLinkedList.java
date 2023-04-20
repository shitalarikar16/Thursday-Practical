/*Write a program to create a LinkedList(Colors) using collections in java and perform following operations on them:

1. Append "Red" at the end of the linked list

2. Iterate through all the elements of the linkedlist starting from the element 4

3. Iterate the linked list in the reverse order.*/

package CollectionEaxmple;
import java.util.LinkedList;

public class ColorLinkedList {

	public static void main(String[] args) {
		LinkedList <String> color=new LinkedList<String>();//Creating object
		color.add("Blue");  //add vehicles
		color.add("Pink");
		color.add("Black");
		color.add("yellow");
		System.out.println(color);
		color.addLast("Red");  //add one colorat the end of the linklist
		System.out.println(color);
		System.out.println("Iterating through the Color List from element 4:");//iterat the list from 4
	    for (int i=3; i<color.size(); i++) 
	    {
	   	System.out.println(color.get(i));
	    }
	    System.out.println("Iterating through the Color List in reverse order:");//iterrat the list and list in reverse order
        for (int i=color.size()-1; i>=0; i--)
        {
            System.out.println(color.get(i));
        }

	}

}
