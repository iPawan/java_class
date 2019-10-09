package quantumTraining1;

import java.util.ArrayList;

public class IndexOf {
public static void main(String args[])
{
ArrayList <Integer > al  = new ArrayList <Integer>();
al.add(2);
al.add(4);
al.add(5);
al.add(9);
al.trimToSize();
System.out.print("The initial values in ArrayList are :");
for (Integer value : al) {
System.out.print(value);
System.out.print(" ");
}
for (Integer number : al) {
System.out.println("Number =" + number);
}
int pos =al.indexOf(5);// using indexOf() to find index of 5
System.out.println("The element 5 is at index :" + pos);
}

private static void Integer(int i) {
	// TODO Auto-generated method stub
	
}
}