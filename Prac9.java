import java.util.Scanner;
class Prac9{
	public static void main(String[] args){
		int n,rem,sum=0,sum1=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}

		if(sum>10){
		   	while(sum>0){
				rem=sum%10;
			    sum1=sum1+rem;
			    sum=sum/10;
			}
			System.out.println(sum1);
		}
		else{
		    System.out.println(sum);
		}
	}
}