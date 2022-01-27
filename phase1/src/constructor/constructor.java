package constructor;
class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}

}
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class constructor{

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	Std std1=new Std(1,"ram");
	Std std2=new Std(2,"raj");
	std1.display();
	std2.display();
		}
	}

