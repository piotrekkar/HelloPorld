public class PrinterContentData {
	private StringData stringData;	
	private boolean hasStringData;

	public void addStringData(StringData stringData) {
		this.stringData = stringData;
		this.hasStringData = true;
	}

	public String getStringDataAsString() {
		return this.hasStringData ? this.stringData.toString() : null;
	}
}
