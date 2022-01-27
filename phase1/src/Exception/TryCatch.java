package Exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]	=new int[7];
   try {
	   arr[10]=1;
   }
   catch(ArrayIndexOutOfBoundsException e) {
	   System.out.println("aray limit exceeded");
	  
	   
   }
   finally {
	   System.out.println("hello");
   }

	}

}
