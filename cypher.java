/**
 * A simple implementation of the shift cryptographic systems.
 * This will only return lower case letters.
 * 
 * @author Alexandre Seite
 *
 */
public class CaesarShift {
	public static final String Alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	/**
	 * The basic Caesar Cipher.
	 * 
	 * @param message, the sentence or text that will be encrypted.
	 * @return the encrypted sentence or text.
	 */
	public static String cypher(String message){
		String cypher="";
		int index=0;
		String messageLow = message.toLowerCase();
		while(index<messageLow.length()){
			int letter = Alphabet.indexOf(messageLow.charAt(index));
			if(letter>-1){
				letter= (letter+3)%26;
				cypher+=Alphabet.charAt(letter);
				} else { cypher+=messageLow.charAt(index);}
			index++;
		}
		return cypher;
	}
	
	/**
	 * 
	 * 
	 * @param message
	 * @return
	 */
	public static String decypher(String message){
		String cypher="";
		int index=0;
		String messageLow = message.toLowerCase();
		while(index<messageLow.length()){
			int letter = Alphabet.indexOf(messageLow.charAt(index));
			if(letter>-1){
				letter= (letter-3)%26;
				if(letter<0){
					letter+=26;
				}
				cypher+=Alphabet.charAt(letter);
				} else { cypher+=messageLow.charAt(index);}
			index++;
		}
		return cypher;
	}
	
	/**
	 * 
	 * @param message
	 * @param shift
	 * @return
	 */
	public static String cypher(String message, int shift){
		String cypher="";
		int index=0;
		String messageLow = message.toLowerCase();
		while(index<messageLow.length()){
			int letter = Alphabet.indexOf(messageLow.charAt(index));
			if(letter>-1){
				letter= (letter+shift)%26;
				cypher+=Alphabet.charAt(letter);
				} else { cypher+=messageLow.charAt(index);}
			index++;
		}
		return cypher;
	}
	
	/**
	 * 
	 * @param message
	 * @param shift
	 * @return
	 */
	public static String decypher(String message, int shift){
		String cypher="";
		int index=0;
		String messageLow = message.toLowerCase();
		while(index<messageLow.length()){
			int letter = Alphabet.indexOf(messageLow.charAt(index));
			if(letter>-1){
				letter= (letter-shift)%26;
				if(letter<0){
					letter+=26;
				}
				cypher+=Alphabet.charAt(letter);
				} else { cypher+=messageLow.charAt(index);}
			index++;
		}
		return cypher;
	}
}
