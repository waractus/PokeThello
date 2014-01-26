/**	
* Class EtatPionBlanc
*/
public class StatePawnWhite implements StatePawn{
	private static StatePawn statePawn=new StatePawnWhite();
	
	private StatePawnWhite(){}
	
	public static StatePawn getEtat(){ 
		return statePawn;
	}



	public StatePawn toNoir()
	{
		return StatePawnBlack.getEtat();
	}
	
	
	/**
	* rend la case vide
	* @return CaseEtat
	*/
	public StatePawn toBlanc()
	{
		return this;
	}
	
	
	public boolean isStatePawn(StatePawn c){
		return c==this;
	}
	
	/**
	* Retourne le chemin de l'image representant l'objet
	* @return String
	*/
	public String getImg()
	{
		return "./img/mur.gif";
	}

}

