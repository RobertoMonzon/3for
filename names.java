import java.util.Scanner;

public class names {
	 public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        String  name;
	        System.out.print("Write your name please: ");
	        name= console.nextLine();
	        int name_len= name.length();
	        
	        for( int pos=0;pos < name_len ;  pos++) {
	        	System.out.println(name.charAt(pos));
	        	
	        	
	        }
	        }
}
