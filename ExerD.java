package projetao;
import java.util.*;
public class ExerD {
	public static void main(String[] args) {
		int [][] cartela= new int[4][4];
		int i=0, j=0, k=16, p=0, d=0, doze, cont=0;
		ArrayList<Integer> numUsad= new ArrayList<>();
		ArrayList<Integer> Canto= new ArrayList<>();
		Random rand= new Random();
		for (doze=1;doze<76;doze++) {
			numUsad.add(doze);
			Canto.add(doze);
		}
		Collections.shuffle(numUsad);
		Collections.shuffle(Canto);
		//for (p=0;p<75;p++) System.out.println(numUsad.get(p)+" | "+Canto.get(p));
		//for (p=0;p<75;p++) numUsad.set(p, p+1);
		//Collections.shuffle(numUsad);
		//Collections.shuffle(Canto);
		for (i=0;i<4;i++) {
			for (j=0;j<4;j++) {
				cartela[i][j]=numUsad.get(d);
			d++;
			}
		}
		System.out.println("Sua cartela é:");
		for (i=0;i<4;i++) {
			for (j=0;j<4;j++) {
				System.out.printf("%-2d", cartela[i][j]);
				System.out.print("	");
			}
			System.out.println("");
		}
		System.out.println("");
		i=0;
		while (cont<16) {
			System.out.println("Canto n°"+(i+1)+": "+Canto.get(i));
			for (j=0;j<4;j++) {
				for (int y=0;y<4;y++) {
					if (Canto.get(i)==cartela[j][y]) {
						k--;
						if (k!=0)System.out.println("Numero acertado! Só restam "+k+" para completar o bingo");
						else System.out.println("Numero acertado!");
					cont+=1;
					}
					
				}
			}
			if (k!=0)System.out.println();
			i++;
		}
		System.out.println("BINGO! na rodada "+(i));
	}
}
