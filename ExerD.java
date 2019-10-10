package exerMatriz;
import java.util.*;
public class ExerD {
	public static void main(String[] args) {
		int [][] cartela= new int[4][4];
		int i=0, j=0, k, p=0, d=0, doze;
		ArrayList<Integer> numUsad= new ArrayList<>();
		Random rand= new Random();
		while(numUsad.size()<2) {
				k=(rand.nextInt(75)+1);
				for (p=0;p<numUsad.size();p++) {
					if (k!=numUsad.get(p)) d++;
				}
				if (d==numUsad.size()) numUsad.add(k);
		}
		for (p=0;p<numUsad.size();p++) System.out.println(numUsad.get(p));
	}
}
