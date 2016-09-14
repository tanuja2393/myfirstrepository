import java.util.Scanner;
class Prac14{
	public static void main(String[] args){
	int n,i;
	System.out.println("Enter the size:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("Enter the numbers:");
	int array[] = new int[n];
	for(i=0;i<n;i++){
		array[i] = sc.nextInt();
	}

	for(i=0;i<n;i++){
		if((array[i]%2)==0){
			System.out.println(array[i]);
		}
	}

	}
}
