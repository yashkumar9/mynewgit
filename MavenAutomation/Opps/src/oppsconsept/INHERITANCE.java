package oppsconsept;
class parent {
	String color;
	public void walkingstyle() {
		System.out.println("model style");
	}
}
interface Grandparent {
	void constracting();
}
interface Grandparent2{
	void business();//in case of interface we are unable to create object
}
abstract class   Security extends parent {
	int age;
	int id;
	public abstract void  internalmetod();
}
public class INHERITANCE extends Security implements Grandparent  ,Grandparent2   {
	public  void constracting() {
		System.out.println("constractin house");	
	}
	public void internalmetod() {
		System.out.println("abstract method from abstract class");
	}
	public void business() {
		System.out.println("multiple inheritance is possiable with interface");
	}

	public static void main(String[] args) {
		INHERITANCE q=new INHERITANCE();
		q.constracting();
		q.walkingstyle();
		q.color="fare";
		System.out.println(q.color);
		q.business();
		q.internalmetod();
	}

}



