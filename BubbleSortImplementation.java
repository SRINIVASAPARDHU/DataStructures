package com.ssp.DataStructures;
import java.util.Arrays;
public class BubbleSortImplementation 
{
	 static void bubblesort(int []a)
	    {
	        for(int i = 0;i< a.length - 1;i++)
	        {
	            for(int j = i;j<a.length -i -1;j++)
	            {
	                if(a[j] > a[j+1])
	                {
	                    int temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }  
	    }
	 public static void main(String[] args)
	 {
	     int[] arr = {-2,3,6,1,21,15};
		 bubblesort(arr);
		 System.out.println(Arrays.toString(arr));

	}
}
