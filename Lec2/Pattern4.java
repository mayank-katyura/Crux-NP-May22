package Lec2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int space = n - 1;
		int star = 1;
		int row = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			while (j <= star) {
				System.out.print("*"+" ");
				j++;
			}

			// next row
			star++;
			space--;
			row++;
			System.out.println();

		}

	}

}
