package stringsassignment;

public class largestpalindrome {
    public static boolean isPalindrome(String a){
        boolean flag=true;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String string="wow you own kayak";
        String word="",smallPalin="",largePalin="";
        String[] words=new String[100];
        int temp=0;
        int count=0;
        string=string.toLowerCase();
        string = string + " ";  
          
        for(int i = 0; i < string.length(); i++){  
             
            if(string.charAt(i) != ' '){  
                word = word + string.charAt(i);  
            }  
            else{  
                
                words[temp] = word;  
                 
                temp++;  
                 
                word = ""; 
            }
        }
            for(int i=0;i<temp;i++){  
                if(isPalindrome(words[i])){  
                          
                        count++;  
                         
                        if(count == 1)
                        smallPalin = largePalin = words[i];  
                    
                 else{  
                      
                    if(smallPalin.length() > words[i].length())  
                        smallPalin = words[i];  
                          
                      
                    if(largePalin.length() < words[i].length())  
                        largePalin = words[i]; 
                    
                    } 
                } 
            }  
         
          
        if(count == 0)  
            System.out.println("No palindrome is present in the given string");  
        else{  
            System.out.println("Smallest palindromic word: " + smallPalin);  
            System.out.println("Biggest palindromic word: " + largePalin);  
        }
    }  
}




