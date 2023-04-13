//Create two thread.one thread is finding average of 
//first 50 numbers and other thread is printing square of number  
//store in array arr={10,15,20,25,30}. program in java


package Pack1;

public class Average //create a class Average
{

	    private static final int[] arr = {10, 15, 20, 25, 30};//Create array
	    
	    public static void main(String[] args) {
	        Thread averageThread = new Thread(new AverageThread());
	        Thread squareThread = new Thread(new SquareThread());
	        
	        averageThread.start();
	        squareThread.start();
	    }
	    
	    private static class AverageThread implements Runnable {
	        public void run() {
	            int sum = 0;
	            for (int i = 1; i <= 50; i++) {
	                sum += i;
	            }
	            float average = (float) sum / 50;
	            System.out.println("The average of the first 50 numbers is " + average);
	        }
	    }
	    
	    private static class SquareThread implements Runnable {
	        public void run() {
	            for (int i = 0; i < arr.length; i++) {
	                int square = arr[i] * arr[i];
	                System.out.println(arr[i] + " squared is " + square);
	            }
	        }
	    }
	}


