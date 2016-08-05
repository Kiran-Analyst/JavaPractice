import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class TestArrayList {

	public static void main(String[] args){
		
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(new Integer(10));
		//a1.add("Kiran");
		a1.add(new Integer(20));
		a1.add(new Integer(30));
		a1.add(new Integer(40));
		a1.add(new Integer(20));
		a1.add(new Integer(30));
		a1.add(new Integer(40));
		//System.out.println(a1);
		ArrayList<Integer> a2 = new ArrayList(a1);
		//String s1 = a2.get(0);
		//Integer i1 = a2.get(0);
		a2.remove(new Integer(30));
		a2.add(new Integer(50));
		//a2.add("kiran");
		//a2.get(0).getClass().getName();
		
		System.out.println(a2);
		//System.out.println(a2.get(0));
		
//		LinkedList<Integer> l1 = new LinkedList(a1);
//		System.out.println(l1);
//		TreeSet<Integer> ts = new TreeSet(a1);
//		System.out.println(ts.size());
//		System.out.println(ts);
//		HashSet hs = new HashSet(a1);
//		System.out.println(hs);
//		ArrayList a3 = new ArrayList(hs);
//		System.out.println(a3);
//		Collections.sort(a3);
//		System.out.println(a3);
//		System.out.println(Collections.max(a3));
//		System.out.println(Collections.min(hs));
//		System.out.println(Collections.binarySearch(a3,20));
		System.out.println("Size :  " + a2.size());
		System.out.println("Set at index 1  :  " + a2.set(1,70));
		System.out.println(a2);
		System.out.println("Hashcode :  " + a2.hashCode());
		System.out.println("Lst index of 40 :  " + a2.lastIndexOf(40));
		System.out.println("To String :  " + a2.toString());
		System.out.println("Size :  " + a2.addAll(a1));
		System.out.println(a2);
		System.out.println("Size :  " + a2.getClass());
		Object[] obj = a2.toArray();
		for(Object ob: obj){
			System.out.println(ob);
		}
		System.out.println("Size :  " + a2.subList(2,6));
		System.out.println(a2);
		a2.trimToSize();
		a2.add(new Integer(100));
		System.out.println(a2);
		
		
	}
	
}
