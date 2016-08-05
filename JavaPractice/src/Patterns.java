import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Patterns {
	public static void main(String[] args){
		String line = "Hi,Hadoop";
		Pattern p = Pattern.compile("[^A-Za-z0-9 ,]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(line.toString());
		if(m.find()){
			//log.info("Line Num: " + count + "\tLine : " + line);
			System.out.println("Special Symbol found");
		}
		else{
			StringTokenizer st = new StringTokenizer(line.toString());
			while(st.hasMoreElements()){
				//word.set(st.nextToken());
				//con.write(word, one);
				System.out.println(st.nextToken());
			}
		}
	}
}
	
