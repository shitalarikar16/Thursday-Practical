/*Write a program to create HashMap (Key-Value) of Students and perform following operations on it:

1. Check if the map contains the mapping for specified key(105)

2. Count the number of key-value(size) mapping in a map.

3. Copy the mapping from specified map to another map*/

package CollectionEaxmple;
import java.util.HashMap;


public class StudentHashMap {

	public static void main(String[] args) {
	HashMap<Integer,String>  m1=new HashMap<Integer,String>();//creatinng object..
	m1.put(101,"Shital");  //put the data
	m1.put(102,"Shubham");
	m1.put(103,"Sandip");
	m1.put(104,"Manisha");
	System.out.println(m1);
	
	if(m1.containsKey(105))// check if the map contains the mapping for specified key(105)
	{
		System.out.println("Map Contain key 105");
	}
	else {
		
		System.out.println("Map Does not contain key 105");
		
	}
	int mapSize=m1.size(); //count the number of key-value(size) mapping in a map
	System.out.println(mapSize);
	
	HashMap <Integer,String> newm1=new HashMap<> (m1);//// copy the mapping from specified map to another map
	System.out.println(newm1);
	}

}
