package Week3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list = Arrays.asList(arr);
         Set<Integer> set = new LinkedHashSet<Integer>();  
         for(Integer number :list) {
        	 if(set.add(number)== false)
        	 {
        		 System.out.println(number);
        	 }
         }
		
		
		
		
		
		
		
		
	}

}
