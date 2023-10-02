package personnages;
import java.util.Random;

public class Druide  { 
	private String nom; 
	private int effetPotionMin; 
	private int effetPotionMax; 
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) { 
		this.nom = nom; 
		this.effetPotionMin = effetPotionMin; 
		this.effetPotionMax = effetPotionMax; 
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + "."); 
	} 
	public String getNom() { 
		return nom; 
	} 
	public void parler(String texte) { 
		System.out.println(prendreParole() + "� " + texte + "�"); 
	} 
	private String prendreParole() { 
		return "Le druide " + nom + " : "; 
	} 
	
	public void preparerPotion() {
		Random random = new Random();
		int alea = random.nextInt(effetPotionMin, effetPotionMax);
		if(alea > 7) {
			parler("J'ai prepapre une super potion de force " + alea);
			forcePotion = alea;
		}
		else {
			parler("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force " + alea);
		}
	}
	
	public void booster(Gaulois gaul) {
		if (gaul.getNom() == "Obelix") {
			parler("Non, Obelix!... Tu n'auras pas de potion magique!");
		}
		else {
			gaul.boirePotion(forcePotion);
		}
	}
	
	public static void main(String[] args) { 
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
	
} 

