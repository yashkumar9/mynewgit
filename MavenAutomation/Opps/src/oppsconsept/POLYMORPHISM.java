package oppsconsept;

public class POLYMORPHISM {

	public void sum() {
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	public void sum(int c) {
		int a=20;
		int b=30;
		c=a+b;
		System.out.println(c);

	}
	public void sum(int a,int b) {
		a=20;
		b=30;
		int c=a+b;
		System.out.println(c);
	}
	public double sum(double a,double b) {
		return a+b;
	}
	public String sum(String str) {
	
		return str;
	}
	public static void main(String[] args) {
		POLYMORPHISM q=new POLYMORPHISM();
		System.out.println(q.sum(4.0, 7.0));
		System.out.println(q.sum("pluse"));
	}

}
