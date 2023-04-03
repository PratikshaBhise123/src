package collection_framework;
import java.util.*;

public class Demo {

	public static void main(String args[])
	{
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listNumbers);
		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		System.out.println(uniqueNumbers);
		
		
		
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		names.add("Peter");
		names.add("Alice");
		 
		 
		Iterator<String> iterator = names.iterator();
		 
		while (iterator.hasNext()) {
		    String name = iterator.next();
		    System.out.println(name);
		}
		
		
		
		
		
		Map<String, String> mapCountryCodes = new HashMap<>();
		 
		mapCountryCodes.put("1", "USA");
		mapCountryCodes.put("44", "United Kingdom");
		mapCountryCodes.put("33", "France");
		mapCountryCodes.put("81", "Japan");
		 
		
		Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();
		 
		for (Map.Entry<String, String> entry : entries) {
		    String code = entry.getKey();
		    String country = entry.getValue();
		 
		    System.out.println(code + " => " + country);
		}
		
		
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    

		
		
		
		
		
		
		
		
	}
}
