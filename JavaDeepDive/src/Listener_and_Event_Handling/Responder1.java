package Listener_and_Event_Handling;

public class Responder1 implements HelloListener{
	 @Override
	    public void someoneSaidHello() {// this is the callback method
	        System.out.println("Hello there From Responder1 ...");
	    }
}
