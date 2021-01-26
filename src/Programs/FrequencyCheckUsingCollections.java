package Programs;

import java.util.HashMap;

public class FrequencyCheckUsingCollections {
	public void freq()
	{
		 String str = "javaaa";
		  
	      HashMap<Character,Integer> charFreqMap = new HashMap<>();
	      for(int i= 0 ; i< str.length() ; i++) {
	          Character ch=str.charAt(i);
	         if(charFreqMap.containsKey(ch)) {
	            int count = charFreqMap.get(ch);
	            charFreqMap.put(ch,count+1);
	         } else {
	             charFreqMap.put(ch,1);
	         }
	      }
	      System.out.println(charFreqMap);
	}
	public static void main(String[] args) {
		FrequencyCheckUsingCollections freqcheck=new FrequencyCheckUsingCollections();
		freqcheck.freq();
	}


}
