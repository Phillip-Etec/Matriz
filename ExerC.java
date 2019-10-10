package exerMatriz;
import java.util.*;
public class ExerC {
	public static void main(String[] args) {
		int[][] Mt= new int[3][4];
		int i=0, j=0, soma=0;
		Random rand= new Random();
		for (i=0;i<3;i++) {
			for (j=0;j<4;j++) {
				Mt[i][j]=rand.nextInt()%33;
			}
		}
		for (i=0;i<3;i++) {
			for (j=0;j<4;j++) {
				System.out.printf("%-3d",(Mt[i][j]));
				System.out.println("");
			}
		}
		for (i=0;i<3;i++) {
			for (j=0;j<4;j++) {
				soma+=Mt[i][j];
			}
		}
		System.out.println("soma : "+soma);
	}
}
