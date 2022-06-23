package multithreads;

public class Ex {
	public static void main(String[]args)
	{
		InterThreadingCommunication obj = new
				InterThreadingCommunication();
		producer p= new producer(obj);
		consumer c= new consumer(obj);
		p.start();
		c.start();
		try
		{
			p.join();
			c.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}


