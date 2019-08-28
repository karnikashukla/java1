class Thread1 extends Thread
{
	private Thread t;
	String name;
	int i;

	Thread1(String n)
	{
		name = n;
		System.out.println("Creating "+name);
	}

	public void run()
	{
		System.out.println("Running "+name);
		System.out.println("Priority of "+name+" is "+getPriority());
		System.out.println("Groupname : "+getThreadGroup());

		try
		{
			for(i=1;i<=5;i++)
			{
				System.out.println("Running  "+name);
				System.out.println("i = "+i);
				sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
        	 System.out.println("Thread " + name + " interrupted.");
      	}
     	System.out.println("Thread " + name + " exiting.");
	}

	public void start()
	{
		System.out.println("Thread name : "+name);
		if(t== null)
		{
			t=new Thread(this,name);
			System.out.println("Before starting thread1 isAlive: "+t.isAlive());
			t.start();
			System.out.println("After starting thread1 isAlive: "+t.isAlive());
			t.setPriority(Thread.MAX_PRIORITY);
		}
	}

}

class Thread2 extends Thread
{
	private Thread t;
	String name;
	int i;

	Thread2(String n)
	{
		name = n;
		System.out.println("Creating "+name);
	}

	public void run()
	{
		System.out.println("Running "+name);
		System.out.println("Priority of "+name+" is "+getPriority());
		try
		{
			for(i=1;i<=6;i++)
			{
				System.out.println("Running  "+name);
				System.out.println("i = "+i);
				sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
	       	 System.out.println("Thread " + name + " interrupted.");
	    }
	    System.out.println("Thread " + name + " exiting.");
	}

	public void start()
	{
		System.out.println("Thread name : "+name);
		if(t== null)
		{
			t=new Thread(this,name);
			System.out.println("Before starting thread2 isAlive: "+t.isAlive());
			t.start();
			System.out.println("After starting thread2 isAlive: "+t.isAlive());
			t.setPriority(Thread.MIN_PRIORITY);
		}
	}


}

class Thread3 extends Thread
{
	private Thread t;
	String name;
	int i;

	Thread3(String n)
	{
		name = n;
		System.out.println("Creating "+name);
	}

	public void run()
	{
		System.out.println("Running "+name);
		System.out.println("Priority of "+name+" is "+getPriority());
		try
		{
			for(i=1;i<=7;i++)
			{
				System.out.println("Running  "+name);
				System.out.println("i = "+i);
				sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
	       	 System.out.println("Thread " + name + " interrupted.");
	    }
	    System.out.println("Thread " + name + " exiting.");
	}

	public void start()
	{
		System.out.println("Thread name : "+name);
		if(t== null)
		{
			t=new Thread(this,name);
			System.out.println("Before starting thread3 isAlive: "+t.isAlive());
			t.start();
			System.out.println("After starting thread3 isAlive: "+t.isAlive());
			t.setPriority(Thread.NORM_PRIORITY);
		}
	}


}


class Thread_demo
{
	public static void main(String args[])
	{
		//ThreadGroup tg = new ThreadGroup ("group1");
		Thread1 T1 = new Thread1("First");
		T1.start();
		//T1.run();
		Thread1 T2 = new Thread1("Second");
		T2.start();
		Thread1 T3 = new Thread1("Third");
		T3.start();
	}
}