import java.util.HashMap;

public class PracticeProblem{
	static int goodString(String str){
		int mincost = 0x3f3f3f3f;
		/* if it was guaranteed that all letters were to be in lowercase
		 * and part of the english alphabet this could be changed
		 * to an integer array of size 26
		 */
		HashMap<Character, Integer> locations = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++){
			char currentLetter = str.charAt(i);
			if(locations.containsKey(currentLetter)){
				int cost = locations.get(currentLetter) + str.length() - 1 - i;
				mincost = Math.min(mincost, cost);
			}else{
				locations.put(currentLetter, i);
			}
		}
		if(mincost == 0x3f3f3f3f){
			mincost = -1;
		}
		return mincost;
	}

	public static void main(String args[]){}
}
