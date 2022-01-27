package strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="helloworld";
		System.out.println(s.length());
		String sub="welcome";
		System.out.println(sub.substring(3));
		String s1="Hello";
		String s2="Helo";
		System.out.println(s1.compareTo(s2));
		String s3="";
		System.out.println(s3.isEmpty());
		String s4="Simple";
		System.out.println(s4.toLowerCase());
      String replace=s2.replace('i', 'l');
      System.out.println(replace);
      String x="Welcome TO  Java";
      String y ="Welcometojava";
      System.out.println(x.equals(y));
    	StringBuffer S=new StringBuffer("welcome to java");
    	S.append("class");
    	System.out.println(S);
    	S.insert(0, 'l');
    	StringBuffer S1=new StringBuffer("hello");
    	S1.replace(0, 2, "del");
    	System.out.println(S1)
    	;
    	StringBuilder b=new StringBuilder("StringBuilder");
    	b.append("create");
    	System.out.println(b);
    	b.reverse();
    	System.out.println(b);
    	String str="hello";
    	StringBuilder b1=new StringBuilder(str);
    	b1.reverse();
    	System.out.println(b1);
    	StringBuffer S0=new StringBuffer(str);
    	S0.append("hello");
    	System.out.println(S0);
 	
				
	}

}
