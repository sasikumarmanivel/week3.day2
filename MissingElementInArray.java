package Week3;

import java.util.Arrays;
import java.util.List;




public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {1,2,3,4,7,6,8};
		List<Integer>list = Arrays.asList(arr);
		for(int i=0;i<list.size();i++) {
			int j=i+1;
			if(list.get(i)!=j)
			{
				System.out.println("Missing elenet is "+j);
				break;
			}
			
		}
	
	
	
	
	}

}
