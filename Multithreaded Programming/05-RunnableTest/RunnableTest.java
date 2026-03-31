//runnable class
class X implements Runnable          
{
public void run()
{
for(int i=1; i<=10; i++)
{
 System.out.println("\tThreadx  :"  +i);
}
System.out.println("End of Threadx");
}
}
class RunnableTest
{
public static void main(String args[])
{
X runnable =new X();

Thread threadx =new Thread(runnable);
threadx.start();

System.out.println("End of main Thread");
}
}
