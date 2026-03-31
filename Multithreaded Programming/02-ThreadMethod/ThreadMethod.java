class A extends Thread{
public void run(){
	for(int i=1;i<=5;i++){
		if (i==1)yield();
		System.out.println("From thread A : i="+i); }
		System.out.println(" Exit from A"); }
}
class B extends Thread{
		public void run(){
			for(int i=1;i<=5;i++){
				if (i==3)stop();
				System.out.println("From thread B : i="+i); }
			System.out.println(" Exit from b");
		}
}
class  C extends Thread{
   public void run(){
	for(int i=1;i<=5;i++){
		System.out.println("From thread A : i="+i);
		if (i==1)
		try
		{
				  sleep(200);
		}catch(Exception e){
		System.out.println(e);
		}
	}
	System.out.println(" Exit from c");
	}
}
class Thread_Method{
public static void main(String args[]){
A t= new A();
t.start();
System.out.println(" Start of thread A");
B th= new B();
th.start();
System.out.println(" Start of thread B");
C tr= new C();
tr.start();
System.out.println(" Start of thread C");
System.out.println(" End of main THread");
}
}
