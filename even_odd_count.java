
import java.util.*;
public class even_odd_count
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++){
		    if(arr[i]%2==0){
		        even++;
		    }
		    else{
		        odd++;
		    }
		}
		System.out.println("even count = "+even);
		System.out.println("odd count = "+odd);
		sc.close();
    }
}