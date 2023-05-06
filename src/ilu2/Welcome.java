package ilu2;

public class Welcome {
	
	public static String Welcome(String name) {
	    if (name == null || name.trim().isEmpty()) {
	        return "Hello, my friend";
	    } else {
	        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
	        return "Hello, " + capitalized;
	    }
	}
}
