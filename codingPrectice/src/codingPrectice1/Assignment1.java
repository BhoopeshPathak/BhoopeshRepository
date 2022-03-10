package codingPrectice1;

public class Assignment1
{
	public int divide(int d1, int d2)
	{
		int d3=d1/d2;
		return d3;
		
	}
	public int multiply(int m1, int m2)
	{
		int m3=m1*m2;
		return m3;
	}
	public int addition(int a1, int a2)
	{
		int a3=a1+a2;
		return a3;
	}
	public int sub(int s1, int s2)
	{
		int s3=s1-s2;
		return s3;
	}
	public static void main(String[] args) {
		System.out.println("solve this arithmetic expression is (((25/5)*4)+2)-6)");
		Assignment1 obj=new Assignment1();
		int divideresult= obj.divide(25, 5);
		System.out.println("result of divide is:"+divideresult);
		
		int multiplyresult= obj.multiply(divideresult, 4);
		System.out.println("result of multiplication is:"+multiplyresult);
		
		int additionresult= obj.addition(multiplyresult, 2);
		System.out.println("result of addition is:" +additionresult);
		
		int subresult= obj.sub(additionresult, 6);
		System.out.println("result of subtraction is:"+subresult);
		
		System.out.println("end of the expression");
	}

}
