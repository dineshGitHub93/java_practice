package com.collections.customobject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DemoGraph {
	
	String name;
	String city;
	
	public DemoGraph(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "DemoGraph [name=" + name + ", city=" + city + "]";
	}
	
}
public class GroupingExample {

	public static void main(String[] args) {
		
		List<DemoGraph> demograph = new ArrayList<DemoGraph>();
		demograph.add(new DemoGraph("AAA", "Tamil Nadu"));
		demograph.add(new DemoGraph("BBB", "Mumbai"));
		demograph.add(new DemoGraph("CCC", "Kerala"));
		demograph.add(new DemoGraph("DDD", "Tamil Nadu"));
		demograph.add(new DemoGraph("EEE", "Mumbai"));
		demograph.add(new DemoGraph("FFF", "Kerala"));
		
		//Group people by city
		Map<String, List<DemoGraph>> gropedByCity = new HashMap<String, List<DemoGraph>>();
		
		for (DemoGraph demoGraph2 : demograph) {
			
			gropedByCity.computeIfAbsent(demoGraph2.city, k -> new ArrayList<DemoGraph>()).add(demoGraph2);
		}

		//print grouped results 
		for(Map.Entry<String, List<DemoGraph>> entry : gropedByCity.entrySet()) {
			
			System.out.println(entry.getKey()+ ": "+entry.getValue());
		}
	}

}
