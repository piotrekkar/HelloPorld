public class LoggerMessageContentData {
	private Printer printerData;

	public void addPrinterData(Printer printer) {
		this.printerData = printer;
	}

	public Printer getPrinterDataAsPrinter() {
		return this.printerData;
	}
}
