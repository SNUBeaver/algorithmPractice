package backjoon_for;

import java.util.Scanner;

public class For6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		int i,j;
		for (i=temp;i>=1;i--) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
