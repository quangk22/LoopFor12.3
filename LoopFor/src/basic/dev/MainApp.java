package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("100 số đầu tiên của dãy Fibonacci :");
        int  fn = 0;
        int f1 = 1;
        int f2 =1;
        System.out.println(f1);
        System.out.println(f2);
		for (int i = 3; i < 100; i++) {
			fn = f1 + f2;
			System.out.println(fn);
			f1=f2;
			f2=fn;
			i++;

		}
	}
}
