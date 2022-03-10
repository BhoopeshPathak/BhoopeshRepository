package codingPrectice1;

public class Bhoopesh {
	public int multiply(int x, int y)
	{
		int z=x*y;
		return z;
		
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public int add(int i, int j)
	{
		int k=i+j;
		return k;
	}
	public static void main(String[] args) {
		Bhoopesh obj=new Bhoopesh();
		System.out.println("solve the expression is ((7*8)-32)+44)" );
		int multiplyResult = obj.multiply(7, 8);
		System.out.println("result of multiply is:" +multiplyResult);
		
		int subResult = obj.sub(multiplyResult, 32);
		System.out.println("reult of subtraction is:" +subResult);
		
		int sumResult = obj.add(subResult, 44);
		System.out.println("final result is:" +sumResult);
	}

}
