package LogicalProgram;
import java.util.*;
import java.util.Map.Entry;

public class StudentData 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, Map<String, Double>> studentData = new HashMap<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> subjects = new ArrayList<>();

        // store subject names
        for (int i = 0; i < numSubjects; i++) 
        {
            System.out.print("Enter name of subject " + (i + 1) + ": ");
            subjects.add(scanner.nextLine());
        }

        // store student data
        for (int i = 0; i < numStudents; i++)
        {
            Map<String, Double> studentMarks = new HashMap<>();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            // Input marks for each subject
            for (String subject : subjects) 
            {
                System.out.print("Enter marks for " + subject + ": ");
                double marks = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                studentMarks.put(subject, marks);
            }

            studentData.put(name, studentMarks);
        }

        // Displaying student data
        
       Set<Entry<String, Map<String, Double>>> alldata = studentData.entrySet();
        
        for (Map.Entry<String, Map<String, Double>> data : alldata) 
        {
            System.out.println("Student: " + data.getKey());
            System.out.println("Marks:");
            for (Map.Entry<String, Double> marksEntry : data.getValue().entrySet())
            {
                System.out.println(marksEntry.getKey() + ": " + marksEntry.getValue());
            }
            System.out.println();
        }

        scanner.close();
    }
}