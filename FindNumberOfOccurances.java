package Week3;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] arr = {2,3,5,6,3,2,1,4,2,1,6,-1};
Map<Integer,Integer> map = new TreeMap<>();
for(Integer eachnumber : arr)
{
	if(map.containsKey(eachnumber))
			{
		     map.put(eachnumber, map.get(eachnumber)+1);
			}

	else
	{
		map.put(eachnumber, 1);
	}
}
System.out.println(map);


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
