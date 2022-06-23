package multithreads;

public class producer extends Thread
{
	InterThreadingCommunication obj;
	public producer(InterThreadingCommunication obj) {
		this.obj = obj;
	}
	public void run() {
		int i=0;
		while(true)
		{
			try
			{
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			obj.set(i);
			i++;
		}
	}
	
}
