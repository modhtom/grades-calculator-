import java.util.Scanner;
public class gradescalculator{
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
  int i=0;
  while(i<123456789){
  System.out.print("Enter the grade:");
  double g=input.nextDouble();
  if(g<=100){
  if(g>=90){System.out.println("A+");}
  else if(g>=85)
  {System.out.println("A");}
  else if(g>=80)
  {System.out.println("A-");}
  else if(g>=77)
  {System.out.println("B+");}
  else if(g>=73)
  {System.out.println("B");}
  else if(g>=70)
  {System.out.println("B-");}
  else if(g>=67)
  {System.out.println("C+");}
  else if(g>=63)
  {System.out.println("C");}
  else if(g>=60)
  {System.out.println("C-");}
  else if(g>=57)
  {System.out.println("D+");}
  else if(g>=55)
  {System.out.println("D");}
  else if(g>=50)
  {System.out.println("D-");}
  else if(g<50)
  {System.out.println("F");}
}else
  {System.out.println("Enter grade less than or equals to 100. ");}i++;}
  }}