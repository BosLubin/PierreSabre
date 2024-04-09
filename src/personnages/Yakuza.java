package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public Yakuza (String nom, String boissonfav, int argent, String clan) {
		super(nom,boissonfav,argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int vol = victime.seFaireExtorquer();
		gagnerArgent(vol); reputation+=1;
		parler("J'ai piqué les " + vol + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + 
				" sous dans ma poche. Hi ! Hi !");
		
		
	}
	
	
	

}
