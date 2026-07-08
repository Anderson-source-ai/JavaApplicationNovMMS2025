import java.util.Scanner;


public class MethodOverloading{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		MethodOverloading mo1 = new MethodOverloading();
		
		System.out.println("Calculating the perimeter of different shapes");
		System.out.println("Enter 1: for Square");
		System.out.println("Enter 2: for Rectangle");
		System.out.println("Enter 3: for Circle");
		System.out.println("Enter 4: for Trapezium");
		System.out.println("Enter 5: to Exit");
		System.out.println("***********************************");
		System.out.println("");
		
		System.out.printf("Enter your choice: ");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
			        System.out.println("You want to calculate the perimeter of a Square");
					
					System.out.print("Please enter the length of the square: ");
					int lengthOfSquare = scan.nextInt();
					
					System.out.printf("The perimeter of the Square is %d%n", mo1.perimeter(lengthOfSquare));
			break;

            case 2:
			        System.out.println("You want to calculate the perimeter of a Rectangle");
					
					System.out.print("Please enter the length of the Rectangle: ");
					int lengthOfRect = scan.nextInt();
					
					System.out.print("Please enter the breadth of the Rectangle: ");
					int breadthOfRect = scan.nextInt();
					
					System.out.printf("The perimeter of the Rectangle is %d%n", mo1.perimeter(lengthOfRect,breadthOfRect));
			break;
            
            case 3:
			        System.out.println("You want to calculate the perimeter of a Circle");
					
					System.out.print("Please enter the radius of the Circle: ");
					double radius = scan.nextInt();
					
					System.out.printf("The perimeter of the Circle is %f%n", mo1.perimeter(radius));
            break;
			
			case 4:
			        System.out.println("You want to calculate the perimeter of a Trapezium");
					
					System.out.print("Please enter the side1 of a Trapezium: ");
					int side1 = scan.nextInt();
					
					System.out.print("Please enter the side2 of a Trapezium: ");
					int side2 = scan.nextInt();
					
					System.out.print("Please enter the side3 of a Trapezium: ");
					int side3 = scan.nextInt();
					
					System.out.print("Please enter the side4 of a Trapezium: ");
					int side4 = scan.nextInt();
					
					System.out.printf("The perimeter of the Trapezium is %d%n", mo1.perimeter(side1,side2,side3,side4));
			break;		
			default:
                    System.out.println("Program exited, Bye for now............");
					
		}	
		
	}

	public int perimeter(int length){
		int per = 4*length;
		return per;
    }
	
	public int perimeter(int length, int breadth){
		int per = 2*(length + breadth);
		return per;
    }
	
	public double perimeter(double radius){
		double per = 2* Math.PI * radius;
		return per;
		
    }
	
	public int perimeter(int side1, int side2, int side3, int side4){
		int per = side1 + side2 + side3 + side4;
		return per;
    }
}