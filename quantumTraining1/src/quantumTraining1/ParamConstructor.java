package quantumTraining1;

class ParamConstructorEx 
{ 
    // data members of the class. 
    String name; 
    int id; 
  
    // constructor would initialize data members 
    // with the values of passed arguments while 
    // object of that class created. 
    ParamConstructorEx(String name, int id) 
    { 
        this.name = name; 
        this.id = id; 
    } 
} 
  
 public class ParamConstructor 
{ 
    public static void main (String[] args) 
    { 
        // this would invoke the parameterized constructor. 
    	ParamConstructorEx pc = new ParamConstructorEx("Prass", 1); 
        System.out.println("Name :" + pc.name + 
                           " and Id :" + pc.id); 
    } 
} 