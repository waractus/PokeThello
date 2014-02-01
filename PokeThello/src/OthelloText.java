
public class OthelloText implements Observer{
	private GameEngine game;

	public OthelloText(GameEngine game){
		this.game = game;
	}
	
	
	
	public void notifyObserver() {
		showGrid();
		
	}

	public void showGrid(){
		
		System.out.println("---------------------------------");
		for (int i = 0 ; i<8; i++)
		{
			for(int j = 0 ; j <8; j++)
			{
				
				if(game.getGrid().getCase(i, j).isEmpty())
					System.out.print("|   ");
				else if(game.getGrid().getCase(i,j).getStatePawn().isWhite())
					System.out.print("| O ");
				else if(game.getGrid().getCase(i,j).getStatePawn().isBlack())
					System.out.print("| X ");
					
			}
			
			System.out.println("|");
			System.out.println("---------------------------------");
		}
		
		System.out.println();
		System.out.println();
		
		
	}
}
