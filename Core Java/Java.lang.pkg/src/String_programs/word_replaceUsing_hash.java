package String_programs;

import java.util.HashMap;
import java.util.Map;

//ip how are you today
//o/p how r u 2day
public class word_replaceUsing_hash {
	public static void main(String[] args) {
		String s = "how are you today";
		System.out.println(s);
		// using hashmap
		
		Map<String,String>m=new HashMap<>();
		
		for(String word:s.split(" "))
		{
			if(m.get(word)==null)
			{
				m.put(word, word);
			}
		}
		
//		putting the value in map
		m.put("are", "r");
		m.put("you", "u");
		m.put("today","2day");
		
		for(String s2:s.split(" "))
		{
			System.out.print(m.get(s2)+" ");
		}

	}

}
