package Inheritance;

public class FriendA {

	public void foo(FriendB.ToA b2a) {
		if (b2a == null) {// only FriendB can make non null instance of FriendB.ToA  other non friend class can make the instance of FriendB.ToA  but it will be null
			throw new Error("you ain't B");
		} else {
 // means FirendB is accessing this which is okay
		}
	}
}
