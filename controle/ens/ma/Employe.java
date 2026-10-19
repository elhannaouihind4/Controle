package controle.ens.ma;

public  abstract class Employe {
	protected String matricule ;
	protected String nom ;
	protected double tarifJournalier;
	private Employe superieur;
	
	
	public Employe(String matricule, String nom, double tarifJournalier) {
	
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
	}


	public String getMatricule() {
		return matricule;
	}
	
	
	


	public Employe getSuperieur() {
		return getSuperieur();
	}


	public void setSuperieur(Employe superieur) {
		
		this.superieur = superieur;
	}


	public abstract  double calculerCout(int nbJours);
	
	
	public void afficherDetails() {
		
		System.out.println("Matricule :"+matricule);
		System.out.println("Nom :"+nom);

		System.out.println("TarifJournalier :"+tarifJournalier);

	}
	
	
	
	

}
