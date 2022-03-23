import java.util.*;
class Occur{
	
	static void freqCount(String str){
		Map freqCount = new LinkedHashMap<Character,Integer>();
		for(char ch:str.toCharArray()){
			if(freqCount.containsKey(ch)){
				freqCount.put(ch,(Integer) freqCount.get(ch)+1);
			}
			else{
				freqCount.put(ch,1);
			}
		}
		System.out.println(freqCount);
	}

	public static void main(String [] s){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		freqCount(str);
				
		
	}
}