import java.util.Scanner;  
public class Multiplication  
{  
public static void main(String args[])  
{  
int x, y, multiple;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
mulltiple = mull(x, y);  
System.out.println("The multiplication of two numbers x and y is: " + mull);  
}  
//method that calculates the multiplication  
public static int mull(int a, int b)  
{  
int mul = a * b;  
return mul;  
}  
}  