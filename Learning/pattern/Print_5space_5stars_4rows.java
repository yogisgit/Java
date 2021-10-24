package pattern;

public class Print_5space_5stars_4rows {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
