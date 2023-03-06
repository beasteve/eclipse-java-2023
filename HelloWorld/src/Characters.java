
public class Characters {
	
	
	    public static void main(String[] args) {
	        String letra = "Hello World";
	        int ind = 1;
	        
	        boolean word1 = checkCharacters(letra, ind);
	        
	        if (word1) {
	            System.out.println("El carácter anterior y posterior son iguales.");
	        } else {
	            System.out.println("El carácter anterior y posterior no son iguales.");
	        }
	    }
	    
	    public static boolean checkCharacters(String str, int index) {
	        if (index < 1 && index > str.length() - 2) {
	            return false; 
	        }
	        
	        char letra1 = str.charAt(index - 1);
	        char letra2 = str.charAt(index + 1);
	        
	        return letra1 == letra2;
	    }
	}



