import java.security.SecureRandom;
public class PasswordGenerator{
    private static final String UPPER_CASE ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}<>.,:;/";
    

    public static void main(String[] args){
        //length of the generated password
        int length = 10;
        // Include uppercase letters
        boolean includeUpperCase = true;
        // Include Lowercase letters
        boolean includeLowerCase = true;
        // Include number
        boolean includeNumbers=true;
        //include specialChar
        boolean includeSpecialChars  = true;
        
        String password = generatedPassword(length,includeUpperCase,includeLowerCase,includeNumbers,includeSpecialChars);
        System.out.println("Generated Password: "+ password);
    }
    public static String generatedPassword(int length,boolean includeUpperCase, boolean includeLowerCase, boolean includeNumbers, boolean includeSpecialChars){
        StringBuilder password = new StringBuilder(length);
        SecureRandom random = new SecureRandom();
        String charsToUse = "";
        if(includeUpperCase){
            charsToUse+=UPPER_CASE;
        }if(includeLowerCase){
            charsToUse+=LOWER_CASE;
        }
        if(includeNumbers){
            charsToUse+=NUMBER;
        }
        if(includeSpecialChars){
            charsToUse+=SPECIAL_CHARS;
        }
        for(int i =0;i<length;i++){
            int randomIndex = random.nextInt(charsToUse.length());
            password.append(charsToUse.charAt(randomIndex));
        }
        return password.toString();

    }
}