package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m�appelle " + nom + " et j�aime boire du " + boissonFav);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir " + bien + " � " + prix + " sous.");
		else parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + " sous"); perdreArgent(prix); 
		
		
	}
	
	protected void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void parler(String texte) {
		System.out.println( "<< " + texte + " >>");
	}
	
	
	
}
