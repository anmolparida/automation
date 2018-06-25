package Practice_Jan_2018;

public class CallByReference {
	int a; 
	int b;
	
	CallByReference(int i, int j){
		a = i;
		b = j;
	}
	
	//Passing Objects
	void meth(CallByReference cbr){
		cbr.a *= 2;
		cbr.b /= 2;
	}
}
