package tp1;

public class StringManipulator {

    private String s;
	private String t="";
	private char ch;
	private int vCount = 0;
	boolean b;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
        for (int i=0; i<s.length(); i++)
	        {
	          ch= s.charAt(i); 
	          t= ch+t; 
	        }
	    System.out.println("reverse : "+t);
    }

    public void isPalindrome(){
        b=true;
	    	int i = 0;
	    	int j = s.length()-1;
	    	 
	    	s = s.toLowerCase();
	    	
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j))
	                b=false;
	            i++;
	            j--;
	            
	        }
	        
	        if (b==true)
	        	System.out.println("palindrome : oui");
	        else
	        	System.out.println("palindrome : non");
    }

    public void toUpperCase(){
        
        String r="";
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if(ascii>90){
                ascii=ascii-32;
                char low=(char)ascii;
                r=r+low;}
            else r=r+(char)ascii;

        }
        System.out.println("uppercase : "+r);
    }

    public void toLowerCase(){
        String r="";
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if(ascii<=90){
                ascii=ascii+32;
                char low=(char)ascii;
                r=r+low;}
            else r=r+(char)ascii;

        }

        System.out.println("lowercase : "+r);
    }

    public void getVowelNumber(){
        s = s.toLowerCase();    
	        for(int i = 0; i < s.length(); i++) {  
	            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {    
	                vCount++;    
	            }
	        }  
	        System.out.println("vowelNumber : "+vCount);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
