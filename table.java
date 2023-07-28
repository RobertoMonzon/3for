
	import java.util.Scanner;

	public class table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	        int mult= 1;
	        while(mult <10) {
	        	mult++;
	        	System.out.println("Multiplication Table of " + num +" x " + mult +" = " + (num*mult));
	        }
	        
	       //TODO implement While loop to get print result
	    }
	}