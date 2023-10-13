package exercice2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		MotDico mot1 = new MotDico("avec", "en compagnie de");
		MotDico mot2 = new MotDico("jeune", "dans la fleur de l'age");
			Dictionnaire Da = new Dictionnaire("Da");
				System.out.println(mot1);
		System.out.println(mot2);
		
		Dictionnaire larousse = new Dictionnaire("Larousse");
		 larousse.ajouterMot(mot1);
		 larousse.ajouterMot(mot2);
		
		 System.out.println();
		 System.out.println("Liste des mots du dictionnaire: ");
		 larousse.listerDico();
		 
		 //larousse.chercherMot("hh");
		 System.out.println("donner un mot a chercher: ");
		 String ma = sc.nextLine();
	        int posMa = larousse.chercherMot(ma);
	        if (posMa == -1) {
	            System.out.println( ma + " n'existe pas. ");
	        }
	        else {
	        	 System.out.println( ma + " existe.");
	        }
	       System.out.println();
	        System.out.println("Synonyme: ");
	        String ms="Copain";
	     int nbS=larousse.nbSynonymes(mot2);
	     System.out.println("Nombre de synonymes de  : " + nbS);
	     
	     
	     larousse.supprimerMot("avec");
	        
	        larousse.listerDico();
	
		 

	}
	

}
