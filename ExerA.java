package exerMatriz;
import java.util.*;
public class ExerA{
	public static void main (String[]args){
		int[][] Mt= new int [4][4];
		int i=0, j=0, k=1;
		Scanner in= new Scanner (System.in);
		Random rand = new Random ();
		for (i=0;i<4;i++){
			for (j=0;j<4;j++){
				Mt[i][j]= (int) Math.pow(2, k);
				k++;
			}
		}
		for (i=0;i<4;i++){
			for (j=0;j<4;j++){
				System.out.println(Mt[i][j]);
			}
		}
	}
	
}