package ch04_3_for;

public class BreakOutterExample {
	public static void main(String[] args) {
		
	Escape:	for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
					if(lower =='g') {
						break Escape;
					}
			}
		
		}	
		System.out.println("���α׷� ���� ����");
		
		
		
		
		
		
	

}	
		
}	