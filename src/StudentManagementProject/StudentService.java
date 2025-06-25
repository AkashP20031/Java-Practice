package StudentManagementProject;

import java.util.List;
import java.util.Scanner;

public class StudentService {

    public static Student addStudent(){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter the RollNo of student : ");
        s.setRollNo(sc.nextInt());
        System.out.println("Enter the Name of student : ");
        s.setName(sc.next());
        System.out.println("Enter the Age of student : ");
        s.setAge(sc.nextInt());
        System.out.println("Enter the Class of student : ");
        s.setStandard(sc.next());
        System.out.println("Enter the Section of student : ");
        s.setSection(sc.next());
        return s;
    }

    public static void displayStudent(List<Student> students)
    {
        for (Student s : students)
        {
            System.out.println(s);
        }
    }
    public static void deleteStudent(List<Student> students)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the RollNo of student to Delete : ");
        int rollNo = sc.nextInt();
        int count = 0;
        for (Student s : students)
        {
            if(s.getRollNo() == rollNo )
            {
                break;
            }
            count++;
        }
        try {
            students.remove(count);
            System.out.println("Student deleted successfully...");
        }catch (Exception e)
        {
            System.out.println("Roll No Does no exist");
        }

    }

    public static void updateStudent(List<Student> students)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the RollNo of student : ");
        int rollNo = sc.nextInt();
        int count=0;
        for (Student s : students)
        {
            if(s.getRollNo() == rollNo )
            {
                break;
            }
            count++;
        }

        System.out.println("Enter the Name of student : ");
        String name = sc.next();
        System.out.println("Enter the Age of student : ");
        int age = sc.nextInt();
        System.out.println("Enter the Class of student : ");
        String standard = sc.next();
        System.out.println("Enter the Section of student : ");
        String section = sc.next();
        try {
            students.get(count).setName(name);
            students.get(count).setAge(age);
            students.get(count).setStandard(standard);
            students.get(count).setSection(section);
            System.out.println("Student Updated successfully...");
        }
        catch (Exception e)
        {
            System.out.println("Roll No Does no exist");
        }
    }
}
