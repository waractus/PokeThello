/**	
* Class EtatPionNoir
*/
public class EtatPionNoir implements EtatPion{
	private static EtatPion caseEtat=new EtatPionNoir();
	private EtatPionNoir(){}
	public static EtatPion getEtat(){ return caseEtat;}



	public EtatPion toNoir()
	{
		return this;
	}
	
	
	/**
	* rend la case vide
	* @return CaseEtat
	*/
	public EtatPion toBlanc()
	{
		return EtatPionBlanc.getEtat();
	}
	
	/**
	* case vide ?
	* @return boolean
	*/
	public EtatPion estVide()
	{
		return null;
	}
	
	public boolean estEtatPion(EtatPion c){
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

