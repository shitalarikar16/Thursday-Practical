class Calculation{
 static int addition(int a,int b)
 {
    return a+b;
 }
 static int Substraction(int a,int b)
 {
    return a-b;
 }
 static int Multiplication(int a,int b)
 {
    return a*b;
 }
 static int Division (int a,int b)
 {
    return a/b;
 }
  
 
}
class Calculator1
{
 public static void main(String []args)
 {
   Calculation a=new  Calculation();
   System.out.println("Addition="+ Calculation.addition(10,20));
   System.out.println("Substraction="+Calculation.Substraction(10,2));
 System.out.println("Multiplication="+ Calculation.Multiplication(10,20));
 System.out.println("Division="+ Calculation.Division(10,20));
 
 }


}
