package printingnumbers;

public class mythreaddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mythreadd m = new mythreadd();
		Thread t = new Thread((Runnable) m);
		t.start();

	}

}
