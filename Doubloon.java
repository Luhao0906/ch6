public class Doubloon{
	public static void main(String[] args){
		System.out.println (isDoubloon("aabbcc"));
		
		
		}
	public static boolean isDoubloon(String s){
		s= s.toLowerCase();
		for (int i=0; i<s.length();i++){
			char letter = s.charAt(i);
			if (letterCount(s, letter)!=2)	return false;
		}
		return true;
	}
	public static int letterCount(String s, char c){
		int sum=0;
		for (int i=0; i<s.length();i++){
			char letter= s.charAt(i);
			if (letter==c)	sum++;
		}
	return sum;
	}
}
