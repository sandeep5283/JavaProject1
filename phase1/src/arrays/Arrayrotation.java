package arrays;

import java.util.Arrays;

class Main {

	  public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5,6,7};
	    int k = 5;
     System.out.println("Original Array");
	    System.out.println(Arrays.toString(arr));
	    leftRotation(arr,k);
	    System.out.println("Reversed Array");
	    System.out.println(Arrays.toString(arr));
	  }
	  public static void leftRotation(int[] arr, int k) {
	    if(k==0 || k%arr.length==0)
	      return;
	    k = k%arr.length;
	    for(int i = 0 ; i<k ; i++) {	
	    	int f = arr[0];
	      for(int j = 0 ; j < arr.length - 1 ; j++) {
          arr[j] = arr[j+1];
	      }
	      arr[arr.length-1] = f;
	    }

	  }

	}

	 
