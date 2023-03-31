 class Rectangle {
	 
	 int lenght,breadth;
	 
	 void areaOfRectangle()
	 {
		 int area= lenght*breadth;
		 System.out.println("Are of Rectangle is :" +area);
		 
		 
	 }
	 void PerimeterofRectangle()
	 {
		 int perimeter=2*lenght+2*breadth;
		 System.out.println("perimeter of Rectangle is :" +perimeter);
		 
		 
	 }
	 public Rectangle(int lenght,int breadth)
	 {
		 
		 this.lenght=lenght;
		 this.breadth=breadth;
	 }
 }
 class Rectangle1
 {
	 public static void main(String [] args)
	 {
		 Rectangle r1=new Rectangle(5,9);
		 r1.areaOfRectangle();
		 r1.PerimeterofRectangle();
		  
	 }
	 
 }