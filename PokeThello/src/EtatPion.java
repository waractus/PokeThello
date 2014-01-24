
public interface EtatPion {
	public EtatPion toBlanc();
	public EtatPion toNoir();
	public boolean estEtatPion(EtatPion c);
	public EtatPion estVide();
	public String getImg();
}