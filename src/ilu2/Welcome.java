package ilu2;

import java.util.ArrayList;
import java.util.List;

public class Welcome {
	
	public static String Welcome(String name) {
	    if (name == null || name.trim().isEmpty()) {
	        return "Hello, my friend";
	    } else if (name.equals(name.toUpperCase())) {
	        return "HELLO, " + name.toUpperCase() + " !";
	    } else if (name.contains(",")) {
	        String[] names = name.split(",");
	        List<String> capitalizedNames = new ArrayList<>();
	        List<String> uppercaseNames = new ArrayList<>();
	        for (String n : names) {
	            String trimmedName = n.trim();
	            if (trimmedName.equals(trimmedName.toUpperCase())) {
	                uppercaseNames.add(trimmedName);
	            } else {
	                capitalizedNames.add(trimmedName.substring(0, 1).toUpperCase() + trimmedName.substring(1));
	            }
	        }

	        StringBuilder sb = new StringBuilder("Hello");
	        if (!capitalizedNames.isEmpty()) {
	            for (int i = 0; i < capitalizedNames.size() - 1; i++) {
	                sb.append(", ").append(capitalizedNames.get(i));
	            }
	            if (capitalizedNames.size() > 1) {
	                sb.append(" and ");
	            }
	            sb.append(capitalizedNames.get(capitalizedNames.size() - 1));
	        }

	        if (!uppercaseNames.isEmpty()) {
	            if (uppercaseNames.size() > 1) {
	                sb.append(". AND HELLO, ");
	                for (int i = 0; i < uppercaseNames.size() - 1; i++) {
	                    sb.append(uppercaseNames.get(i)).append(" ");
	                }
	                sb.append("AND ");
	            } else {
	                sb.append(". AND HELLO, ");
	            }
	            sb.append(uppercaseNames.get(uppercaseNames.size() - 1)).append(" !");
	        }

	        return sb.toString();
	    } else {
	        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
	        return "Hello, " + capitalized;
	    }
	}
}
