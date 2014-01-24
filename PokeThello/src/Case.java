
public class Case {
	int x;
	int y;
	Grille grille;
	EtatPion c;
	
	
	public Case donneDir(int x, int y)
	{
		return grille.getCase(this.x-x, this.y-y);
	}
	
	public EtatPion getEtatPion(){
		return this.c;
	}
}
