package ch04_3_for;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		for( int i =1; i<10; i++) {
			System.out.println("*** " + i + "´Ü ***");
			for ( int j=1; j<10; j++) {
				System.out.printf("%d X %d = %d", 
						i, j, i*j);
	}
		}
			
		
	}
	
}
