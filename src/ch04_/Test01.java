package training;

public class Test01 {
	public static void main(String[] args) {

		// switch 문으로...
	int n = (int)(Math.random()*100);
		System.out.println(n);
		
		int num = n / 10;
		System.out.println(num);
		
		 switch(num) {
		case 1;
			System.out.println("0 이상 10 미만의 수");
			break;
		case 2;
			System.out.println("10 이상 20 미만의 수");
			break;
		case 3;
			System.out.println("20이상 30 미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30 이상의 수");
		}
		
		
		
		
/*		int n = 24;
		if(n >= 0 && n < 10) {
			System.out.println("0 이상 10 미만의 수 ");
		}
		else if(n >= 10 && n < 20) {
			System.out.println("10 이상 20 미만의 수");
		}
		else if(n >= 20 && n < 30) {
			System.out.println("20 이상 30 미만의 수");
		}
		else {
			System.out.println("음수 혹은 30 이상의 수");
		}
*/
		
		
		
		
		
		
		
		
		
		
		
		
//	이거를 if한번만 ....
//		int num = 120;
//	if (num > 0 && (num%2) == 0) {
//			System.out.println("양수 이면서 짝수");
		
		

		
		
	}
}

