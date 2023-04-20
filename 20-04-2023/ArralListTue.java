/*Write a java program to create an ArrayList (Name of Vehicles) with 10 elements and do the following things:

1. Print the arraylist.

2. Iterate through the Array List and print the arraylist

3. Insert an element at start and end of arraylist.

4. retrieve an element at index number 4.

5. update the element at index number  7 with vehicle name XUV300.

6. Search for the element "verna" if it is found just print 'found the vehicle' else print 'not found'

7. Copy this arraylist to the new arraylist*/
package CollectionEaxmple;
import java.util.ArrayList;

public class ArralListTue {

	public static void main(String[] args) 
	{
		ArrayList <String> Vehicles=new ArrayList<String>();
		Vehicles.add("Car");
		Vehicles.add("bike");
		Vehicles.add("Bus ");
		Vehicles.add("Activa");
		Vehicles.add("airplane");
		Vehicles.add("Ship");
		Vehicles.add("truck");
		Vehicles.add("train");
		Vehicles.add("helicopter");
		Vehicles.add("boat");
		System.out.println(Vehicles);
		System.out.println("Iterating through the Vehicle List:");
	     for (String vehicle : Vehicles) {
	         System.out.println(vehicle);
	        }
	  // insert an element at the start and end of the ArrayList
	        Vehicles.add(0, "motorcycle");
	        Vehicles.add(Vehicles.size()-1, "caravan");
	        System.out.println("Vehicle List after adding elements: " + Vehicles);
	        String vehicleAtIndex4 = Vehicles.get(4);// // retrieve an element at index number 4
	        System.out.println("Element at index 4: " + vehicleAtIndex4);
	        Vehicles.set(7, "XUV300");// update the element at index number 7 with vehicle name XUV300
	        System.out.println("Vehicle List after updating element: " + Vehicles);
	        
	        if (Vehicles.contains("verna")) //  // search for the element "verna"
	        	{
	        	
	            System.out.println("Found the vehicle");
	        } else {
	            System.out.println("Not found");
	        }

	     // copy the ArrayList to a new ArrayList
	        ArrayList<String> newVehicleList = new ArrayList<>(Vehicles);
	        System.out.println("New Vehicle List: " + newVehicleList);
		

	}

}
