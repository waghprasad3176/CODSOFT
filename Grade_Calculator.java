import java.io.*;
import java.util.*;
public class GradeCalculator
{
int total,percent;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Your English Marks");
int m1=s.nextInt();
System.out.println("Enter Your Mathmatics Marks");
int m2=s.nextInt();
System.out.println("Enter Your Science Marks");
int m3=s.nextInt();
System.out.println("Enter Your Social Science Marks");
int m4=s.nextInt();
System.out.println("Enter Your Hindi Marks");
int m5=s.nextInt();

 total=m1+m2+m3+m4+m5;

}
void percentage()
{
percent=total/5;
System.out.println("Your  Total Percentage Are "+percent+"%");
}
void grade()
{
if(percent>=97)
{
System.out.println("A+ Grade");
}
else if(percent>=93 && percent<97)
{
System.out.println("A Grade");
}
else if(percent>=90 && percent<93)
{
System.out.println("A- Grade");
}
else if(percent>=87 && percent<90)
{
System.out.println("B+ Grade");
}
else if(percent>=83 && percent<87)
{
System.out.println("B Grade");
}
else if(percent>=80 && percent<83)
{
System.out.println("B- Grade");
}
else if(percent>=77 && percent<80)
{
System.out.println("C+ Grade");
}
else if(percent>=73 && percent<77)
{
System.out.println("C- Grade");
}
else if(percent>=70 && percent<73)
{
System.out.println("C- Grade");
}
else if(percent>=67 && percent<70)
{
System.out.println("D+ Grade");
}
else if(percent>=65 && percent<67)
{
System.out.println("D Grade");
}
else if(percent>=0 && percent<65)
{
System.out.println("Fail");
}
}
public static void main(String args[])
{
GradeCalculator g=new GradeCalculator();
g.input();
g.percentage();
}
}

