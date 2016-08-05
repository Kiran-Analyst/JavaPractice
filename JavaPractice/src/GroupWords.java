import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class GroupWords {

	// abc, def, cab, ddd, dde, dfe ==> (abc, cab), (def, dfe), ddd, dde

	public static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args){
		ArrayList<String> inputList = new ArrayList<String>(); 
		inputList.add("abc");
		inputList.add("def");
		inputList.add("cab");
		inputList.add("ddd");
		inputList.add("dde");
		inputList.add("dfe");
		inputList.add("bca");
			
			
			//char[] carr1 = new String("Kiranranran").toCharArray();
			//Arrays.sort(carr1);
			//System.out.println(areSimilar("Kiranranran","ranKiranran"));
			//for(char str: carr1)
			//	System.out.print(str);
			//System.out.println("");
			//Printing Before the Grouping
			//for(String str: inputList){
			//	System.out.print(str);
			//	System.out.print(",");
			//}
			System.out.println(inputList);
			group1(inputList);
			
			//Printing After the Grouping
			for(String str: list){
				System.out.println(str);
				System.out.print(",");
			}
		}
		
		
	
	
	public static void group(List<String> values){
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < values.size(); i++) {
            String firstWord = values.get(i);
             if(!list.contains(firstWord)){
            	 list.add(firstWord);
             }
             for (String secondword : list) {
				if(areSimilar(firstWord,secondword)){
					if(!list.contains(secondword)){
						list.add(secondword);
					}
				}
			}
		}
		System.out.println(list);
		
	}
	
	public static void group1(List<String> values)
	{
		String[] inputList = new String[values.size()];
		values.toArray(inputList);
				
		for(int start = 0;start<inputList.length;start++){
			StringBuffer groupString = new StringBuffer(inputList[start]);
			
			//currentString = inputList.;
			if(start == (inputList.length-1)){
				list.add(inputList[start]);
				break;
			}
				
			int temp = start +1; 
			for(;temp<inputList.length;temp++){
				if(areSimilar(inputList[start],inputList[temp])){
					groupString.append(',');
					groupString.append(inputList[temp]);
					
					start++;
					if(start>=inputList.length)
							break;
					String tempString=inputList[start];
					inputList[start]=inputList[temp];
					inputList[temp]=tempString;
				}
				
				
				//temp++;
			}
			list.add(groupString.toString());
		}
		
		//System.out.println(list);
	 
	}

	// If the letters in the first word can be rearranged to form the second word
	// word1 and word2 are composed of same characters
	static Boolean areSimilar(String word1, String word2)
	{
		
		//String [] strarr = new String[2];
		//strarr[0] = word1;
		//strarr[1] = word2;
		if(word1.length() != word2.length()){
			return false;
		}
		else{
			
			//converting strings to char arrays
			char[] charArray1 = word1.toCharArray();
			char[] charArray2 = word2.toCharArray();
			//Sorting the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			
			return Arrays.equals(charArray1, charArray2);
		}
	
		
	}
}
