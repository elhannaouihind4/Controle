package controle.ens.ma;



public class Main {
	public static void main(String[] args) {
		Ingenieur i1 =new Ingenieur("pc","Hind", 500, 4);
		Ingenieur i2 =new Ingenieur("pc1","YOUssef", 350, 2);
		
		
		Commercial c1=new Commercial("tele", "Reda", 0.10, 4);
		Commercial c2=new Commercial("tele1", "Ali", 0.15, 2);

		
		
		Employe[] employes= {i1,i2,c1,c2};
		
		
		Projet p1= new Projet("1234","Info");
		Projet p2= new Projet("5678","svt");
		

		Mission m1 = new Mission(i1, p1, 3);
		Mission m2 = new Mission(i2, p2, 2);
		Mission m3 = new Mission(c1, p1, 4);
		Mission m4 = new Mission(c2, p2, 2);


        //  Tableau de locations
		Mission[] missions = {m1, m2, m3,m4};
		
		
		
		
		System.out.println("les Missions");
        
        System.out.println();
        

        double total = 0;

        for (Mission m : missions) {
            m.afficherRecapitulatif();
            System.out.println();
            total += m.calculerMontant();
        }

        //  Affichage du montant total
        System.out.println("Montant total de toutes les locations : "
                + total + " DH");
    }
	
}
