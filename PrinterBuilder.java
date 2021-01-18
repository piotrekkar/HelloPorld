public class PrinterBuilder {
	private Printer printer;

	public PrinterBuilder() {
		this.printer = new Printer();
	}

	public PrinterBuilder passContent(PrinterContent content) {
		this.printer.passContent(content);
		return this;
	}

	public Printer build() {
		return this.printer;
	}
}
