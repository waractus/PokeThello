import java.util.*;

public class GameEngine implements Observable  {
	private Grid grid;
	private ArrayList<Case> listCasePlayable;
	private ArrayList<Observer> listObs;
	
	
	public GameEngine()
	{
		grid = new Grid();
		listCasePlayable = new ArrayList<Case>();
		listObs = new ArrayList<Observer>();
		grid.initGrid();
	}
	
	public Grid getGrid() {
		return grid;
	}
	
	
	
	public List<Case> getListCasePlayable(StatePawn colorPlayer){
		//lancer visiteurs pour etablir la liste 
		return null;
	}
	
	//TODO
	//parcours les commandes pour lancer leur inverse.
	public void cancelMove(){
		
	}
	//TODO
	//joue un coup en notifiant les observateurs (meme code que simuler dans IAEngine
	public void playMove(StatePawn colorPlayer,Case c){
		
	}
	
	public boolean cantPlay(){
		return (listCasePlayable.isEmpty());
	}
	
	public boolean moveOK(Case c, Player j)
	{
		boolean ok=false;
		Direction dir=DirectionN.getDirection();
		do
		{
			//check lignes dans direction
			dir=dir.nextRight();
			ok=moveOkrow(c,j,dir);
		}while(dir!=DirectionN.getDirection()|| ok);
		return ok;
	}
	
	public boolean moveOkrow(Case c, Player j, Direction dir)
	{
		StatePawn color= j.getEtatPion();
		Case caseSuivante;
		do
		{
		  caseSuivante=dir.straight(c);
		}while(caseSuivante!=null || caseSuivante.getPawn().getStatePawn()!=color);
		return caseSuivante.getPawn().getStatePawn()==color;
		
	}
	//TODO
	public int calculatePoints(StatePawn colorPlayer){
		return 0;
	}


	
	public void registerObs(Observer obs) {
		this.listObs.add(obs);		
	}	
	public void unregisterObs(Observer obs) {
		this.listObs.remove(obs);	
		
	}	
	public void notifyObs() {
		for (Observer obs : this.listObs)
			obs.notifyObserver();		
	}



	public static void main(String[] args) {
		GameEngine game = new GameEngine();
		
		
		OthelloText text= new OthelloText(game);
		
		game.registerObs(text);
		
		
		game.notifyObs();
	}
	
	
	


	
}
