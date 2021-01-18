import java.util.ArrayList;

public class StringDataBuilder {
	private ArrayList<Letter> list;

	public StringDataBuilder() {
		this.list = new ArrayList<Letter>();
	}

	public StringDataBuilder addLetter(Letter l) {
		this.list.add(l);
		return this;
	}

	public StringData build() {
		return new StringData(list);
	}
}
