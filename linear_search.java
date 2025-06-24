import java.util.*;
public class linear_search
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<n;i++){
		    if(arr[i]==target){
		        flag=true;
		    }
		}
		if(flag){
		    System.out.println("target found");
		}
		else{
		    System.out.println("target not found");
	    }
	}
}
