package quantumTraining1;

import java.util.*;  
public class TestJavaCollection2{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
Object cloneList = al.clone(); //Clones the entire ArrayList
System.out.println("Elements in the cloned list are:");
System.out.println(cloneList);
}  
}  