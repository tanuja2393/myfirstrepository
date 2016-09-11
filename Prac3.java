import java.util.Scanner;
class Prac3{
	public static void main(String[] args){
		int i,num,dnum,len;
		String str1;
		StringBuffer str2=new StringBuffer();
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		len=str1.length();
		for(i=0;i<len;i++){
			char ch=str1.charAt(i);
			if(Character.isDigit(ch)){
				str2.append(ch);
			}
		}
		num=Integer.parseInt(str2.toString());
		System.out.println("num="+num);
		dnum=num*2;
		System.out.println("double="+dnum);
	}
	
}