import java.util.Scanner;
public class Addition  
{  
public static void main(String args[])  
{  
int x, y, sum3;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first integer11111111111 number: ");  
x = sc.nextInt();
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
sum3 = sum(x, y);  
System.out.println("The sum of two numbers x, y,z & w11: " + sum3);  
}  
//method that calculates the sum of 3 digits 
public static int sum(int a, int b)  
{  
int sum = a + b;  
return sum;  
}  
}  
