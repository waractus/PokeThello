/**	
* Class EtatPionBlack
*/
public class StatePawnBlack implements StatePawn{
	private static StatePawn statePawn=new StatePawnBlack();
	
	private StatePawnBlack(){}
	public static StatePawn getEtat(){ return statePawn;}



	public StatePawn toBlack()
	{
		return this;
	}
	
	
	/**
	* rend la case vide
	* @return CaseEtat
	*/
	public StatePawn toWhite()
	{
		return StatePawnWhite.getEtat();
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

