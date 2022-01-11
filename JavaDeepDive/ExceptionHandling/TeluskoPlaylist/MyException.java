package TeluskoPlaylist;

public class MyException extends Exception {// we can also extend specific exception class like IOException etc
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);// we have to call constructor of "Exception" class , which will print the "msg"
	}

	@Override
	public String toString() {

		return "Yo this is my exception class you came to bitch!!!";
	}

}
