public class LoggerMessageContent {
	private LoggerMessageContentData[] data;

	public LoggerMessageContent(LoggerMessageContentData[] data) {
		this.data = data;
	}

	public Printer getLoggerMessagePrinterDataContentDataAsPrinter(int index) {
		return data[index].getPrinterDataAsPrinter();
	}
}
