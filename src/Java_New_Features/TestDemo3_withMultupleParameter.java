package Java_New_Features;

public class TestDemo3_withMultupleParameter 
{
	public static void main(String[] args) {
		
		Demo3 d3=(n1,n2)-> n1*n2;
		System.out.println("Multiplication of 2 Num:-"+d3.mul(5, 6));			
	}
}
