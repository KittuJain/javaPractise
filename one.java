class One {
	public static void main(String[] args) {
		int count = 1;
		while(count<=10){
			System.out.println("hi "+count);
			if(count > 7)
				break;
			count++;
		}
	}
	public static int add (int a, int b){
		return a+b;
	}
}
