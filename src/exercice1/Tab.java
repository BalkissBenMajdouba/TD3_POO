package exercice1;

import java.util.Scanner;
public class Tab {
	static final int nmax=40;
	static void remplir(float t[]) {
		Scanner sc = new Scanner(System.in) ;
		for(int i=0; i<t.length; i++) {
			//System.out.println("donner une valeur ");
			t[i]=sc.nextFloat();
		}
	
		
	}
	static float somme_element(float t[]) {
		float somme =0;
		for (int f=0; f<t.length;f++) {
			somme+=t[f];
			
		}
		return somme;
		
	}
	
	static public float [] additionner(float t1[],float t2[]) {
		float [] resultat = new float [nmax];
		for (int s=0; s<nmax ;s++) {
		
				resultat[s]=t1[s]+t2[s];
			}
			return resultat;
			
		}
		
	
	static float[] produit(float x, float t[]) {
		float [] result = new float [nmax];
		for (int s=0; s<t.length;s++) {
			 result[s]=t[s]*x;
			
		}
		return result;
		
	}
	
	static public void lister(float t[]) {
		for (int s=0; s<t.length;s++) {
			System.out.println("t[" + s + "] = " + t[s]);
		}
	}
	public static int AjouterEtudiant() {
		int nbE;
		Scanner sc = new Scanner(System.in);
		 System.out.print("Donner le nombre d'etudiants , NB: il faut quu'il soit inferieur à : "+nmax);
		    nbE = sc.nextInt();
		    while (nbE<=0||nbE>nmax) {
		    	System.out.println("Erreur! il faut reussirer a nouveau ! ");
		    	nbE=sc.nextInt();
		    }
		    return nbE;
		    
	}
}
