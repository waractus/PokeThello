
public class DirectionSW implements Direction{
	private static Direction dir=new DirectionSW();
	private DirectionSW(){}
	public static Direction getDirection(){ return dir;}

	/**
	* retourne la case devant la case pass� en parametre selon la direction
	* @param Case c origine
	* @return Case destination
	*/
	public Case straight(Case c) {
		return c.giveDir(-1,1);
	}

	/**
	* Renvoie la direction horaire de la case
	* @return Direction
	*/
	public Direction nextRight() {
		return DirectionW.getDirection();
	}

	/**
	* Renvoie la direction cot� antihoraire de la case
	* @return Direction
	*/
	public Direction nextLeft() {
		return DirectionS.getDirection();
	}

}
