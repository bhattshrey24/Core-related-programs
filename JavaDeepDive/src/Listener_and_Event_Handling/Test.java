package Listener_and_Event_Handling;

public class Test {
// The event is saying 'Hello'
	public static void main(String[] args) {

		Initiater initiater = new Initiater();

		Responder1 responder1 = new Responder1();// these are the classes that are interested in listening to the event
		Responder2 responder2 = new Responder2();

		initiater.addListener(responder1);// adding all the classes that are interested in the event
		initiater.addListener(responder2);

		initiater.sayHello(); // Triggering the event , now this will then trigger the callback
	}

}
