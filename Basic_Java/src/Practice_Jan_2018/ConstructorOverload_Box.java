package Practice_Jan_2018;
class ConstructorOverload_Box {
	double width;
	double height;
	double depth;
	
	ConstructorOverload_Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	ConstructorOverload_Box() { 
		width = -1;
		height = -1;
		depth = -1;
	}
	
	ConstructorOverload_Box(double len) {
		width = height = depth = len;
	}
	
	ConstructorOverload_Box(ConstructorOverload_Box cob){
		width = cob.width;
		depth = cob.depth;
		height = cob.height;
	}
	
	double volume(){
		return width * height * depth;
	}
}

