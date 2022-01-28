package git11Questions;

public class StringToPrimitive {
	public static void main (String[] args) {
	String strObject = "361";
	try{
	    
	    int i = Integer.parseInt(strObject);
	    System.out.println("String to int: " + i);
	    float f= Float.parseFloat(strObject);
	    System.out.println("String to float: " + f);
	}catch(NumberFormatException nfe){
	    System.out.println("Invalid number");
	}
	}
}
