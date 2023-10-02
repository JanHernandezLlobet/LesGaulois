package personnages;

public class Main {
	
	public static void main(String[] args) { 
		  Gaulois asterix = new Gaulois("Asterix", 8);
		  Romain adolphus = new Romain("Adolphus", 10);
		  asterix.parler("Ñeh");
		  asterix.frapper(adolphus);
		  adolphus.parler("A l'ataque!!");
		  adolphus.recevoirCoup(4);
			  
	}
}