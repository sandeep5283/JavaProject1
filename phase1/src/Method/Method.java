package Method;

public class Method {
	int add(int a,int b) {
		int c=a+b;
		return c;
	}

		int multiply(int a,int b) {
			int c=a*b;
			return c;
		}
		int multiply(int a,int b,int c) {
			int d=a*b*c;
			return d;
					
		}
		public static void main(String[] args) {
			Method A= new Method();
			int B=A.add(10,20);
			System.out.println(B);
			int C=A.multiply(10,20);
			System.out.println(C);
			int D=A.multiply(C, B,3);
			System.out.println(D);
			
			
		}
		
		

}

