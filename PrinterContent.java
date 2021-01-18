public class PrinterContent {
	private PrinterContentData[] data;

	public PrinterContent(PrinterContentData[] data) {
		this.data = data;
	}

	public String getDataAsString(int index) {
		return data[index].getStringDataAsString();
	}
}
