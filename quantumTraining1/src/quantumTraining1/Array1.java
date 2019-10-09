package quantumTraining1;
import java.util.Arrays;
import java.util.Collections;

public class Array1
{ 
public static void main(String[] args) 
{ 
int[] arr = {52,12,2,72,4}; // array of 5 elements

/* Integer[] arr = {52,12,2,72,4}; // used Integer[] instead of int as collections
Arrays.sort(arr, Collections.reverseOrder()); // reverseorder() for descending order

/*
 * 
 */
Arrays.sort(arr); 
System.out.printf("Sorted arr[] = %s", 
Arrays.toString(arr)); 
} 
}