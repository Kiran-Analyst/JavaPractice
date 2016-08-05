import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;


public class RemoveDuplicate {

	public void m(){
		int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int current = input[0];
				
		for (int i = 0; i < input.length; i++) {
		 /*   if (current == input[i] && !found) {
		        found = true;
		    } else if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		        found = false;
		    }*/
		    
		    if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		    }
		}
		//System.out.print(" " + current);
	   
	   
	
	}
	public static void main(String[] args) {
		RemoveDuplicate r=new RemoveDuplicate();
		r.m();
	}
}
