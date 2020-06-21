package javaBasics;

public class OccurencesOfAWordInString {

	public static int occurences(String str, String word) {
		
		String a[] = str.split(" ");
		
		int cnt = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			
			if(word.equals(a[i])) {
				cnt++;
		}	
	}
		return cnt;
}
	
	
	public static void main(String[] args) {

		String str = "GeeksforGeeks A computer science portal for GeeksforGeeks ";
		String word = "GeeksforGeeks";
		
		System.out.println(occurences(str, word));
	}

}
