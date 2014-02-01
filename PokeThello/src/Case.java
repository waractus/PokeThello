
public class Case {
	int x;
	int y;	
	private StatePawn statePawn;
	
	
	public Case(int x , int y){
		this.x = x;
		this.y = y;
		statePawn = null;		
	}	
	
	public Case giveDir(int x, int y)
	{
		return null;
	}
	
	public boolean isEmpty()
	{
		return statePawn== null;
	}
	
	
	
	public StatePawn getStatePawn(){
		return statePawn;
	}
	
	public void setStatePawn(StatePawn st){
		statePawn = st;	
	}
	
	public void setCaseBlack(){
		if(statePawn==null)
			statePawn=new StatePawnBlack();
		else 		
			statePawn=statePawn.toBlack();
	}
	
	public void setCaseWhite(){
		if(statePawn==null)
			statePawn=new StatePawnWhite();
		else		
			statePawn=statePawn.toWhite();
	}
	
}
