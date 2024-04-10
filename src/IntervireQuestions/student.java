package IntervireQuestions;

public class student
{
	int rollNum;
	String name;
	static String companyName="ITC";
	
	student(int a, String str)
	{
		rollNum=a;
		name=str;
	}
	
	public void studentdata()
	{
		System.out.println(rollNum+" "+name+" "+companyName);
	}
	
	

}
