import java.util.Scanner;
import java.util.Arrays;
class Binary{
	public static void main(String[] args){
		int[] arr={1,3,5,2,9,6,8};
		int target=6;
		System.out.println(search(arr,target));
	}
	static int search(int[] arr,int target){
		int n=arr.length;
		int start=0;
		int end=n-1;
		while(start<=end){
			int mid=(start+end)/2;
			
			if(arr[mid]<target){
				start=mid+1;
			}
			else if(arr[mid]>target){
				end=mid-1;
			}
			else{
				
				return mid;
			
			}
				
		}
		return -1;
		
			
		
	}
	
				
	
}
	