package personnages;


public class Romain  { 
	private String nom; 
	private int force; 

	public Romain(String nom, int force) { 
		assert force >= 0;  // precondition
		this.nom = nom; 
		this.force = force; 
	} 

	public String getNom() { 
		return nom; 
	}
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "� " + texte + "�"); 
	}
	
	private String prendreParole() { 
		return "Le romain " + nom + " : "; 
	}
	
	public void recevoirCoup(int forceCoup) { 
		assert force >= 0; // precondition
		int force2 = force; // pr la postcondition
		force -= forceCoup; 
		if (force > 0) { 
			parler("A�e"); 
		} else { 
			parler("J'abandonne..."); 
		} 
		assert force2 >= force;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);

		
	}
}

