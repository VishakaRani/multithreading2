package multithreads;

public class InterThreadingCommunication
{
	int a;
	synchronized void set(int a1)
	{
		System.out.println("Setting data"+a);
		this.a=a1;
	}
	synchronized void get()
	{
		System.out.println("Getting data"+a);
		
	}

}
