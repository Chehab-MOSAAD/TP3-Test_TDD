package ilu2;

public class Welcome {
	
	public static String Welcome(String names) {
	    if (names == null || names.trim().isEmpty()) {
	        return "Hello, my friend";
	    } else if (names.equals(names.toUpperCase())) {
	        return "HELLO, " + names.toUpperCase() + " !";
	    } else if (names.contains(",")) {
	        String[] nameArray = names.split(",");
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < nameArray.length; i++) {
	            String name = nameArray[i].trim();
	            String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
	            sb.append(capitalized);
	            if (i == nameArray.length - 2) {
	                sb.append(" and ");
	            } else if (i < nameArray.length - 1) {
	                sb.append(", ");
	            }
	        }
	        return "Hello, " + sb.toString();
	    } else {
	        String capitalized = names.substring(0, 1).toUpperCase() + names.substring(1);
	        return "Hello, " + capitalized;
	    }
	}
}
