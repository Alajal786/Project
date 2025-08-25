package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
	HashMap<String, Integer>data = new HashMap<String,Integer>();
	data.put("java", 123456);
	data.put("sutherland", 678922);
	data.put("java", 24444);
	data.put("chaelres", 3482777);
	data.put("gacvin", 2434874);
	System.out.println(data);
	System.out.println(data.get("java"));
	Set<Entry<String, Integer>>set = data.entrySet();
	Iterator<Entry<String,Integer>>itr =set.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());

	}

}
