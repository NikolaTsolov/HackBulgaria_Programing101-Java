package wednesday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordOccurences {
	
	public static Map<String, Integer> makeTheMap(String inputString){
		String[] inputStrToArray = inputString.split(" ");
		Map<String, Integer> resultMap = new LinkedHashMap<>();
		for(String item : inputStrToArray){
			if(resultMap.containsKey(item)){
				resultMap.put(item, resultMap.get(item) + 1);
			}else{
				resultMap.put(item, 1);
			}
		}
		return resultMap;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		Map<String, Integer> result = makeTheMap(input);
		
		System.out.println(result);
		
		
		sc.close();

	}

}
