import java.util.Arrays;

public class GameBoard {

	int size;
	char stone[][];
	int turn = 0;

	/**
	 * Konstruktor für das Spielfeld
	 *
	 * @param size
	 *            die Größe des zu erstellenden Spielfeldes
	 */

	GameBoard(int size) {
		this.size = size;
		stone = new char[size][size]; // Erstellen des steine Arrays
		for (int i = 0; i < size; i++) {
			Arrays.fill(stone[i], '_'); // Das Array wird mit unterstrichen
										// gefüllt
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
		System.out.print("   ");
		for (int k = 0; k < size - 2; k++) {
			System.out.print("_ ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			if (0 < i && i < size - 1) {
				System.out.print("|");
			} else {
				System.out.print(" ");
			}
			for (int j = 0; j < size; j++) {
				System.out.print(stone[i][j]);
				if (!(j == size - 1 && (i == 0 || i == size - 1))) {
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}
}