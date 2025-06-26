import java.util.*;
public class calc
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("sum is :"+sum(a,b));
		System.out.println("subtraction is :"+sub(a,b));
        System.out.println("multiplication is :"+mul(a,b));
        System.out.println("division is :"+div(a,b));
		sc.close();
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
}