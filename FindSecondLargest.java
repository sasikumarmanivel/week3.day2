package Week3;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	//List<Integer> list = Arrays.asList(null)	
		
			Integer[] data = {3,2,11,4,6,7};
			Arrays.sort(data);
			List<Integer> list = Arrays.asList(data);
			Integer secondlargestnumber=list.get(list.size()-2);
			System.out.println(secondlargestnumber);
			
		
		
	}

}
