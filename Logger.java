public class Logger {
	private LoggerMessage message;

	public Logger(LoggerMessage message) {
		this.message = message;
	}

	public void log() {
		this.message.getPrinter().print();
	}
}
