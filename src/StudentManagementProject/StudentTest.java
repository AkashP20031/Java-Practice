package StudentManagementProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;


public class StudentTest {
    public static void main(String[] args) throws Exception{
        List<Student> studentList = new ArrayList<>();
        while (true)
        {
            System.out.println("----Student Management Project----- ");
            System.out.println("1.Add Student Details\n2.Display Student Details \n3.Update Student Details \n4.Delete Student Details \n5.Exit");
            System.out.println("Enter the Valid Option for Actions : ");
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
            switch (opt)
            {
                case 1 : Student s = StudentService.addStudent();
                         studentList.add(s);
                         System.out.println("Student added successfully...");
                         break;
                case 2 : StudentService.displayStudent(studentList);
                         break;
                case 3 : StudentService.updateStudent(studentList);

                         break;
                case 4 : StudentService.deleteStudent(studentList);

                         break;
                case 5 : exit(0);
                default: throw new IllegalArgumentException();
            }

        }
    }
}
