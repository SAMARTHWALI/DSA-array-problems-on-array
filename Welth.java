/*welth of arr */
import java.util.Scanner;
import java.util.Arrays;
class Welth{
	public static void main(String[] args){
		int[][]arr={{1,3,5,2,9,6,8},{10,22,30,6},{21,4,22,23}};
    System.out.println(welth(arr));
	}
	static int welth(int[][] arr){
		int n=arr.length;
		int max=0;
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
			
			sum=sum+arr[i][j];
			
			}
			if(sum>max){
			max=sum;
			}
			
			
			
		}
		return max;
	}
}	