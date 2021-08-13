
public class tiger implements animal {

	public static void main(String[] args) {
		
		tiger t=new tiger();
		t.sleep();
		t.run();

	}

	@Override
	public void sleep() {
		
		System.out.println("Tiger Sleeps");
		
	}

	@Override
	public void run() {
		System.out.println("Tiger runs");
	}

}
