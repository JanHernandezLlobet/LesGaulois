package personnages;


public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaul) {
		this.villageois[nbVillageois] = gaul;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int num) {
		return this.villageois[num];
	}
	
	public void afficherVillageois(){
		System.out.println("Dans "+ nom + " du chef "+ chef.getNom() + " vivent les legendaires gaulois :");
		for(int i=0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irreductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// on ne peut pas prendre le 30eme element vu qu'il y en a 30. Le 30eme correspond au num 29
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Aterix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		// Ca renvoie NULL car il n'y a pas encore dhabitant numero 1, meme s'il y en a un ( le 0 dcp)
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}
	
}
