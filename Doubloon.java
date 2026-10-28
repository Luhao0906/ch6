public class Doubloon{
	public static void main(String[] args){
		System.out.println (isDoubloon("abzabd"));
		
		
		}
	public static boolean isDoubloon(String word){
		int length1 = word.length();
		for (int i=0; i<length1; i++){
			if (word.indexOf(word.charAt(i))>=0 && word.indexOf(word.charAt(i),2)>=0 && word.indexOf(word.charAt(i),3)<0)
			return true;
			}
		return false;
		}
	}
