import java.util.Arrays;

public class GameBoard {

	int size;
	char stone[][];
	int turn = 0;

	/**
	 * Konstruktor f�r das Spielfeld
	 *
	 * @param size
	 *            die Gr��e des zu erstellenden Spielfeldes
	 */

	GameBoard(int size) {
		this.size = size;
		stone = new char[size][size]; // Erstellen des steine Arrays
		for (int i = 0; i < size; i++) {
			Arrays.fill(stone[i], '_'); // Das Array wird mit unterstrichen
										// gef�llt
		}
		stone[size - 1][0] = ' ';
		stone[size - 1][size - 1] = ' '; // Die unteren Eckfelder werden mit
											// Leerzeichen besetzt
		stone[size / 2 - 1][size / 2 - 1] = 'X';
		stone[size / 2][size / 2] = 'X';
		stone[size / 2][size / 2 - 1] = 'O';
		stone[size / 2 - 1][size / 2] = 'O'; // Die Startsteine werden gesetzt
		draw();
	}

	/**
	 * Methode zum zeichnen des Spielfeldes in der Konsole
	 */

	void draw() {
		String space = "";
		if (size > 9) { // Anpassung falls Nummerierung 2-stellig wird
			space = " ";
		}
		System.out.print("   " + space);
		for (int c = 65; c < size + 65; c++) { // Koordinatenbelegung A-Z
			System.out.print((char) c + " ");
		}

		System.out.println();
		System.out.print("     " + space);
		for (int k = 0; k < size - 2; k++) { // "Deckel" des Spielfeldes
			System.out.print("_ ");
		}

		System.out.println();

		for (int i = 0; i < size; i++) { // Schleife f�r jede Zeile
			System.out.print(i + 1 + " "); // Nummerierung
			if (size > 9 && i < 9) {
				System.out.print(" ");
			}
			if (0 < i && i < size - 1) {
				System.out.print("|");
			} else {
				System.out.print(" ");
			}
			for (int j = 0; j < size; j++) { // Schleife f�r jedes Element der
												// Zeile
				System.out.print(stone[i][j]);
				if (!(j == size - 1 && (i == 0 || i == size - 1))) {
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}
}