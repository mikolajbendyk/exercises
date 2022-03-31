package codewars.kyu4;

public class StripComments {

    public static void main(String[] args) {
        stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } );
    }


    public static String stripComments(String text, String[] commentSymbols) {
        String[] textArr = text.split("\n");
        String result = "";

        for (String string : textArr) {
            int lowestIndex = Integer.MAX_VALUE;
            for (String symbol : commentSymbols) {
                if (string.contains(symbol) && string.indexOf(symbol) < lowestIndex) {
                    lowestIndex = string.indexOf(symbol);
                }
            }
            if (lowestIndex < Integer.MAX_VALUE) {
                result = result + (string.substring(0, lowestIndex)).stripTrailing() + "\n";
            } else {
                result = result + string.stripTrailing() + "\n";
            }
        }
        
		return result.substring(0, result.length()-1);
	}
    
}
