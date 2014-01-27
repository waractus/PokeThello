
public class DirectionE implements Direction{
	private static Direction dir=new DirectionE();
	private DirectionE(){}
	public static Direction getDirection(){ return dir;}

	/**
	* retourne la case devant la case passé en parametre selon la direction
	* @param Case c origine
	* @return Case destination
	*/
	public Case straight(Case c) {
		return c.giveDir(1,0);
	}

	/**
	* Renvoie la direction horaire de la case
	* @return Direction
	*/
	public Direction nextRight() {
		return DirectionSE.getDirection();
	}

	/**
	* Renvoie la direction coté antihoraire de la case
	* @return Direction
	*/
	public Direction nextLeft() {
		return DirectionNE.getDirection();
	}

}
