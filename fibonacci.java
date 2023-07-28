
	import java.util.Scanner;

	public class fibonacci
	{
	    public static void main(String[] args)
	    {
	    	 Scanner console = new Scanner(System.in);
		        int val;
		        
		        System.out.print("Enter any positive integer: ");
		        val = console.nextInt();

	    	int lim=0;
	        int num=0;
	        int num2=1;
	        int sum= 0;
	        
        	System.out.println("0");
        	System.out.println("1");
        	

	        while(lim <val) {
	        	lim++;
	        	sum= num2+num;
	        	num = num2;
	        	num2=sum;
	        	System.out.println(num2);
	        	
	        }
	        
	       //TODO implement While loop to get print result
	    }
	}