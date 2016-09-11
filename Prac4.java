import java.util.Scanner;
class Prac4{
	public static void main(String[] args){
		int i,num,rem,sum=0;
		System.out.println("enter the number");
			Scanner sc=new Scanner(System.in);
			i=sc.nextInt();
			num=i;
			while(i>0){
				rem=i%10;
				sum=sum+(rem*rem*rem);
				i=i/10;
			}
			if(num==sum){
				System.out.println("it is armstrong number");
			}
			else{
				System.out.println("it is not an armstrong number");
			}
	}
}