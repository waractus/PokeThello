
public abstract class Player {
	protected StatePawn color;
	protected GameEngine game;
	
	public Player(GameEngine game, StatePawn st){
		this.game = game;
		this.color = st;
	}
	
	
	public StatePawn getEtatPion()
	{
		return color;
	}
	
	
	public void play(Case c)
	{
		
		
	}
	
	
}
