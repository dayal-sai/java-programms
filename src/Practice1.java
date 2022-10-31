import java.util.Arrays;
import java.util.HashMap;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		findduplicate_element_loop();
		findduplicate_element_loop_string();
		findduplicate_element_loop_word();
		findduplicate_vowel_in_word();

	}




/* Duplicate Elements from Array and count each through loop  and with help of hasmap*/
	
	/* Integer Example*/

public static void findduplicate_element_loop() {
	
	int[] num = new int[] {1,2,3,1,2,3,5,1,2,5};
	
	HashMap<Integer, Integer> dupHas = new HashMap<Integer, Integer>();
	
	
		for(int i = 0;i<num.length;i++) {
				int count = 1;	
				for(int j = 0;j<num.length;j++) {
				
	
				if(num[i]==num[j]) {
					
					dupHas.put(num[j],count);
					count++;
				}
		}
	}
	
System.out.println(dupHas.toString());	
	
}

/* String Example*/
public static void findduplicate_element_loop_string() {
	
	String[] companies = new String[] {"Facebook","Google","Amazon","Facebook","Myntra","Apple","Amazon","Jio"};
	
	HashMap<String, Integer> dupHas = new HashMap<String, Integer>();
	
	
		for(int i = 0;i<companies.length;i++) {
				int count = 1;	
				for(int j = 0;j<companies.length;j++) {
				
	
				if(companies[i]==companies[j]) {
					if(count>1) {
					dupHas.put(companies[j],count);
					}
					count++;
				}
		}
	}
	
System.out.println(dupHas.toString());	
	
}



// 1,1,3,4,5,5,6,5-------5
//1,1,3,1,2,5-------

//Question -  remove duplicate elements
//Question -  Raahuul -  count each albhaphet in a name
//Question -  Raahull - count a , how many times








/* duplicate character in a Word Example*/
/* count each character in a word with the help of hash*/
public static void findduplicate_element_loop_word() {
	
	String companies = new String("Facebook");
	char[] comp_char = companies.toCharArray();
	
	HashMap<Character, Integer> dupHas = new HashMap<Character, Integer>();
	
	
		for(int i = 0;i<comp_char.length;i++) {
				int count = 1;	
				for(int j = 0;j<comp_char.length;j++) {
				
	
				if(comp_char[i]==comp_char[j]) {
					//if(count>1) {
					dupHas.put(comp_char[j],count);
					//}
					count++;
				}
		}
	}
	
System.out.println(dupHas.toString());	
	
}


/* duplicate vowel in a Word Example*/
public static void findduplicate_vowel_in_word() {
	
	char[] vow = new char[] {'a','e','i','o','u'};
	String companies = new String("Facebook");
	char[] comp_char = companies.toCharArray();
	
	HashMap<Character, Integer> dupHas = new HashMap<Character, Integer>();
	
	
		for(int i = 0;i<comp_char.length;i++) {
				int count = 1;	
				for(int j = 0;j<vow.length;j++) {
				
					//System.out.println();
	
				if(comp_char[i]==vow[j]) {
					//if(count>1) {
					dupHas.put(comp_char[i],count);
					//}
					count++;
				}
		}
	}
	
System.out.println("vowels present in word "+companies+" are - "+dupHas.toString());	
	
}

}



