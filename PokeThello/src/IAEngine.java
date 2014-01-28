
import java.util.*;
public class IAEngine {
	private GameEngine game;
	
	public int max(int a, int b){
		if(a>b)
			return a;
		else
			return b;
	}
	
	public int min(int a, int b){
		if(a>b)
			return b;
		else
			return a;
	}
	
	
	public int IAEngineMax ( StatePawn colorPlayer, int fin, int prof)
	{
		List<Case> movePlayable = game.getListCasePlayable(colorPlayer);// se charge de generer la liste des cases jouables et de la renvoyer.
		int tmp=0;
		int res=0;
		Iterator<Case> it= movePlayable.iterator();
		Case casetmp=it.next();
		Case c;
		while(it.hasNext())
		{
			c=it.next();
			simulateMove(colorPlayer,c); // place un pion couleur ia a l'emplacement de la case jouable et simule le coup (retourne les pions)
	
			if(prof==fin)
			{
				tmp=game.calculatePoints(colorPlayer);
			}
			else
			{
				if(colorPlayer.isWhite())
				{
					colorPlayer=colorPlayer.toBlack();
				}
				else
				{
					colorPlayer=colorPlayer.toWhite();
				}
				tmp=IAEngineMin(colorPlayer,fin, prof+1);
			}
			game.cancelMove(); // on annule le coup pour jouer le suivant
			//on recup
			res=max(tmp,res);
			if(res==tmp && prof==0) // pour recup la case ouil faut jouer
				casetmp=c;
		}
		if(prof==0){
			game.playMove(colorPlayer,casetmp);
		}
		return res;
	}
	
	
	public int IAEngineMin ( StatePawn colorPlayer, int fin, int prof)
	{
		List<Case> movePlayable = game.getListCasePlayable(colorPlayer);// se charge de generer la liste des cases jouables et de la renvoyer.
		int tmp=0;
		int res=0;
		Iterator<Case> it= movePlayable.iterator();
		Case casetmp=it.next();
		Case c;
		while(it.hasNext())
		{
			c=it.next();
			simulateMove(colorPlayer,c); // place un pion couleur ia a l'emplacement de la case jouable et simule le coup (retourne les pions)
	
			if(prof==fin)
			{
				tmp=game.calculatePoints(colorPlayer);
			}
			else
			{
				if(colorPlayer.isWhite())
				{
					colorPlayer=colorPlayer.toBlack();
				}
				else
				{
					colorPlayer=colorPlayer.toWhite();
				}
				tmp=IAEngineMax(colorPlayer,fin, prof+1);
			}
			game.cancelMove(); // on annule le coup pour jouer le suivant
			//on recup
			res=min(tmp,res);
			if(res==tmp && prof==0) // pour recup la case ouil faut jouer
				casetmp=c;
		}
		if(prof==0){
			game.playMove(colorPlayer,casetmp);
		}
		return res;
	}
	
	//TODO
	public void simulateMove(StatePawn colorPlayer, Case c){
		
	}
	

}

