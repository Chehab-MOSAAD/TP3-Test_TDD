package ilu2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Welcome {
	
	public static String Welcome(String name) {
	    if (name == null || name.trim().isEmpty()) {
	        return "Hello, my friend";
	    } else if (name.equals(name.toUpperCase())) {
	        return uppercaseGreeting(name);
	    } else if (name.contains(",")) {
	        return multiNameGreeting(name);
	    } else {
	        return capitalizeGreeting(name);
	    }
	}

	private static String capitalizeGreeting(String name) {
	    String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
	    return "Hello, " + capitalized;
	}

	private static String uppercaseGreeting(String name) {
	    return "HELLO, " + name.toUpperCase() + " !";
	}

	private static String multiNameGreeting(String name) {
	    String[] names = name.split(",");
	    Map<String, Integer> counts = new LinkedHashMap<>();
	    for (String n : names) {
	        String trimmedName = n.trim();
	        counts.put(trimmedName, counts.getOrDefault(trimmedName, 0) + 1);
	    }

	    List<String> capitalizedNames = new ArrayList<>();
	    List<String> uppercaseNames = new ArrayList<>();
	    for (Map.Entry<String, Integer> entry : counts.entrySet()) {
	        String n = entry.getKey();
	        Integer count = entry.getValue();
	        if (n.equals(n.toUpperCase())) {
	            uppercaseNames.add(n + (count > 1 ? " (x" + count + ")" : ""));
	        } else {
	            capitalizedNames.add(n.substring(0, 1).toUpperCase() + n.substring(1) + (count > 1 ? " (x" + count + ")" : ""));
	        }
	    }

	    return multiNameGreetingBuilder(capitalizedNames, uppercaseNames);
	}

	private static String multiNameGreetingBuilder(List<String> capitalizedNames, List<String> uppercaseNames) {
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
	}
}
