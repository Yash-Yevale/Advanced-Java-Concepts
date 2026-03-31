interface area {
		final static float pi=3.14f;
		float compute(float x ,  float y);
}
class rectangle implements area {
public float compute(float x , float y){
	return(x*y);
}
}
class circle implements area{
public float compute(float x , float y){
		return (pi*x*y);
}
}

 class InterfaceTest {
public static void main (String args[]){
		rectangle r1 = new rectangle() ;
		circle c1 =  new circle();
		area a;
		a = r1;
		System.out.println("area of rectangle = " + a.compute(10,20));
		a= c1;
		System.out.println("area of circle = " + a.compute(10,20));
}
}