package ilu2;

public class Welcome {
	
	public static String Welcome(String name) {
	    if (name == null || name.trim().isEmpty()) {
	        return "Hello, my friend";
	    } else if (name.equals(name.toUpperCase())) {
	        return "HELLO, " + name.toUpperCase() + " !";
	    } else if (name.contains(",")) {
	        String[] names = name.split(",");
	        String capitalized1 = names[0].substring(0, 1).toUpperCase() + names[0].substring(1);
	        String capitalized2 = names[1].substring(0, 1).toUpperCase() + names[1].substring(1);
	        return "Hello, " + capitalized1 + ", " + capitalized2;
	    } else {
	        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
	        return "Hello, " + capitalized;
	    }
	}
}
