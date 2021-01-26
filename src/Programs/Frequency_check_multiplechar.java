package Programs;

public class Frequency_check_multiplechar {

	public static void main(String[] args) {
		String str = "hbhbjb";  
        int[] freq = new int[str.length()];  
        int i, j;  
        
        
        char given_char[] = str.toCharArray();  
        
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(given_char[i] == given_char[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    given_char[j] = '0';  
                }  
            }  
        }  
          
        
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(given_char[i] != ' ' && given_char[i] != '0')  
                System.out.println(given_char[i] + "-" + freq[i]);  
        }
	}

}
