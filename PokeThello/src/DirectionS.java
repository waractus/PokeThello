
public class DirectionS implements Direction{
	private static Direction dir=new DirectionS();
	private DirectionS(){}
	public static Direction getDirection(){ return dir;}

	/**
	* retourne la case devant la case passé en parametre selon la direction
	* @param Case c origine
	* @return Case destination
	*/
	public Case toutDroit(Case c) {
		return c.donneDir(0,1);
	}

	/**
	* Renvoie la direction horaire de la case
	* @return Direction
	*/
	public Direction voisinHoraire() {
		return DirectionSW.getDirection();
	}

	/**
	* Renvoie la direction coté antihoraire de la case
	* @return Direction
	*/
	public Direction voisinAntiHoraire() {
		return DirectionSE.getDirection();
	}

}
