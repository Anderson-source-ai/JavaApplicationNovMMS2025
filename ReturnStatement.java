public class ReturnStatement{
	public static void main(String[] args){
		System.out.println("The area of the rectangle is " + areaOfRectangle(7,20));
		System.out.println("The area of the rectangle is " + areaOfRectangle(76,20));
		System.out.println("The area of the rectangle is " + areaOfRectangle(20,1000));
		System.out.println("The area of the rectangle is " + areaOfRectangle(90,20));
		System.out.println("The area of the rectangle is " + areaOfRectangle(30,20));
		System.out.println("The area of the rectangle is " + areaOfRectangle(99,15));
	}
	
	public static int areaOfRectangle(int length , int breadth){
		int area = length * breadth;
		
		return area;
		
	}
}