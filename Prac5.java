import java.util.Scanner;
class Prac5{
	public static void main(String[] agrs){
		int len1,len2,i,j,count=0;
		String str1,str2;
		System.out.println("enter a strings");
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		str2=sc.next();
		len1=str1.length();
		len2=str2.length();
		for(i=0;i<len1;i++){
			for(j=0;j<len2;j++){
				char ch1=str1.charAt(i);
				char ch2=str2.charAt(j);
				if(ch1==ch2){
					count++;
					break;
				}
			}		
		}
		if(count==len1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}