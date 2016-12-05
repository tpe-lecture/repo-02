package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	/**
	 * Methode zum verschlüsseln
	 */
	@Override
	public String encrypt(String input) {
		return crypt(input.toLowerCase(), false);
	}

	/**
	 * Methode zum entschlüsseln
	 * 
	 */

	@Override
	public String decrypt(String input) {
		if (input.toLowerCase().equals(input)) { // Überprüft auf
													// Kleinschreibung
			return crypt(input, true);
		} else {
			throw new IllegalArgumentException("Geht net");
		}
	}

	/**
	 * Verschlüselt einen Tetxt nach dem vorgegebenen Muster
	 * 
	 * @param input
	 *            der zu verschlüsselnde Text
	 * @return der entschlüsselte text
	 */

	public String crypt(String input, boolean exception) {
		String nachricht = "";
		for (int i = 0; i < input.length(); i++) { // For schleife für alle
													// Elemnte
			char zeichen = input.charAt(i);
			if ((96 < zeichen && zeichen < 123) || (47 < zeichen && zeichen < 58 ) || zeichen == 32) { // Überprüfung
																										// auf
																					// Wertebereich
				switch (input.charAt(i)) {
				case 'e':
					nachricht = nachricht + 3;
					break;
				case 'l':
					nachricht = nachricht + 1;
					break;
				case 'o':
					nachricht = nachricht + 0;
					break;
				case 'a':
					nachricht = nachricht + 4;
					break;
				case 't':
					nachricht = nachricht + 7;
					break;
				case '3':
					nachricht = nachricht + "e";
					break;
				case '1':
					nachricht = nachricht + "l";
					break;
				case '4':
					nachricht = nachricht + "a";
					break;
				case '0':
					nachricht = nachricht + "o";
					break;
				case '7':
					nachricht = nachricht + "t";
					break;
				default:
					nachricht = nachricht + input.charAt(i);
					break;
				}
			}else if (exception){
				throw new IllegalArgumentException("Geht net");
			}
		}
		return nachricht;
	}
}
