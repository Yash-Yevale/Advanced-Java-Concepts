class sus_res_stop implements Runnable{
		Thread th;
		boolean sus, stp;
		sus_res_stop(String  tN){
		th =new Thread(this,tN);
		sus=false;
		stp=false;
		th.start(); }
		public void run(){
		try{
		int j=1;
		while(++j<20){
		synchronized (this){ 
		while(sus){ wait(); }
		if(stp){	break;	}}}}catch(InterruptedException e){
		System.out.println(" Thread Interrupted");	}}//run ends
		synchronized void my_sus(){	sus=true; }
		synchronized void my_res(){		sus=false;	notify(); }
		synchronized void my_stop(){
		sus=false;
		stp= true;
		notify(); }}//class ends
class eg_SRS{
public static void main(String args[]){
try{
sus_res_stop thr= new sus_res_stop("SRS");
System.out.println(" Thread thr is created and started");
Thread.sleep(2000);
thr.my_sus();
System.out.println(" Thread thr is suspended");
Thread.sleep(2000);
thr.my_res();
System.out.println(" Thread thr is resume ");
Thread.sleep(2000);
thr.my_sus();
System.out.println(" Thread thr is suspended");
Thread.sleep(2000);
thr.my_res();
System.out.println(" Thread thr is resume ");
Thread.sleep(2000);
thr.my_stop();
System.out.println(" Thread thr is stoped");
}catch(InterruptedException e){
System.out.println(" Thread Interrupted");
}}}//class 
