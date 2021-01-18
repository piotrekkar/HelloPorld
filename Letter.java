public class Letter {
	private char ch;
	private LetterCase letterCase;

	public Letter(char ch, LetterCase letterCase) {
		this.ch = ch;
		this.letterCase = letterCase;
	}

	public char toCharacter() {
		return this.letterCase == LetterCase.LOWERCASE ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
	}

	public String toString() {
		return Character.toString(this.toCharacter());
	}
}
