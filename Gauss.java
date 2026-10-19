public class Gauss{
	public static void main (String[] args){
		System.out.println(gauss(3,1000));
		
		
		}
		
	public static double gauss(double x, double n){
		double y=1;
		double y1 = -x*x;
		for (int i =1 ; i <= n; i++){
			
			y= y+y1;
			y1= y1*((-x*x)/i));
			
		}
		return y;
		}
	}
