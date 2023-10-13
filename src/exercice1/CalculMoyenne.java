package exercice1;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbE=Tab.AjouterEtudiant();
		
		float[]noteCtrl=new float[nbE];
		float[]noteExam=new float[nbE];
		float[]moy=new float[nbE];
		
		System.out.println();
		System.out.println("Saisis la notes de controle : ");
		
	    Tab.remplir(noteCtrl);
		System.out.println("Saisis une note d'examen ");
		Tab.remplir(noteExam); 
		System.out.println();
		
		
		for (int i = 0; i < nbE; i++) 
		{
	       moy[i] = (noteCtrl[i] + 2 * noteExam[i])/3;
		}
		Tab.lister(moy);
		System.out.println();
		
		float moyClasse=Tab.somme_element(moy)/nbE;
		System.out.println("Moyenne de la classe:"+ moyClasse);
	}

}
