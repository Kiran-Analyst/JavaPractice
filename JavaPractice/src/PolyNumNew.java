import java.util.Scanner;


public class PolyNumNew {
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
		int firstPartLength =0;
		
		if (noOfDigits==1){
			firstPart=Integer.parseInt(StartingNum);
			for(int i=firstPart;i<=9;i++){
				firstPart=i;
				count++;
				if (count>=reqCount){
					break;
				} 
			}
			firstPart=10;
			isOddDigit=false;
		}else{
		
			
			if (noOfDigits%2==1){
				isOddDigit = true;
				//oddDigit = Integer.parseInt(StartingNum.charAt((noOfDigits/2)) + "");
				firstPart = Integer.parseInt(StartingNum.substring(0,noOfDigits/2 + 1));
				secondPart = Integer.parseInt(StartingNum.substring((noOfDigits/2)+1));
				firstPartLength = (noOfDigits/2) + 1;
				//firstPartRev = Integer.parseInt(StartingNum.substring((noOfDigits/2)+1));
			} else {
				isOddDigit = false;
				//oddDigit = Integer.parseInt(StartingNum.charAt((noOfDigits/2)) + "");
				firstPart = Integer.parseInt(StartingNum.substring(0,noOfDigits/2));
				secondPart = Integer.parseInt(StartingNum.substring(noOfDigits/2));
				firstPartLength = (noOfDigits/2);
			}
		}	
			
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
		} else{
			if (secondPart < revNum(firstPart/10)){
				count++;
			}
		}
		System.out.println("count : " + count);
		
	outer:	while (true){
			if (count>=reqCount){
				break;
			}
			
			if (firstPartMax<firstPart){
				
					 
				if (isOddDigit)
				{
				isOddDigit=false;
				//firstPartLength++;
				//firstPartMax = (int)Math.pow(10,firstPartLength)-1;
				 firstPart/=10;
				}
				else 
				{
					isOddDigit=true;
					//firstPart/=10;
					firstPartLength++;
					firstPartMax = (int)Math.pow(10,firstPartLength)-1;
				}
			}
			/*
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
			*/
			firstPart++;
			count++;
			System.out.println(firstPart);
			
		}
		int temp;
		StringBuilder sb= new StringBuilder();
		
		
		if (isOddDigit) {
			temp=firstPart/10;
			while (temp%10==0 && temp>0){
				sb.append(0);
				temp/=10;
			}
			reqPolyNum = firstPart + "" + sb + revNum(firstPart/10);
			System.out.println("firstPart :" + revNum(firstPart));
			System.out.println("rev Num :" + revNum(firstPart/10));
		}
		else{
			temp=firstPart;
			while (temp%10==0){
				sb.append(0);
				temp/=10;
			}
			reqPolyNum = firstPart + "" + sb + revNum(firstPart);
			System.out.println("firstPart :" + firstPart);
			System.out.println("rev Num :" + revNum(firstPart));
		}
		//reqPolyNum = firstPart + "" + sb + revNum(firstPart);
		System.out.println(reqPolyNum);
		System.out.println("sb :" + sb.toString());
		System.out.println("rev Num :" + revNum(firstPart/10));
		
		
	}
}
