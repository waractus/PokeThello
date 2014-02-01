/**	
* Class EtatPionBlack
*/
public class StatePawnBlack extends StatePawn{
	private static StatePawn statePawn=new StatePawnWhite();
	
	public StatePawnBlack(){}
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
		return statePawn;
	}
	
	
	
	public boolean isWhite(){
		return false;
	}
	

	public boolean isBlack(){
		return true;
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

