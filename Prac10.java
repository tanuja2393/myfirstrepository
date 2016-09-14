import java.util.Scanner; 
class Prac10 {
	public static void main(String[] args){

	System.out.println("enter the date:");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
	int date,month,sum=0,lsum=0;
		StringBuffer temp1=new StringBuffer();
		StringBuffer temp2=new StringBuffer();

		temp1.append(str.charAt(0));
		temp1.append(str.charAt(1));

		date=Integer.parseInt(temp1.toString());

		temp2.append(str.charAt(3));
		temp2.append(str.charAt(4));

		month=Integer.parseInt(temp2.toString());


		for(int i=0;i<month-1;i++){
			sum=sum+days[i];
		}

		sum=sum+date;
		System.out.println(sum);
	}
}