public class Printer {
	private PrinterContent content;

	public void passContent(PrinterContent content) {
		this.content = content;
	}

	public void print() {
		System.out.println(content.getDataAsString(0));
	}
}
