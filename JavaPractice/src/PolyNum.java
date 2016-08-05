import java.util.Scanner;


public class PolyNum {
	
	public static int revNum(int x){
	int revNum=0;
		while(x>0){
		revNum=(revNum*10) + (x%10);
		x=x/10;
	}
		return revNum;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String StartingNum = sc.next();
		int reqCount = sc.nextInt();
		int noOfDigits = StartingNum.length();
		System.out.println(noOfDigits);
		System.out.println(reqCount);
		boolean isOddDigit = false;
		int oddDigit=0;
		int count=0;
		int firstPart =0;
		int secondPart =0;
		//int firstPartRev = 0;
		if (noOfDigits%2==1){
			isOddDigit = true;
			oddDigit = Integer.parseInt(StartingNum.charAt((noOfDigits/2)) + "");
			firstPart = Integer.parseInt(StartingNum.substring(0,noOfDigits/2));
			secondPart = Integer.parseInt(StartingNum.substring((noOfDigits/2)+1));
			//firstPartRev = Integer.parseInt(StartingNum.substring((noOfDigits/2)+1));
		} else {
			isOddDigit = false;
			//oddDigit = Integer.parseInt(StartingNum.charAt((noOfDigits/2)) + "");
			firstPart = Integer.parseInt(StartingNum.substring(0,noOfDigits/2));
			secondPart = Integer.parseInt(StartingNum.substring(noOfDigits/2));
		}
			int firstPartLength = noOfDigits/2;
			int firstPartMax = (int)Math.pow(10,firstPartLength)-1;
			String reqPolyNum;
		System.out.println("isOddDigit : " + isOddDigit);
		System.out.println("oddDigit : " + oddDigit);
		System.out.println("firstPart : " + firstPart);
		System.out.println("secondPart : " + secondPart);
		System.out.println("firstPartMax : " + firstPartMax);
		
		if (!isOddDigit){
			if (secondPart < revNum(firstPart)){
				count++;
			}
		}
		
	outer:	while (true){
			if (count>=reqCount){
				break;
			}
			
			if (firstPartMax<=firstPart){
				
				firstPart++;
				 
				if (isOddDigit)
				{
				isOddDigit=false;
				firstPartLength++;
				firstPartMax = (int)Math.pow(10,firstPartLength)-1;
				}
				else 
				{
					isOddDigit=true;
					firstPart/=10;
				}
			}
			if (isOddDigit){
				for(int i=oddDigit;i<=9;i++){
					oddDigit=i;
					count++;
					if (count>=reqCount){
						break outer;
					} 
				}
				oddDigit=0;
			}
			
			firstPart++;
			count++;
			System.out.println(firstPart);
			
		}
		int temp=firstPart;
		StringBuilder sb= new StringBuilder();
		while (temp%10==0){
			sb.append(0);
			temp/=10;
		}
		
		if (isOddDigit) 
			reqPolyNum = firstPart + "" + oddDigit + "" + sb + revNum(firstPart);
		else
			reqPolyNum = firstPart + "" + sb + revNum(firstPart);
		System.out.println(reqPolyNum);
	}

}
