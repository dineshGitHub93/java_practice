package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsolidatedListOperations {
	public static void main(String[] args) {
        List<String> robbers = Arrays.asList(//Robbers Characters
                "Professor", "Tokyo", "Berlin", "Nairobi",
                "Rio", "Denver", "Helsinki", "Rio",
                "Lisbon", "Stockholm", "Palermo", "Nairobi", "Professor");
        List<String> police = Arrays.asList(//Police Characters
                "Alicia Sierra", "Raquel Murillo", "Angel Rubio", "Tamayo");
        List<String> others = Arrays.asList("Arturo Roman", "Monica Gaztambide", "Gandia" );
		//Iterate elements using forEach() or enhanced for-loop
		System.out.println("Iteation: ");
		others.forEach(other -> System.out.println(other));

		// 3. Sorting (Alphabetical)
		List<String> sortedPolice = new ArrayList<String>(police);
		sortedPolice.sort(String::compareTo);
		System.out.println("Print sorted List :"+sortedPolice);

		//4 Uses Stream to filter fruits that start with "A".
		List<String> aPolice = police.stream()
				.filter(mPolice -> mPolice.startsWith("A")).toList();
		System.out.println("Filtered data starts with A :"+aPolice);

		//5 Removes duplicates using .distinct() in a stream.
		List<String> uniqueRobbers = robbers.stream()
				.distinct().collect(Collectors.toList());
		System.out.println("Print Unique robbers Names :"+uniqueRobbers);

		//6 Creates list and merge it with the original using .addAll()
		List<String> moreRobbers = Arrays.asList("Monica Gaztambide", "Raquel Murio");
		List<String> mergedList = new ArrayList<String>(uniqueRobbers);
		mergedList.addAll(moreRobbers);
		System.out.println("Merged Robbers List : "+mergedList);

		//7 Checks if certain elements exist in the list using .contains().
		System.out.println("Check Contains Monica Gaztambide? :"+mergedList.contains("Monica Gaztambide"));
		System.out.println("Check Contains Rio? :"+robbers.contains("Rio"));

		//8 Reverses the order using Collections.reverse().
		List<String> reversedList = new ArrayList<String>(uniqueRobbers);
		Collections.reverse(reversedList);
		System.out.println("Reversed List :"+reversedList);

		//9 Clears the list and checks if it’s empty using .isEmpty().
		List<String> clearList = new ArrayList<String>(others);clearList.clear();
		System.out.println("After clear :"+clearList+" (isEmpty = "+clearList.isEmpty()+")");
		
		//10 Retrieves element at index 2 ("Berlin").
		System.out.println("Retrive element at index 2: "+robbers.get(2));
		
		//Removes the first "Nairobi" by value.
		List<String> removableList = new ArrayList<String>(police);
		removableList.remove("Angel Rubio");
		removableList.remove(1);
		System.out.println("After Removals : "+removableList);
		
		//11 Updates index 0 ("reversedList") to "Suarez" using .set().
		List<String> modifyList = new ArrayList<String>(police);
		modifyList.set(0, "Suarez");
		System.out.println("After Update: "+modifyList);
		
		//12 Prints the total number of items.
		System.out.println("Size of robbers list: " + robbers.size());
		
		//13 Creates a sublist from index 1 to 2 (Tokyo, Berlin).
		List<String> subList = robbers.subList(1, 3);
		System.out.println("Sublist (1 to 2): "+subList);
		
		//14 Converts the list to a String[] array.
		String[] robbersArray = robbers.toArray(new String[0]);
		System.out.println("Arrays :"+Arrays.toString(robbersArray));
		
		//Combine into one list with tags
		Map<String, List<String>> groupCharacters = new LinkedHashMap<String, List<String>>();
		groupCharacters.put("Robbers", robbers);
		groupCharacters.put("Police", police);
		groupCharacters.put("others", others);
		
		//Display grouped characters
		groupCharacters.forEach((role, names)-> {
			System.out.println(role+ ":");
			names.forEach(name ->System.out.println(" - "+name));
		});
		
		// Filter all characters whose names start with "P"
		List<String> allCharacters = new ArrayList<String>();
		groupCharacters.values().forEach(allCharacters::addAll);
		
		List<String> startsWithP = allCharacters.stream()
				.filter(name -> name.startsWith("P"))
				.collect(Collectors.toList());
		System.out.println("Characters starting with 'P': "+startsWithP);
	}
}