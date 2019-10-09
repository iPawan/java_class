package quantumTraining1;

  
class EmptyConstructor 
{ 
    int num; 
    String name; 
  
    // this would be invoked while an object 
    // of that class is created. 
    EmptyConstructor() 
    { 
        System.out.println("Constructor called"); 
    } 
   
} 
  
 public class excConstructor
{ 
    public static void main (String[] args) 
    { 
        // this would invoke default constructor. 
        EmptyConstructor geek1 = new EmptyConstructor(); 
  
        // Default constructor provides the default 
        // values to the object like 0, null 
        System.out.println(geek1.name); 
        System.out.println(geek1.num); 
    } 
} 
