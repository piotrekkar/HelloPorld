public class LoggerMessage {
	private LoggerMessageContent content;

	public void passContent(LoggerMessageContent content) {
		this.content = content;
	}

	public Printer getPrinter() {
		return this.content.getLoggerMessagePrinterDataContentDataAsPrinter(0);
	}
}
