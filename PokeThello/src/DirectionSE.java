
public class DirectionSE implements Direction{
	private static Direction dir=new DirectionSE();
	private DirectionSE(){}
	public static Direction getDirection(){ return dir;}

	/**
	* retourne la case devant la case pass� en parametre selon la direction
	* @param Case c origine
	* @return Case destination
	*/
	public Case toutDroit(Case c) {
		return c.donneDir(1,1);
	}

	/**
	* Renvoie la direction horaire de la case
	* @return Direction
	*/
	public Direction voisinHoraire() {
		return DirectionS.getDirection();
	}

	/**
	* Renvoie la direction cot� antihoraire de la case
	* @return Direction
	*/
	public Direction voisinAntiHoraire() {
		return DirectionE.getDirection();
	}

}
