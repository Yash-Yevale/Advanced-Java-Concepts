interface Simp_int
{
	void add(int a,int b);
}
class int_simp implements Simp_int{
	public void add(int a, int b){
		System.out.println("ADDITION IS:"+(a+b));
	}

}
class Simple_interface
{
	public static void main(String args[])
	{
		int_simp obj = new int_simp();
		obj.add(10,12);
	}
}