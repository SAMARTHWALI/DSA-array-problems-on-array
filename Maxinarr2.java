/*find max element in 2d array */
import java.util.Scanner;
import java.util.Arrays;
class Maxinarr2{
	public static void main(String[] args){
		int[][]arr={{1,3,5,2,9,6,8},{10,22,30,6},{21,4,22,23}};
		
	System.out.println(max(arr));
	}
	static int max(int[][] arr){
		int n=arr.length;
		int max=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<arr[i].length;j++)
			{
			if(arr[i][j]>max)
				max=arr[i][j];
			
			}
		}
		return max;
	}
}	