import java.util.*;
public class array_is_sorted_or_not
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		boolean flag=true;
		for(int i=0;i<n-1;i++){
		    if(arr[i]>arr[i+1]){
		        flag=false;
		    }
		}
		if(flag){
		   System.out.println(true); 
		}
		else{
		    System.out.println(false);
		}
    }
}