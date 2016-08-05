import java.util.Scanner;
public class MaxNum {
	
		 public static void main(String[] args) {
			 Scanner in = new Scanner(System.in);
		        int t = in.nextInt();
		        for (int i=1;i<=t;i++){
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int count=0;
		            int start = (int)Math.ceil((Math.sqrt(a)));
		            int startNum=(int)Math.pow(start, 2);
		            while(startNum<=b){
		            	count++;
		            	startNum=(int)Math.pow(++start, 2);
		            }
		            System.out.println(count);
		            
		            //Integer
		        }
		    }
}
