package LogicalProgram;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentData1 
{
    public static void main(String[] args) 
    {
    	Scanner scan=new Scanner(System.in);
        
        Map<String, Map<String, Double>> studentData = new HashMap<>();    

        List<String> subjects = new ArrayList<>();
        subjects.add("sub1");
        subjects.add("sub2");
        subjects.add("sub3");

        
        System.out.print("enter no Students: ");
   	 	int totalStudents = scan.nextInt();
        
        for(int i=0; i<totalStudents; i++)
        {
        	 System.out.print("enter student "+(i+1)+" Name: ");
        	 String sname = scan.next();
        	
        	 Map<String, Double> subMarks=new HashMap<String, Double>();
        	 
        	 for(String sub:subjects)
        	 {
        		 System.out.print("Enter marks for subject "+sub+": ");
        		  double mark = scan.nextDouble();
        		 subMarks.put(sub, mark);
        	 }
        	 studentData.put(sname, subMarks);
        }
        
       
             
        
      Set<String> Snames = studentData.keySet();
      
      System.out.print("enter student name to find marks:-");
      String expSName = scan.next();
      
      for(String name:Snames)
      {
    	  if(name.equalsIgnoreCase(expSName))
    	  {
    		  System.out.print("enter sub name:-");
    	      String ExpSubName = scan.next();
    		  
    		  Map<String, Double> data = studentData.get(name);
    		  Set<String> allSuBName = data.keySet();
    		  for(String sub:allSuBName)
    		  {
    			  if(sub.equalsIgnoreCase(ExpSubName))
    			  {
    				  System.out.println(sub+" : "+data.get(sub));
    			  }
    		  }   		  
    	  }  	  
      }
       
        
        
      scan.close();
    
    }
}