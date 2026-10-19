package controle.ens.ma;

public class Mission {
	
	private Employe employe;
	private Projet projet;
	private int nbJours;
	
	
	public Mission(Employe employe, Projet projet, int nbJours) {
		
		this.employe = employe;
		this.projet = projet;
		this.nbJours = nbJours;
	}
	
	
	public double calculerMontant() {
		return employe.calculerCout(nbJours);
		
	}
	
	
	public  void afficherRecapitulatif() {
		System.out.println(" Récapitulatif ");
		
        System.out.println(projet);
        
        employe.afficherDetails();
        
        System.out.println("Durée : " + nbJours + " jours");
        
        System.out.println("Montant total : " + calculerMontant() + " DH");
	}
	
	
	
	
	
	
	
	

	
	
}
