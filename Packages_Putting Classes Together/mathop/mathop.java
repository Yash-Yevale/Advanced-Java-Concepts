//Use Of static import
import static java.lang.Math.*;
class mathop
{
   public void circle(double r)
    {
        double area = PI*r*r;
        System.out.println("The Area Of circle is : "+area);
         
    }
    public static void main(String args[])
     {
         mathop obj = new mathop();
         obj.circle(2.3);
         
     }
}