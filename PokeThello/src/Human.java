
public class Human extends Player{

	public Human(GameEngine game, StatePawn st) {
		super(game, st);
		
	}

	
	public void play(Case c)
	{
		if(game.moveOK(c, this)){
			c.setCaseBlack();
		}
	}

}
