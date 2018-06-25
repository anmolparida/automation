package Practice_Jan_2018;
class Constructors_Parameters_Test{
	public static void main(String args[]){
		Constructors_Parameters cpt1 = new Constructors_Parameters(100,22);
		Constructors_Parameters cpt2 = new Constructors_Parameters(100,22);
		Constructors_Parameters cpt3 = new Constructors_Parameters(-1,-1);
		
		System.out.println("cpt1 == cpt2 : "+ cpt1.equals(cpt2));
		System.out.println("cpt1 == cpt3 : "+ cpt1.equals(cpt3));
	}
}