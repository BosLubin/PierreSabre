package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personnages.Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson",12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("kimono",50);
		
		personnages.Commercant marco = new Commercant("Marco",54);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}

}
