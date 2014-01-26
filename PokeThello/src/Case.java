
public class Case {
	int x;
	int y;	
	private Pawn pawn;
	private StateCase stateCase;
	
	
	public Case(int x , int y){
		this.x = x;
		this.y = y;
		pawn = null;		
	}	
	
	public Case donneDir(int x, int y)
	{
		return null;
	}
	
	public boolean isEmpty()
	{
		return pawn== null;
	}
	
	public StateCase getStateCase(){
		return this.stateCase;
	}
	
	public Pawn getPawn(){
		return pawn;
	}
}
