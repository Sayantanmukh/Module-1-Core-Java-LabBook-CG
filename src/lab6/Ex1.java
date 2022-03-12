package lab6;

//import java.util.Map.Entry;
import java.util.*;

public class Ex1 {
	
	/*public static List<Entry<String, Integer>> getValues (HashMap<String, Integer> hm){
		List <Entry<String,Integer>> list= new LinkedList<Entry<String,Integer>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
		
		return list;
		
	}*/
	
	public static List< Integer> getValues (HashMap<String, Integer> hm){
		List <Integer> list= new LinkedList<Integer>(hm.values());
		Collections.sort(list);
		
		
		return list;
		
	}
	
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm =new HashMap<>();
		hm.put("Physics", 85);
		hm.put("Maths", 98);
		hm.put("Chemistry", 87);
		hm.put("Biology", 82);
		hm.put("Language", 80);
		hm.put("Computer Science", 91);
		
		System.out.println(hm);
		
		List<Integer> l=Ex1.getValues(hm);
		System.out.println(l);
		
		
		
		
	}

}
