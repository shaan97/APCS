public class Chp2ex7{
	public static void main(String[] args){
		for(int counter = 1; counter <= 5; counter++){
			for(int count = 5; count >= counter; count--){
				System.out.print(" ");
			}
			System.out.print(counter);
			System.out.println(" ");
		}
	}
}