package typecasting;
public class Typecast {
public static void main(String[] args) {
	System.out.println("implicit  typecasting");
	char a='A';
	System.out.println("value of a:"+ a);
	int b=a;
	System.out.println("value of b:" + b);
	float c=a;
	System.out.println("value of c:"+ c);
	long d=a;
	System.out.println("value of d:"+d);
double e=a;
System.out.println("value of e"+ e);
System.out.println("explicit type casting");
double f=35.04;
int g=(int)f;
System.out.println("value of g: "+ g);
float x=(float)f;
System.out.println("value of x:"+x);
	
}
}