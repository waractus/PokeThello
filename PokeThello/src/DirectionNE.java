
public class DirectionNE implements Direction{
	private static Direction dir=new DirectionNE();
	private DirectionNE(){}
	public static Direction getDirection(){ return dir;}

	/**
	* retourne la case devant la case pass� en parametre selon la direction
	* @param Case c origine
	* @return Case destination
	*/
	public Case toutDroit(Case c) {
		return c.donneDir(1,-1);
	}

	/**
	* Renvoie la direction horaire de la case
	* @return Direction
	*/
	public Direction voisinHoraire() {
		return DirectionE.getDirection();
	}

	/**
	* Renvoie la direction cot� antihoraire de la case
	* @return Direction
	*/
	public Direction voisinAntiHoraire() {
		return DirectionN.getDirection();
	}

}
