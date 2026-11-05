import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StockTrader {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("tiny.txt"));
        String symbol = in.next();
        int n = in.nextInt();
        
        int[] years = new int[n];
        int[] months = new int[n];
        double[] prices = new double[n];
        loadData (in, years, months, prices);
        printData (years, months, prices);
        System.out.printf("$%.2f in %s %d",prices[indexOfLowest(prices)],monthName(months[indexOfLowest(prices)]),years[indexOfLowest(prices)]);
        System.out.println("");
        System.out.printf("$%.2f in %s %d",prices[indexOfHighest(prices)],monthName(months[indexOfHighest(prices)]),years[indexOfHighest(prices)]);
       
	}

	public static void loadData(Scanner in, int[] years, int[] months, double[] prices){
		for(int i=0; i<years.length; i++){
			years[i] = in.nextInt();
			months[i] = in.nextInt();
			prices[i] = in.nextDouble();
		}
	}
	
	public static String monthName(int month){
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Spe","Oct","Nov","Dec"};
		return months[month-1];
	}
	
	public static void printData(int[] years, int[] months, double[] prices){
		for(int i=0; i<years.length; i++){
			System.out.printf("%s,%s: $%.2f",years[i],monthName(months[i]),prices[i]);
			System.out.println("");
		}
	}
	
	public static int indexOfLowest(double[] prices){
		double lowestprice=100000;
		int index=0;
		for(int i=0; i<prices.length;i++){
			if(prices[i]<lowestprice){
				lowestprice = prices[i];
				index=i;
			}
			if(prices[i]==lowestprice){
				lowestprice = lowestprice;
				index=index;
			}
		}
		return index;
		
	} 
	public static int indexOfHighest(double[] prices){
		double highestprice=-100000;
		int index=0;
		for(int i=0; i<prices.length;i++){
			if(prices[i]>highestprice){
				highestprice = prices[i];
				index=i;
			}
			if(prices[i]==highestprice){
				highestprice = highestprice;
				index=index;
			}
		}
		return index;
		
	} 
}
