import java.lang.*;
import java.io.*; 
interface Exam 
{ 
void percent_cal(); 
} 
class Student 
{
String name; 
int roll_no,mark1,mark2; 
Student(String n, int r, int m1, int m2)
{ 
name=n; 
roll_no=r; 
mark1=m1; 
mark2=m2; 
} 
void display()
{ 
System.out.println ("\nName of Student: "+name); 
System.out.println ("Roll No. of Student: "+roll_no); 
System.out.println ("Marks of Subject 1: "+mark1); 
System.out.println ("Marks of Subject 2: "+mark2);
} } 
class Result extends Student implements Exam 
{ 
Result(String n, int r, int m1, int m2) 
{ 
super(n,r,m1,m2); 
} 
public void percent_cal() 
{ 
int total=(mark1+mark2);
float percent=total*100/200; 
System.out.println ("Percentage: "+percent+"%");
} 
void display() 
{
super.display();
} }
class MultipleInheritenceDemo 
{ 
public static void main(String args[]) 
{
System.out.println("This Program is Written By : Mr. Siddarth Suhane");
Result R = new Result("Anoop reddy",12,93,84);
R.display();
R.percent_cal();
} }