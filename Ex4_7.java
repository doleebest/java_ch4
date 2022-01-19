class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// Quiz_1 괄호{} 안의 내용을 5번 반복한다.
//		for (int i = 1; i <= 5; i++) {
//			num = (int) (Math.random() * 6) + 1;
//			System.out.println(num);
		
		//Quiz_2 -5~5 사이의 난수 발생
		for (int i=1; i<=5; i++)
		{
		     num = (int)(Math.random()*11)+(-5);
		     System.out.println(num);
		}
		
	}
	}
