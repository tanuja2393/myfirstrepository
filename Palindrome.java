import java.util.Scanner;
class Palindrome {

	public static void main(String[] args) {
		int i,len,temp=1;
		String str;
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		len=str.length();

		for(i=0;i<len/2;i++){
			if(str.charAt(i)!=str.charAt(len-(i+1))){
				temp=0;
				break;
			}
		}	

		if(temp==1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
} 