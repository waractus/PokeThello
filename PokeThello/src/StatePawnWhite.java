/**	
* Class EtatPionWhite
*/
public class StatePawnWhite extends StatePawn{
	private static StatePawn statePawn=new StatePawnBlack();
	
	public StatePawnWhite(){}
	
	public static StatePawn getEtat(){ 
		return statePawn;
	}



	public StatePawn toBlack()
	{
		return statePawn;
	}
	
	
	/**
	* rend la case vide
	* @return CaseEtat
	*/
	public StatePawn toWhite()
	{
		return this;
	}
	
	
	public boolean isWhite(){
		return true;
	}
	

	public boolean isBlack(){
		return false;
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

