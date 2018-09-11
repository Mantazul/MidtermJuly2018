package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
	public static void main( String[] args ) {
		Map <Integer, String> map = new HashMap <Integer, String>();
		map.put(1, "H");
		map.put(2, "He");
		map.put(3, "Li");
		for (Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+ " " +m.getValue());

		}

	}

}