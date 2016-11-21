package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	public String encrypt(String input) {
		return crypt(input.toLowerCase());
	}

	@Override
	public String decrypt(String input) {
		if (input.toLowerCase().equals(input) && !input.contains("!") && !input.contains("§") && !input.contains("%")
				&& !input.contains("&") && !input.contains("/") && !input.contains("(") && !input.contains(")")
				&& !input.contains("=") && !input.contains("?") && !input.contains("´")) {
			return crypt(input);
		} else {
			throw new IllegalArgumentException("Geht net");
		}
	}

	public String crypt(String input) {
		String nachricht = "";
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'e': {
				nachricht = nachricht + 3;
				break;
			}
			case 'l': {
				nachricht = nachricht + 1;
				break;
			}
			case 'o': {
				nachricht = nachricht + 0;
				break;
			}
			case 'a': {
				nachricht = nachricht + 4;
				break;
			}
			case 't': {
				nachricht = nachricht + 7;
				break;
			}
			case '3': {
				nachricht = nachricht + "e";
				break;
			}
			case '1': {
				nachricht = nachricht + "l";
				break;
			}
			case '4': {
				nachricht = nachricht + "a";
				break;
			}
			case '0': {
				nachricht = nachricht + "o";
				break;
			}
			case '7': {
				nachricht = nachricht + "t";
				break;
			}
			default: {
				nachricht = nachricht + input.charAt(i);
				break;
			}
			}
		}
		return nachricht;
	}
}
