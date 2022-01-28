package git11Questions;

public class InnerClass {
	 class Inner {
       public void show()
	     {
	       System.out.println("Inner class Example");
	     }
	 }
 public static void main(String[] args)
  {
	InnerClass.Inner in = new InnerClass().new Inner();
	  in.show();
  } 
}
	            
	    
	    
	

