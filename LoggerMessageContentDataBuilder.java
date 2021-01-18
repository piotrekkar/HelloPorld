public class LoggerMessageContentDataBuilder {
	private LoggerMessageContentData loggerMessageContentData;

	public LoggerMessageContentDataBuilder addPrinter(Printer printer) {
		this.loggerMessageContentData.addPrinterData(printer);
		return this;
	}

	public LoggerMessageContentData build() {
		return this.loggerMessageContentData;
	}

	public LoggerMessageContentDataBuilder() {
		this.loggerMessageContentData = new LoggerMessageContentData();
	}	
}
