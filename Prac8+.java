import java.util.Scanner;
class Prac8a{
	public static void main(String[] args){
		int a=0,b=1,c=2,i,d,count=0,n;
		
		System.out.println("enter number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(" "+a);
		System.out.println(" "+b);
		System.out.println(" "+c);
		d=a+b+c;
		for(i=2;i<n;i++){
			d=a+b+c;
			a=b;
			b=c;
			c=d;
			System.out.println(" "+d);
			count++;
		}

	}
}