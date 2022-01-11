package Inheritance;


public class FriendB {
	
	public static class ToA {
		private ToA() {
		}
	}

	private static final ToA b2a = new ToA();

	void test() {
		new FriendA().foo(b2a);
	}

}
