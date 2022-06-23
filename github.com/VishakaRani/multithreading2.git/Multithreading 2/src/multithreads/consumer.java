package multithreads;

public class consumer  extends Thread{
	InterThreadingCommunication obj;
	public consumer(InterThreadingCommunication obj) {
		this.obj =obj;
	}
	public void run()
	{
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
			obj.get();
			
			}
		}
	}
