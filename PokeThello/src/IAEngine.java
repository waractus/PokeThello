import java.io.*;
import java.util.*;
public class IAEngine {
	private Rules rules;
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
		List coupJouables = game.getListCasePlayable(colorPlayer);// se charge de generer la liste des cases jouables et de la renvoyer.
		int tmp=0;
		int res=0;
		Iterator<Case> it= coupJouables.iterator();
		Case casetmp=it.next();
		Case c;
		while(it.hasNext())
		{
			c=it.next();
			simulerCoup(colorPlayer,c); // place un pion couleur ia a l'emplacement de la case jouable et simule le coup (retourne les pions)
	
			if(prof==fin)
			{
				tmp=rules.calculatePoints(colorPlayer);
			}
			else
			{
				if(colorPlayer.isStatePawn(StatePawnWhite.getEtat()))
				{
					colorPlayer=colorPlayer.toNoir();
				}
				else
				{
					colorPlayer=colorPlayer.toBlanc();
				}
				tmp=IAEngineMin(colorPlayer,fin, prof+1);
			}
			game.cancelRound(); // on annule le coup pour jouer le suivant
			//on recup
			res=max(tmp,res);
			if(res==tmp && prof==0) // pour recup la case ouil faut jouer
				casetmp=c;
		}
		if(prof==0){
			game.playRound(colorPlayer,casetmp);
		}
		return res;
	}
	
	
	public int IAEngineMin ( StatePawn colorPlayer, int fin, int prof)
	{
		List coupJouables = game.getListCasePlayable(colorPlayer);// se charge de generer la liste des cases jouables et de la renvoyer.
		int tmp=0;
		int res=0;
		Iterator<Case> it= coupJouables.iterator();
		Case casetmp=it.next();
		Case c;
		while(it.hasNext())
		{
			c=it.next();
			simulerCoup(colorPlayer,c); // place un pion couleur ia a l'emplacement de la case jouable et simule le coup (retourne les pions)
	
			if(prof==fin)
			{
				tmp=rules.calculatePoints(colorPlayer);
			}
			else
			{
				if(colorPlayer.isStatePawn(StatePawnWhite.getEtat()))
				{
					colorPlayer=colorPlayer.toNoir();
				}
				else
				{
					colorPlayer=colorPlayer.toBlanc();
				}
				tmp=IAEngineMax(colorPlayer,fin, prof+1);
			}
			game.cancelRound(); // on annule le coup pour jouer le suivant
			//on recup
			res=min(tmp,res);
			if(res==tmp && prof==0) // pour recup la case ouil faut jouer
				casetmp=c;
		}
		if(prof==0){
			game.playRound(colorPlayer,casetmp);
		}
		return res;
	}
	
	public void simulerCoup(StatePawn colorPlayer, Case c){
		
	}
	

}

