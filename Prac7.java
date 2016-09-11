import java.util.Scanner;
class Prac7{
	public static void main(String[] args){
		int n,j,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
		    }
		    System.out.print("\n");
	    }
	}
}