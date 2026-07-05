import java.util.Scanner;


public class DoubleSelectionStatement{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Username: ");
		String userName = scan.nextLine();
		
		System.out.print("Enter Password: ");
		String passWord = scan.nextLine();
		
		
		if(passWord.equals("Admin1235") && userName.equals("john@williams")){
			System.out.println("Access Granted, you are welcome");
		}
		else{
			System.out.println("Incorrect password or username ");
		}
	}
}