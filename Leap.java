class Leap{
	public static void main(String[] args){
		int year=Integer.parseInt(args[0]);
		int count = 0;
		if(year>=1000 && year<=9999){
			while(count!=20){
				if(year%4==0){
					count++;
					System.out.println(year);
				}
				year++;
			}
		}
		else
		{
			System.out.println("Invalid Year");
		}
	}
}