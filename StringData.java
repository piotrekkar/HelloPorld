import java.util.ArrayList;

public class StringData {
	private ArrayList<Letter> list;

	public StringData(ArrayList<Letter> list) {
		this.list = list;
	}

	public String toString() {
		String string = new String();
		for (Letter letter : list) {
			string += letter.toString();
		}
		return string;
	}
}
