
public class Case {
	int x;
	int y;	
	private Pawn pawn;
	
	
	public Case(int x , int y){
		this.x = x;
		this.y = y;
		pawn = null;		
	}	
	
	public Case giveDir(int x, int y)
	{
		return null;
	}
	
	public boolean isEmpty()
	{
		return pawn== null;
	}
	
	
	
	public Pawn getPawn(){
		return pawn;
	}
}
