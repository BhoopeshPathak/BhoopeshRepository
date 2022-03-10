package codingPrectice1;

public class BpMethod {
	public void method()
	{
		this.method3(4,6,8);
		System.out.println("default method");
	}
	public void method1(int a)
	{
		this.method();
		System.out.println("one parameterised method");
		
	}
	public void method2(int a, int b)
	{
		this.method1(7);
		System.out.println("two parameterised method");
	}
	public void method3(int a, int b, int c)
	{
		
		System.out.println("three parameterised method");
	}
	public void method4(int a, int b, int c)
	{
		this.method2(10, 11);
		System.out.println("four parameterised method");
	}
	public static void main(String[] args) {
		BpMethod obj = new BpMethod();
		obj.method4(12, 14, 16);
	}

}
