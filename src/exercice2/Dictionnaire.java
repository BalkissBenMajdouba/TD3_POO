package exercice2;

import java.util.Arrays;

public class Dictionnaire {
	private int nbM=0;
    private MotDico[] TabM;
    private String nom;
   // private int n=MotDico.
    
    public Dictionnaire(String nom) {
        this.nom = nom;
        this.TabM = new MotDico[5];
        this.nbM =0;
    } 
  
	public void ajouterMot (MotDico m) {
    
    	TabM[nbM] = m;
        nbM++;
    }
    
    public void supprimerMot(String Sm) {
    	int pos=-1;
    	for(int j=0;j<nbM;j++) {
    		if(TabM[j].getMot().equalsIgnoreCase(Sm)) {
    			 pos=j;
    		}
    	}
    	if(pos!=-1) {
    		for(int j=0;j<nbM;j++){
    			TabM[j]=TabM[j+1];
    		}
    		nbM--; 
    	}
    	else {
    		System.out.println("Mot non trouve! ");
    	}
    	
    }
    public int chercherMot(String ch) {
    	for(int j=0;j<nbM;j++) {
    		 if (TabM[j].getMot().equals(ch)) {
                 return j;
             }
    	
         
    	}
    	return -1;
    	
    }
    
    public void listerDico(){
       
        for (int j=0;j<nbM;j++){
            System.out.println(TabM[j]);
        }
    }
    public int nbSynonymes(MotDico m) {
        int oc=0;
        for(int j=0;j<nbM;j++){
            if (TabM[j].Syno(m)) {
                oc++;
            }
        }
        return oc;
    }


}
