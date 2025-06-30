package StaticAndFinal.Challeng1;

import java.time.Year;

public class GenerateStudentRollNo
{
    private final String  rollno;
    private static int count=1;
    private String genrateRoll()
    {
        String rollno = "4BD" + (String.valueOf(Year.now().getValue()).substring(2)) + "IS"+ (String.format("%03d", count));
        count++;
        return rollno;
    }
    GenerateStudentRollNo()
    {
        rollno = genrateRoll();
    }
    public String getRollno()
    {
        return rollno;
    }

}
