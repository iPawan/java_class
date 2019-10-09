package quantumTraining1;

class DefaultCnstr { 
	   int i; 
	   DefaultCnstrTest t; 
	   boolean b; 
	   byte bt; 
	   float ft; 
	} 
	  
	public class DefaultCnstrTest { 
	    public static void main(String args[]) { 
	    	DefaultCnstr t = new DefaultCnstr(); // default constructor is called. 
	      System.out.println(t.i); 
	      System.out.println(t.t); 
	      System.out.println(t.b); 
	      System.out.println(t.bt); 
	      System.out.println(t.ft); 
	    } 
	} 