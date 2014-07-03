import java.util.Scanner;

public class TestScanner {

	 
	  
	 public static void main(String [] args) {
		 
		 printMessage();
		 
		 String name = inputName();
		 
		 System.out.println(name);
		 
	}


	private static String inputName() {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 String name1 = in.next(); 
		 return name1;
	}


	private static void printMessage() {
		// TODO Auto-generated method stub
		System.out.println ("Enter your name");
	}
}

//testing changes