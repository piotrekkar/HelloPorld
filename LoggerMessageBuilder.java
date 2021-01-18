public class LoggerMessageBuilder {
	private LoggerMessage message;

	public LoggerMessageBuilder() {
		this.message = new LoggerMessage();
	}

	public LoggerMessageBuilder passContent(LoggerMessageContent content) {
		this.message.passContent(content);
		return this;
	}

	public LoggerMessage build() {
		return this.message;
	}
}
