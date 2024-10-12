/*linear search in 2d array */
import java.util.Scanner;
import java.util.Arrays;
class Linear2{
	public static void main(String[] args){
		int[][]arr={{1,3,5,2,9,6,8},{10,22,30,6},{21,4,22,23}};
		int target=40;
	System.out.println(Arrays.toString(search(arr,target)));
	}
	static int[] search(int[][] arr,int target){
		int n=arr.length;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<arr[i].length;j++)
			{
			if(target == arr[i][j])
			return new int[]{i,j};
			}
		}
		return null;
	}
}	