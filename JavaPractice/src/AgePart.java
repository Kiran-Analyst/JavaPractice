import org.apache.hadoop.io.Text;


public class AgePart {
	public static void main(String[] args){
		Text StdName = new Text("Kiran");
		Text avgMarks = new Text("61.0");
		int noOfReducers = 3;
		
		float marksAvg = Float.parseFloat(avgMarks.toString());
		//if (noOfReducers==0)
		//	return 0;
		if(marksAvg>70.0){
			System.out.println(0);
		}
		else if(marksAvg>60.0){
			System.out.println( 1 % noOfReducers);
		}
		else if (marksAvg>50.0){
			System.out.println( 2 % noOfReducers);
		}
		else {
			System.out.println( 3 % noOfReducers);
		}
		
		//return 0;
	}
	
}
