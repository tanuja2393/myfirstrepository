class Multiple{
	public static void main(String[] args){
		
		int i;
		for(i=1;i<=100;i++){

			if(i%3==0 && i%5==0){
				System.out.println("35");
			}
			else if(i%3==0){
				System.out.println("FIVE");
			}
			else if(i%5==0){
				System.out.println("THREE");
			}
			else{
				System.out.println(i);
			}
		}
	}
}