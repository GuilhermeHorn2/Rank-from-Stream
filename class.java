package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Number_stream {
	
	
	private ArrayList<Integer> stream;
	private HashMap<Integer,Integer> map;
	
	boolean sorted = false;
	
	Number_stream(){
		stream = new ArrayList<>();
		map = new HashMap<>();
	}
	
	public void track(int x) {
		map.put(x, stream.size()-1);
	}
	
	public void add(int x){
		sorted = false;
		track(x);
		stream.add(x);
	}
	
	public int get_rank(int x){
		
		/*If you call this function sucessivelly the time complexity will of the first call will be O(nlog(n)) -> sort
		 * but starting from the second call to the nth call the time complexity will be 0(1)
		 */
		
		if(!map.containsKey(x)){
			return -1;
		}
		
		if(sorted){
			return map.get(x);
		}
		else {
			stream.sort(Comparator.naturalOrder());
			for(int i = 0;i < stream.size();i++) {
				int key = stream.get(i);
				if(map.containsKey(key)){
					map.put(key, i);
					continue;
				}
				map.put(key, i);
			}
			sorted = true;
			return map.get(x);
		}
		
	}

}
