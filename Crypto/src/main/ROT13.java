import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
        int letterSpacing;
    ROT13(Character cs, Character cf) {
        letterSpacing = cf - cs;
    }

    ROT13() {
        letterSpacing = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        char[] charArray = text.toCharArray();
        char[] newArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {

            int numberValue = text.charAt(i);

            if (numberValue >= 65 && numberValue <= 90) {
                if (numberValue + letterSpacing > 90) {
                    newArray[i] = (char) ((numberValue + letterSpacing) - 26);
                } else {
                    newArray[i] = char() ((numberValue + letterSpacing));
                }
            } else if (numberValue >= 97 && numberValue <= 122) {
                if (numberValue + letterSpacing > 122) {
                    newArray[i] = (char) ((numberValue + letterSpacing) - 26);
                }
            } else {
                newArray[i] = (char) (numberValue + letterSpacing);
            }
        } else{
            newArray[i] = (char) numberValue;
        }
    }
        return new String(newArray);

    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        int b = c;
        int a = 'A';
        int distanceFromA = b - a;
        char[] charArray = s.toCharArray();
        char[] newArray = new char[charArray.length];

        for(int i = 0; i < s.length(); i++){
            if(i < distanceFromA){
                newArray[i] = charArray[i + distanceFromA];
            }
            else{
                newArray[i] = charArray[i + distanceFromA];
            }
        return new String(newArray);
    }

}
