package InnerClass;

public class Innerclass {
	private String s="welcome";
	class Inner{
		void hello() {
			System.out.println(s+"to java");
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Innerclass a=new Innerclass();
Innerclass.Inner b=a.new Inner();
b.hello();
	}

}
