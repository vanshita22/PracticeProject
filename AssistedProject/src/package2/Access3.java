package package2;
import package1.Access1;
public class Access3 extends Access1 {
	public static void main(String[] args) {
		Access1 a = new Access1();
		System.out.println(a.hours);
		System.out.println(a.minutes);
	}

}
