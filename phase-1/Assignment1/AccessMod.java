package git11Questions;

 public class AccessMod {
  private int a=9;
  private int square(int b) {
	  return b*b;
  }
 }
  public class Example{
	   public static void main(String args[]){  
		   AccessMod obj = new AccessMod ();  
		System.out.println(obj.a);   //This will give compilation error because we are trying to access private datamember in another class.
		System.out.println(obj.square(3));
	   }  
  }
