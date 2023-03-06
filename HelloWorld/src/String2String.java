
public class String2String {
	
	
	    public static boolean checkSubstring(String palabra) {
	      
	        if (palabra.length() < 3) {
	            return false;
	        }
	        	     
	        for (int i = 1; i < palabra.length() - 1; i++) {
	            if (palabra.charAt(i) == 'b' && palabra.charAt(i - 1) == 'a' && palabra.charAt(i + 1) == 'c') {
	                return true;
	            }
	        }
	        
	        return false;
	    }
	    
	    public static void main(String[] args) {
	        String str1 = "abcdefg"; 
	      
	        
	        System.out.println(checkSubstring(str1));
	       
	    }
	}



