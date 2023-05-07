package stringoperations;

public class MergeTwoStrings {
	public static void main(String[] args) {
		System.out.println(mergeAlternately("abc", "pqrst"));
	}
	 public static String mergeAlternately(String word1, String word2) {
	        int w1 = word1.length();
	        int w2 = word2.length();
	        String resultString = "";
	        int i=0;
	        while(w1>0 && w2>0){
	            resultString = resultString.concat(String.valueOf(word1.charAt(i)));
	            resultString = resultString.concat(String.valueOf(word2.charAt(i)));
	            i++;
	            w1--;
	            w2--;
	        }
	        while(w1>0){
	                resultString = resultString.concat(String.valueOf(word1.charAt(i)));
	            i++;
	            w1--;
	        }
	        while(w2>0){
	            resultString = resultString.concat(String.valueOf(word2.charAt(i)));
	            i++;
	            w2--;
	        }
	        return resultString;
	    }
}
