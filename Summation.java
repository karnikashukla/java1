class Sum extends Thread
{
	private Thread t;
	String name;
	int i;
	int sum1=0;
	int sum2=0;
	int sum3=0;

	Sum(String n)
	{
		name = n;
		System.out.println("Creating "+name);
	}

	public void run()
	{
		System.out.println("Running "+name);
		//System.out.println("Priority of "+name+" is "+getPriority());
		//System.out.println("Groupname : "+getThreadGroup());

		try
		{
			for(i=1;i<=10000;i++)
			{
				sum1=sum1+i;
				sleep(10);
			}
			System.out.println("Sum of 1-10000 : "+sum1);
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
			//System.out.println("Before starting thread1 isAlive: "+t.isAlive());
			t.start();
			//System.out.println("After starting thread1 isAlive: "+t.isAlive());

		}
	}

}

class Summation
{
	public static void main(String args[])
	{
		Thread1 T1 = new Thread1("First");
		T1.start();
	}
}