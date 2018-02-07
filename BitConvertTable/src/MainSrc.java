/**
 * A simple program that demonstrates the bit conversion table.
 * What is a bit conversion table?: http://www.eagle-web-designs.com/cool_stuff/ByteConversion.html
 * The program shows both output for bytes in binaries and in decimal.
 */

import java.text.*;
import java.util.*;

public class MainSrc {
	// In every byte, there are 8 bits of data
	final static float BIT_TO_BYTE = 8;

	public static void main(String[] args) {

		System.out.println("The Bit Conversion Table by iasjem");
		
		Scanner askUser = new Scanner(System.in);
		float bit; int i = 0, mod=0;
		DecimalFormat negativeFormat = new DecimalFormat("0.########################################################################");
		DecimalFormat positiveFormat = new DecimalFormat("#, ###");

		// Ask user to input how many bits to convert
		System.out.println("\nHow many bits do you want to convert?");
		bit = askUser.nextFloat();
		System.out.println( "\nYou entered " + String.format("%.0f",bit) + " b (bit)." );
		
		// Show the converted bits in binaries
		System.out.println("\nIn binaries:");
		for (i = -24; i <= 24; i++) {
			mod = i %3;	
			if ((mod == 0) || (i == 1 || i == 2) || (i == -1 || i == -2) ) {
			if (i > 0 && i <= 24) {
				System.out.println( identifyAbbrev(i) + "\t2e" + i + "\t" + positiveFormat.format((bit / BIT_TO_BYTE) * Math.pow(2, i * 10)));
			} else {
				System.out.println( identifyAbbrev(i) + "\t2e" + i + "\t" + negativeFormat.format((bit / BIT_TO_BYTE) * Math.pow(2, i * 10)));
			}
		} }

		// Show the converted bits in decimals		
		System.out.println("\nIn decimal:");
		for (i = -24; i <= 24; i++) {
		mod = i %3;	
			if ((mod == 0) || (i == 1 || i == 2) || (i == -1 || i == -2) ) {
				if (i > 0 && i <= 24) {
					System.out.println(identifyAbbrev(i) + "\t10e" + i + "\t" + positiveFormat.format((bit / BIT_TO_BYTE) * Math.pow(10, i)));
				} else {
					System.out.println( identifyAbbrev(i) + "\t10e" + i + "\t" + negativeFormat.format((bit / BIT_TO_BYTE) * Math.pow(10, i)));
				}
			} 
		}

		askUser.close();
		System.exit(0);
		
	}

	//What is the abbreviation in bytes?
	private static String identifyAbbrev(int x) {
		String abbrev="B"; 
		switch (x) {
		case -24:
			abbrev = "yB (yokto)";
			break;
		case -21:
			abbrev = "zB (zepto)";
			break;
		case -18:
			abbrev = "aB (atto)";
			break;
		case -15:
			abbrev = "fB (femto)";
			break;
		case -12:
			abbrev = "pB (pico)";
			break;
		case -9:
			abbrev = "nB (nano)";
			break;
		case -6:
			abbrev =  "\u00B5" + "B (micro)";
			break;
		case -3:
			abbrev = "mB (milli)";
			break;
		case -2:
			abbrev = "cB (centi)";
			break; 
		case -1:
			abbrev = "dB (deci)";
			break;		
		case 1:
			abbrev = "daB (deka)";
			break;
		case 2:
			abbrev = "hB (hecto)";
			break;
		case 3:
			abbrev = "kB (kilo)";
			break;
		case 6:
			abbrev = "MB (mega)";
			break;
		case 9:
			abbrev = "GB (giga)";
			break;
		case 12:
			abbrev = "TB (tera)";
			break;
		case 15:
			abbrev = "PB (peta)";
			break;
		case 18:
			abbrev = "EB (exa)";
			break;
		case 21:
			abbrev = "ZB (zetta)";
			break;
		case 24:
			abbrev = "YB (yotta)";
			break;
		default:
			abbrev = "B (byte)";
			break;
		}
		return abbrev;
	}
	
}
