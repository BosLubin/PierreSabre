package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent);
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		int extorquer = getArgent();
		perdreArgent(getArgent());
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return extorquer;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
	
}
