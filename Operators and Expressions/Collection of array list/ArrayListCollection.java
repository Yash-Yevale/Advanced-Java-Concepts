import java.util.*;  
public class ArrayListCollection
{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("1");//Adding object in arraylist    
  list.add("2");    
  //Traversing list through Iterator  
  Iterator itr=list.iterator();//getting the Iterator  
  while(itr.hasNext()){//check if iterator has the elements  
   System.out.println(itr.next());//printing the element and move to next  
  }  
 }  
} 