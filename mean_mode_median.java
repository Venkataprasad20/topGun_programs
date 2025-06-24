import java.util.*;
public class mean_mode_median
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>hm=new HashMap<>();
		int sum=0;
		int average=0;
		int mode=0;
		int max=0;
		for(int i=0;i<n;i++){
		    sum=sum+arr[i];
		    hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		    max=Math.max(max,hm.get(arr[i]));
		}
		System.out.println("sum = "+sum);
		System.out.println("Average = "+sum/arr.length);
		if(arr.length%2==0){
		    System.out.println("median = "+arr[arr.length/2]+arr[(arr.length/2)+1]);
		}else{
		    System.out.println("median = "+arr[arr.length/2]);
		}
		for(int j:hm.keySet()){
		    if(hm.get(j)==max){
		        mode=j;
		    }
		}
		System.out.println("mode = "+mode);
    }
}