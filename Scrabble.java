public class Scrabble{
	public static void main(String[] args){
		System.out.println(canSpell("aabbcc","aab"));
		
		
	}
	public static boolean canSpell(String word, String word1){
		for(int i=0; i<word.length();i++){
			if(letterCount(word,word1.charAt(i))<letterCount(word1,word1.charAt(i)))
			return false;
			
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
