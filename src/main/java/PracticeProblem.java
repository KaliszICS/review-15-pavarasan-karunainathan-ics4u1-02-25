public class PracticeProblem{
	static int goodString(String str){
		int mincost = 0x3f3f3f3f;
		for(int i = 0; i < str.length(); i++){
			int lower = str.indexOf(str.charAt(i));
			int upper = str.lastIndexOf(str.charAt(i));
			if(upper != lower){
				mincost = Math.min(mincost, lower + str.length()-1 - upper);
			}
		}
		if(mincost == 0x3f3f3f3f){
			mincost = -1;
		}
		return mincost;
	}

	public static void main(String args[]){}
}
