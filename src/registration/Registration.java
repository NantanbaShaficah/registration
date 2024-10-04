package registration;
import java.util.Scanner;  // This lets us get input from the user

public class Registration {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int numOfUsers = 3;
		        
		        
		        String[] names = new String[numOfUsers];
		        String[] emails = new String[numOfUsers];
		        String[] passwords = new String[numOfUsers];
		        
		        Scanner scanner = new Scanner(System.in);
		        for (int y = 0; y < numOfUsers; y++) {
		            System.out.println("Register person " + (y + 1) + ":");
		    
		            System.out.print("Enter your name: ");
		            names[y] = scanner.nextLine();
		          
		            System.out.print("Enter your email: ");
		            emails[y] = scanner.nextLine();
		            
		            System.out.print("Enter your password: ");
		            passwords[y] = scanner.nextLine();
		            
		            System.out.println("You have successfully registered!");
		        }
		        System.out.println("Here are the registered people:");
		        for (int y = 0; y < numOfUsers; y++) {
		            System.out.println("Person " + (y + 1) + ":");
		            System.out.println("Name: " + names[y]);
		            System.out.println("Email: " + emails[y]);
		            System.out.println("-----------------------");
		        }
		        scanner.close();
		    }
		
	}


