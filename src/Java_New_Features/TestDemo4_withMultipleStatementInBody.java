package Java_New_Features;

public class TestDemo4_withMultipleStatementInBody 
{
	public static void main(String[] args) 
	{		
		Demo4 d4=()->{ System.out.println("Hi");
					System.out.println("Hello");
					System.out.println("GN");};
					
					d4.printStudentInfo();
	}
}
