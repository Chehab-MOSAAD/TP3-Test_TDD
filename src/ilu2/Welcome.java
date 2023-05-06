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
	        StringBuilder sb2 = new StringBuilder();
	        for (String n : names) {
	            String capitalized = n.trim().substring(0, 1).toUpperCase() + n.trim().substring(1);
	            if (n.equals(n.toUpperCase())) {
	                sb2.append(capitalized).append(" ");
	            } else {
	                sb.append(", ").append(capitalized);
	            }
	        }
	        String result1 = "Hello" + sb.toString();
	        if (sb2.length() > 0) {
	            String result2 = "AND HELLO, " + sb2.toString().trim().toUpperCase() + " !";
	            return result1 + ". " + result2;
	        } else {
	            return result1;
	        }
	    } else {
	        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
	        return "Hello, " + capitalized;
	    }
	}
}
