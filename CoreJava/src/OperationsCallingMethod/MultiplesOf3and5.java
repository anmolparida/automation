package OperationsCallingMethod;

public class MultiplesOf3and5 {

	public int FindMultiplesOf3and5(){

		int iSum = 0;
		int jSum = 0;

		for (int i = 0; i<=1000; i=i+3){			
			iSum = iSum + i;
		}
		for (int j = 0; j<=1000; j=j+5){			
			jSum = jSum + j;
		}

		return (iSum+jSum);
	}

	public int FindMultiplesOf3or5(){

		int Sum = 0;

		for (int i = 0; i<=1000; i++){	
			if(i%3 == 0 && i%5 ==0){
				Sum = Sum + i;
			}
		}
		return Sum;
	}


}
