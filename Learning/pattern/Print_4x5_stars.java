package pattern;

public class Print_4x5_stars {
	public static void main(String...args) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
