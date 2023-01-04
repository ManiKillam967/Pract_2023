package Inheritance;

class A1{
	public void run(){
	System.out.println("run 5 kms");
}
}
class B1 extends A1
{
	public void run() {
		System.out.println("run 10 kms");
	    System.out.println("inside B1 method");
	}
}
public class C1 {
public static void main(String[] args) {

	B1 o1 = new B1();
	o1.run();
	
	A1 o2 = new B1();
	o2.run();
	
}
}
