package matala1.matala1;

public class ex1 { 
public  String Compare(double a, double b, String operation) {
		if (Double.isNaN(a) || Double.isNaN(b)) return "Error: Invalid input";
		if (Double.isInfinite(a) || Double.isInfinite(b)) return "Error: Invalid input";
		
		switch(operation) {
		case "Regular":
			if(a>b) return "A";
			else return "B";		
		
		case "Negative":
			a = a*-1;
			b = b*-1;
			if (a > b) {
			    return "A";
			} else if (a < b) {
			    return "B";
			} else {
			    return "Equal";
			}

			
		case "Reciprocal":
			try {	
				
				
			a = 1/a;
			b = 1/b;	
			if (a == Double.POSITIVE_INFINITY ||a == Double.NEGATIVE_INFINITY 
				|| b == Double.POSITIVE_INFINITY ||b == Double.NEGATIVE_INFINITY)
	                throw new ArithmeticException();
			}
			catch(ArithmeticException ae) {
				return "Error";
			}
			if(a>b) return "A";
			else return "B";
		
		}
		return "Error";
		
	}
}
