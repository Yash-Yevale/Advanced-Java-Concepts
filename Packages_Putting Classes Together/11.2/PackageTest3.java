//subclassing an imported class;
//package2 is imported and its ClassB is inherited;

import package2.ClassB;

class ClassC extends ClassB
{
 int n = 20;
 void displayC()
 {
  System.out.println("Class C \n");
  System.out.println("Value of m = "+m);
  System.out.println("Value of n = "+n);
 }
}

class PackageTest3
{
 public static void main(String args[])
 {
  ClassC objectC = new ClassC();
  objectC.displayB();
  objectC.displayC(); 
 } 
}