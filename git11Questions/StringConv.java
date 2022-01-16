package git11Questions;

public class StringConv {
	 public static void main(String args[]) {
		 String str1 = "String Conversion ";  
		 
		 //String buffer class
	        StringBuffer sb = new StringBuffer();
	        sb.append(str1);
	        System.out.println(sb.getClass());
	        System.out.println(str1.getClass());
	        
	     //String builder class
	      StringBuilder s=new StringBuilder();
	      s.append(str1);
	      System.out.println(s.getClass());
	
	 }
}