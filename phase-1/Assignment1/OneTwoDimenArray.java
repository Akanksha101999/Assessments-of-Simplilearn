package git11Questions;
public class OneTwoDimenArray {
	 public static void main(String[] args) 
		{
		    int arr[] = {2, 4, 6, 8, 10};
		    
		   for (int i = 0; i < arr.length; i++)
		      System.out.println(arr[i] + " ");
		
		   int[][] a = {
		            {1, 2, 3}, 
		            {4, 5, 6, 9}, 
		            {7}, 
		};
		        // calculate the length of each row
		        System.out.println("Length of row 1: " + a[0].length);
		        System.out.println("Length of row 2: " + a[1].length);
		        System.out.println("Length of row 3: " + a[2].length);
		    }
		}
		


