import java.util.*;
public class finding_duplicates
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		HashSet<Integer>hs=new HashSet<>();
        ArrayList<Integer>al=new ArrayList<>();
		for(int i=0;i<n;i++){
		    if(hs.contains(arr[i])){
                if(!al.contains(arr[i]))
		        al.add(arr[i]);
		    }
		    hs.add(arr[i]);
		}
        System.out.println(al);
		sc.close();
    }
}