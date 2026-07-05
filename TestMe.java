public class TestMe{
	public static void main(String[] args){
		InstanceMethod test = new InstanceMethod();
		
		System.out.println(test.addNumber(90,20,38));
		System.out.println(StaticMethod.addNumber(72,61,73));
	}
}