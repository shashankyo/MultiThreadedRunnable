package multirunnable;

public class ProgramApp {
public static void main(String[] args) {
	Program1 p1 = new Program1();
	Program2 p2 = new Program2();
	Program3 p3 = new Program3();
	Thread t1 = new Thread(p1);
	Thread t2 = new Thread(p2);
	Thread t3 = new Thread(p3);

	t1.start();
	t2.start();
	t3.start();

}
}
