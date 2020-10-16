
public class Ass4_question2 {

	public static void main(String[] args) {
		int value=-1;
		System.out.println("Starting integer value: "+value);
		byte byteValue=(byte)value;
		System.out.println("Byte value: "+byteValue);
		// Here when int is typeCasted to byte, no change occurs and -1 is assigned to it.
        // This is because byte in java is signed and has a range of -2^7 to 2^7 +1 and the value being
        // casted was in the range only so no overflow occurs.
		char charValue=(char)byteValue;
		System.out.println("Char value: "+charValue);
		// Here the byte is first converted to int and then int is converted to char.
		// Because the language specification mandates that arithmetic on primitive types is modulo 2^width, so -1 becomes 2^16-1 as a char.
		// Internally charValue will be represented as 0xFFFF
		int intValue=(int)charValue;
		System.out.println("Final integer value: "+intValue);
		// charValue when converted to int value it will convert 0xFFFF to 65535 

	}

}
