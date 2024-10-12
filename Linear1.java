import java.util.Scanner;
import java.util.Arrays;
class Linear1{
	public static void main(String[] args){
		int[] arr={1,3,5,2,9,6,8};
		int target=1;
		search(arr,target);
	}
	static void search(int[] arr,int target){
		int n=arr.length;
		
		for(int i=0;i<n;i++){
			if(target==arr[i]){
				System.out.println("element found at loc:"+i);
				break;
			}
			if(target!=arr[i]){
				System.out.println("element not found");
				break;}
			
			
			
		}
		
			
		
	}
	
				
	
}
	