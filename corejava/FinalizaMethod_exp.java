package corejava;

public class FinalizaMethod_exp
{
	public static void main(String[] args)   
    {   
		FinalizaMethod_exp obj = new FinalizaMethod_exp();   
        System.out.println("Hashcode of object= "+obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
	protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
}