class A extends Thread{
		public void run(){
			System.out.println(" Thread A started");
			for( int i=0;i<=4;i++)
			System.out.println(" From Thread A:"+i);
			System.out.println("Exit from A");
		}
	}//class A  ends
 class B extends Thread{
	public void run(){
		System.out.println(" Thread B started");
		for( int i=0;i<=4;i++)
		System.out.println(" From Thread B:"+i);
		System.out.println("Exit from B");
	}
}

class C extends Thread{
	public void run(){
		System.out.println(" Thread C started");
		for( int i=0;i<=4;i++)
		System.out.println(" From Thread C:"+i);
		System.out.println("Exit from C");
	}
}

class ThreadPriority
{
public static void main(String args[])
{
A t= new A();
t.setPriority(Thread.MAX_PRIORITY);
t.start();
System.out.println(" Start of thread A");
B th= new B();
t.setPriority(Thread.MIN_PRIORITY);
th.start();
System.out.println(" Start of thread B");
C tr= new C();
t.setPriority(tr.getPriority()+1);
tr.start();
System.out.println(" Start of thread C");
System.out.println(" End of main Thread");
}
}
