public class Abecedarian{
	public static void main (String[] args){
		System.out.println(isAbecedarian("abcdefgi"));
		
		
		}

	public static boolean isAbecedarian(String word){
		int length1 = word.length();
		if (length1 == 1) return true;
		for (int i = 1; i<length1 ;i++){
			if (word.substring(i, i+1).compareTo(word.substring(i-1, i)) <= 0){
				return false;
			}
			
			}
			return true;
		}
}
