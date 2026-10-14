public class A{
	public static void main(String[] args){
			System.out.println (squareRoot (81.0));
		}
	

public static double squareRoot(double n){
	double i = n/2;
	double i1 = (i + n/i)/2;
	while(Math.abs(i1-i)>=0.0001){
		i1 = (i1 + n/i1)/2;
		i = (i + n/i)/2;
			}
	return i;
	}
}
