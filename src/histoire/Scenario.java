package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {
	
	public static void main(String[] args) { 
		// TP 1   EXO 2 //
		/*Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour a tous");
		minus.parler("Un GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		*/
		
		// SCENARIO 2 //
		System.out.print(" ");
		
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Obelix", 18);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		
		panoramix.parler(" Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.");
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Belenos, ce n'est pas juste");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("Un GAU... UN GAUGAU...");
		asterix.frapper(minus);
		
		
	}
}