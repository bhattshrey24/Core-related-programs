package Inheritance;

//Java does not have the friend keyword that is in c++
//friend function of a class is defined outside that class' scope but it has the right to access all private and protected members of the class
// JAVA doesno't support friend function concept directly but we can achieve it directly

public class FriendConcept {

	public static void main(String[] args) {
// go to FriendA ,FriendB, NonFriendC class
		
		
	}
	
	// Only B can generate a non-null B.ToA token. If both A and B do not leak this
	// token to the 3rd party, nobody else can invoke A.foo()

	// If A2 wants to friend B too, it needs a different token type. If it's the
	// same token type, since A got a token of the type from B, A can pretend to be
	// B to A2.

	// The check is done at runtime, not compile time, that is not perfect. Not a
	// big deal though, since any 3rd party can only invoke A.foo() with a null, it
	// can't be an innocent mistake which we want to check at compile time; it's
	// probably malicious so we don't care to warn the caller at compile time.
}
