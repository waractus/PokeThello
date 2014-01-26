import java.io.*;
import java.util.*;

public class Rules {
	int profondeur;
	public boolean peutPlusJouer(Grid g){
		return (g.listeCasesJouables().isEmpty());
	}
	
	public boolean coupJouable(Case c, Player j)
	{
		boolean ok=false;
		Direction dir=DirectionN.getDirection();
		do
		{
			//check lignes dans direction
			dir=dir.voisinHoraire();
			ok=coupJouableLigne(c,j,dir);
		}while(dir!=DirectionN.getDirection()|| ok);
		return ok;
	}
	
	public boolean coupJouableLigne(Case c, Player j, Direction dir)
	{
		StatePawn color= j.getEtatPion();
		Case caseSuivante;
		do
		{
		  caseSuivante=dir.toutDroit(c);
		}while(caseSuivante!=null || caseSuivante.getPawn().getStatePawn()!=color);
		return caseSuivante.getPawn().getStatePawn()==color;
		
	}
	
	public int calculatePoints(StatePawn colorPlayer){
		return 0;
	}
	/*MIN MAX
	public void jouer(Grille g){
		int max_val = (int)Float.NEGATIVE_INFINITY;$
		int val;
		Iterator i = g.listeCasesJouables().iterator();
	     while(i.hasNext()) {
	         Case c = i.next();
	         //simuler coup actuel
	         val=min(g, profondeur);
	      }

    Pour tous les coups possibles
         simuler(coup_actuel)
         val <- Min(etat_du_jeu, profondeur)
    
         si val > max_val alors
              max_val <- val
              meilleur_coup <- coup_actuel
         fin si
    
         annuler_coup(coup_actuel)
    fin pour

    jouer(meilleur_coup)
   fin fonction
	}
	
	fonction Min : entier

    si profondeur = 0 OU fin du jeu alors
         renvoyer eval(etat_du_jeu)

    min_val <- infini

    Pour tous les coups possibles
         simuler(coup_actuel)
         val <- Max(etat_du_jeu, profondeur-1)

         si val < min_val alors
              min_val <- val
         fin si

         annuler_coup(coup_actuel)
    fin pour

    renvoyer min_val
fin fonction

fonction Max : entier

si profondeur = 0 OU fin du jeu alors
     renvoyer eval(etat_du_jeu)

max_val <- -infini

Pour tous les coups possibles
     simuler(coup_actuel)
     val <- Min(etat_du_jeu, profondeur-1)

     si val > max_val alors
          max_val <- val
     fin si

     annuler_coup(coup_actuel)
fin pour

renvoyer max_val
fin fonction



fonction eval : entier

si le partie est finie alors
     si Player a gagné alors
          renvoyer 1000-nombre_de_coups
     sinon si adversaire a gagné alors
          renvoyer -1000+nombre_de_coups
     sinon
          renvoyer 0
     fin si
fin si

renvoyer nb_de_series_de_2_Player - nb_de_series_de_2_adversaire

fin fonction

*/
}
