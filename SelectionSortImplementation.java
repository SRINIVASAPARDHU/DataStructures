package com.ssp.DataStructures;
import java.util.Arrays;
public class SelectionSortImplementation 
{
	void selectionSort(int array[]) 
	{
	    for (int step = 0; step < array.length - 1; step++) {
	      int min_index = step;

	      for (int i = step + 1; i < array.length; i++) 
	      {
	        if (array[i] < array[min_index]) {
	          min_index = i;
	        }
	      }
	      
	      int temp = array[step];
	      array[step] = array[min_index];
	      array[min_index] = temp;
	    }
	  }
	  public static void main(String args[]) {
	    int[] data = { 20, 12, 10, 15, 2 };
	    SelectionSortImplementation ss = new SelectionSortImplementation();
	    ss.selectionSort(data);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	  }
}
