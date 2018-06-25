package Practice_Jan_2018;

public class Constructors_Parameters {
	int a;
	int b;
	
	Constructors_Parameters(int i, int j){
		a = i;
		b = j;
	}
	
	boolean equals(Constructors_Parameters o){
		if(o.a == a && o.b == b)
			return true;
		else
			return false;
	}

}

