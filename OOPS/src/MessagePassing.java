
public class MessagePassing {
//Message passing is a form of communication between objects,
// processes or other resources used in object-oriented programming,
// inter-process communication and parallel computing.
// it can be done using methods too but then there will be less abstraction which is not favourable

// Here abstraction matters a lot between object , ob1 whos sending data should not be aware of ob2 who is receiving it 
// In java this is done using "putMessage" and "getMessage" , putMessage puts the message in message queue and get message retrieves the message from message queue  

// Message passing can be synchronous or asynchronous. Synchronous message
// passing systems require the sender and receiver to wait for each other while
// transferring the message.In asynchronous communication the sender and receiver do not
// wait for each other and can carry on their own computations while transfer of messages is being done.

//https://www.panonit.com/blog/overview-message-passing-object-oriented-programming(Read for more details)

	public static void main(String[] args) {
		int n = 245;
		int i = 24767;
		System.out.println(i%10);
//		while (n != 0) {
//			int dig = n;
//			int pow10 = (int) Math.pow(10, i);
//			dig = (int) n / pow10;
//			// int dig= n%(int)Math.pow(10,i);
//			System.out.println(dig);
//			n = n - dig * pow10;
//			i--;
//		}
		
	}

}
