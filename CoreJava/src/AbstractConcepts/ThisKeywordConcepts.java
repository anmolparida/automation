package AbstractConcepts;

public class ThisKeywordConcepts {

	int x ;
	int y ;
	
	public ThisKeywordConcepts (int x, int y){
		this.x = x; // <this> keyword is added to call the Global Variable, instance of current object 
		this.y = y;
		
	}
	public void toAdd(){
		System.out.println(x+y);
	}
}
