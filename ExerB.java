package exerMatriz;
import java.util.*;
public class ExerB {
	public static void main(String[] args) {
		int i=0, j=0, k=0, max=0, min=0;
		int[][] Mt= new int[3][3];
		String lcMax="", lcMin="";
		Random rand= new Random();
		for (i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				Mt[i][j]= rand.nextInt()%67;
				min=Mt[i][j];
				max=Mt[i][j];
			}
		}
		
		for (i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if (Mt[i][j]<min) {
					min=Mt[i][j];
					lcMin="Min: "+Integer.toString(min)+"; linha: "+Integer.toString(i)+" coluna: "+Integer.toString(j);
				}
				if (Mt[i][j]>max) {
					max=Mt[i][j];
					lcMax="Max: "+Integer.toString(max)+"; linha: "+Integer.toString(i)+" coluna: "+Integer.toString(j);
				}
			}
		}
		for (i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println(Mt[i][j]);
			}
		}
		System.out.println(lcMax);
		System.out.println(lcMin);
	}
}
