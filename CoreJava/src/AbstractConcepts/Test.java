package AbstractConcepts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calci2 obj = new Calci2("Super");
		obj.toAdd();
		obj.toSub();
		
		ThisKeywordConcepts obj2 = new ThisKeywordConcepts(2,3); // we need to call the constructor
		obj2.toAdd();
		// OOPS - Scalability & Reusability
	}
}
