
public class DirectionNE implements Direction{
	private static Direction dir=new DirectionNE();
	private DirectionNE(){}
	public static Direction getDirection(){ return dir;}

	/**
	* retourne la case devant la case passé en parametre selon la direction
	* @param Case c origine
	* @return Case destination
	*/
	public Case straight(Case c) {
		return c.giveDir(1,-1);
	}

	/**
	* Renvoie la direction horaire de la case
	* @return Direction
	*/
	public Direction nextRight() {
		return DirectionE.getDirection();
	}

	/**
	* Renvoie la direction coté antihoraire de la case
	* @return Direction
	*/
	public Direction nextLeft() {
		return DirectionN.getDirection();
	}

}
