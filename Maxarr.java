/*swaping array index elements*/
import java.util.Scanner;
import java.util.Arrays;
class Maxarr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		max(arr);
		System.out.println("maximum value in array is:"+max(arr));
		
	}
		static int max(int[] arr){
			int max=arr[0];
			for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
			max=arr[i];}
		}
		return max;
			
		}
}
		
	