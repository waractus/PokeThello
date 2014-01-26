import java.util.List;
public class Grid {
	private Case[][] tabCases;
	
	
	public Grid ()
	{
		tabCases = new Case[8][8];
		
	}
	
	public void initGrid()
	{
		for( int i = 0 ; i<8 ; i ++){
			for (int j=0;j<8;j++){
				this.tabCases[i][j]= new Case(i, j);
			}
				
			
		}
		
		
	}
	
	public Case getCase(int x, int y)
	{
		return tabCases[x][y];
	}
	
	
}
