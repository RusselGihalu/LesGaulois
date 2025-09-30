package personnages;

public class Chaudron {
private int quantitePotion ;
private int forcePotion ;
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
		
	}
	
	public boolean resterPotion() {
		return this.quantitePotion > 0;
	}
	
	public int prendreLouche() {
		if(!resterPotion()) {
			this.quantitePotion = 0 ;
		}else {
			this.quantitePotion --;
		}
		
		return this.forcePotion ;
	}
	
}
