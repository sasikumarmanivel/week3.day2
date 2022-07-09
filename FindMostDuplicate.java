package Week3;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abbaba"; 
        Map<Character, Integer> map = new HashMap<>(); //Using hashmap to print in random order
        char str = input.charAt(0); 
        int count = 0;
        char[] charArray = input.toCharArray(); //converting string into character
        for(int i = 0;i< charArray.length; i++) //iterating using for loop till the character array length
        {
			
			   map.put(charArray[i], map.getOrDefault(charArray[i],0)+1);		
		       if(map.get(charArray[i])>count) 
			  {
				str= charArray[i]; 
				count=map.get(charArray[i]); 
			  }
		  }
       System.out.println("Number of times" + " " + str + " " +  "occurs in string abbaba is" + " " +count);
	
	
	
	
	
	}

}
