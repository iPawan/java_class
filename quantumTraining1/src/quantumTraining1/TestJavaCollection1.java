package quantumTraining1;

import java.util.*; 


public class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("Ravi"); 
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
} 
int asize =list.size(); // returns the size of the array
System.out.println("Size of the array is:" +asize);
}  
}  