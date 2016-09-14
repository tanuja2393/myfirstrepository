import java.util.Scanner;
class Prac15{
	public static void main(String[] args){
		int n,i,temp,j;
		System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the numbers:");
		int array[] = new int[n];
		for(i=0;i<n;i++){
			array[i]=sc.nextInt();
		}

		for(i=0;i<n;i++){	
			for(j=i+1;j<n;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++){
		
			System.out.println(array[i]);
		}
	}

}