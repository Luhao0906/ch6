public class Gauss{
	public static void main (String[] args){
		System.out.println(gauss(3,7));
		
		
		}
		
	public static double gauss(double x, double n){
		double y=1;
		for (int i =1 ; i <= n; i++){
			
			y= y+((-x*x)/i);
			
		}
		return y;
		}
	}
