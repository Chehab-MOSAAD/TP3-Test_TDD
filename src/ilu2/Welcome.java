package ilu2;

public class Welcome {
	
	public static String Welcome(String name) {
	    if (name == null || name.trim().isEmpty()) {
	        return "Hello, my friend";
	    } else if (name.equals(name.toUpperCase())) {
	        return "HELLO, " + name.toUpperCase() + " !";
	    } else if (name.contains(",")) {
	        String[] names = name.split(",");
	        StringBuilder sb = new StringBuilder();
	        for (String n : names) {
	            String capitalized = n.trim().substring(0, 1).toUpperCase() + n.trim().substring(1);
	            sb.append(", ").append(capitalized);
	        }
	        return "Hello" + sb.toString();
	    } else {
	        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
	        return "Hello, " + capitalized;
	    }
	}
}
