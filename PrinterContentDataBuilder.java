public class PrinterContentDataBuilder {
	private PrinterContentData data;

	public PrinterContentDataBuilder() {
		this.data = new PrinterContentData();
	}

	public PrinterContentDataBuilder addStringData(StringData stringData) {
		this.data.addStringData(stringData);
		return this;
	}

	public PrinterContentData build() {
		return data;
	}
}
