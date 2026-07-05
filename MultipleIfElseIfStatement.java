import java.util.Scanner;

public class MultipleIfElseIfStatement{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your fullname: ");
		String fullname = scan.nextLine();
		
		System.out.print("enter your mark: ");
		int mark = scan.nextInt();
		
		if(mark >= 70){
			System.out.println("===========================\n");
			System.out.printf("Student name: %s%n",fullname);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.println("Student grade: A");
			System.out.println("===========================\n\n");
		}
		else if(mark >=60){
			System.out.println("===========================\n");
			System.out.printf("Student name: %s%n",fullname);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.println("Student grade: B");
			System.out.println("===========================\n\n");
		}
		else if(mark >=50){
			System.out.println("===========================\n");
			System.out.printf("Student name: %s%n",fullname);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.println("Student grade: C");
			System.out.println("===========================\n\n");
		}
		else if(mark >=40){
			System.out.println("===========================\n");
			System.out.printf("Student name: %s%n",fullname);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.println("Student grade: D");
			System.out.println("===========================\n\n");
		}
		else{
			System.out.println("===========================\n");
			System.out.printf("Student name: %s%n",fullname);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.println("Student grade: F");
			System.out.println("===========================\n\n");
		}
	}
}	
    