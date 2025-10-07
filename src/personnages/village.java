package personnages;

public class village {
	private String nom;
	private Gaulois chef ;
	private Gaulois [] villageois ;
	private int nbVillageois = 0 ;
	
	public village(String nom,Gaulois  chef, final int nbVillageoisMax) {
		this.nom = nom ;
		this.chef = chef ;
		chef.setVillage(this);
		this.villageois = new Gaulois [nbVillageoisMax];
	
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois ;
		nbVillageois ++;
		gaulois.setVillage(this);
		
	}
	
	public Gaulois  trouverVillageois(int numVillageois) {
		if(villageois[numVillageois-1]==null) {
		    System.out.println("Il n'y a pas autan d'habitants dans notre village !");
		    return null ;
		}
		return villageois[numVillageois-1];
	}
	
	public void afficherVillage() {
		
		System.out.println("Dans le village 'Village des Irréductibles du chef " +this.chef + " vivent les legendaires gaulois suivant :  ");
		for(Gaulois villageoi : this.villageois) {
			if(villageoi !=null) 
			System.out.println(villageoi.getNom());
		}
		
	}
	
	public static void main(String [] args) {
		
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6) ;
		
		village village = new village("Village des irréductibles", abraracourcix, 30) ;
		 
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		 
		//village.afficherVillage();
		
		//g 
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();;
		Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
	}
	

}
