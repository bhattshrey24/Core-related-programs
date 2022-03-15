package Listener_and_Event_Handling;

import java.util.ArrayList;
import java.util.List;

public class Initiater {// attaches the listeners and triggers the event

	private List<HelloListener> listeners = new ArrayList<HelloListener>();// Listener is simply interface

	public void addListener(HelloListener toAdd) {// adds listeners to the list , basically every class has it's own
													// listener. Here we are passing the object of classes that
													// implemented HelloListener because remember interface reference
													// can hold objects of classes that implemented the interface
		listeners.add(toAdd);
	}

	public void sayHello() {
		System.out.println("Hello!!");// THE EVENT

		// Notify everybody that may be interested(ie. all the listeners attached to the
		// event) that event has occurred
		
		for (HelloListener hl : listeners)// the list contains objects of classes that implemented the interface but we
											// are accessing them using variable/reference of interface cause otherwise
											// we will have to make reference of each class separately which is very cumbersome
			hl.someoneSaidHello();// triggering the callbacks
	}
}
