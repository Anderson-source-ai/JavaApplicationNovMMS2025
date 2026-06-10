import java.util.Scanner;

public class UserInput{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String fullName = input.nextLine();
		
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		input.nextLine();
		
		System.out.print("Enter your Address: ");
		String address = input.nextLine();
		
		System.out.print("Enter number of students in your class: ");
		short numberOfStudent = input.nextShort();
		
		System.out.print("Enter number of students in your school: ");
		int studentInSchool = input.nextInt();
		
		System.out.print("Enter your gender (M/F): ");
		char gender = input.next().charAt(0);
		
		
		System.out.println("==================================\n\n");
		System.out.printf("Hello %s, you are welcome to NIIT%n",fullName);
		System.out.printf("%s you are %d years old%n",fullName,age);
		System.out.printf("%s your gender is %c%n",gender);
		System.out.printf("you are living in %s%n",address);
		System.out.printf("There are %d students in your class%n",numberOfStudent);
		System.out.printf("There are %,d students in your school%n",studentInSchool);
		
		
	}
	
}