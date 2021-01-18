public class HelloPorld {
	public static void main(String[] args) {
		Letter uppercaseH = new Letter('h', LetterCase.UPPERCASE);
		Letter lowercaseE = new Letter('e', LetterCase.LOWERCASE);
		Letter lowercaseL = new Letter('l', LetterCase.LOWERCASE);
		Letter lowercaseO = new Letter('o', LetterCase.LOWERCASE);
		Letter uppercaseW = new Letter('w', LetterCase.UPPERCASE);
		Letter lowercaseR = new Letter('r', LetterCase.LOWERCASE);
		Letter lowercaseD = new Letter('d', LetterCase.LOWERCASE);

		StringDataBuilder stringDataBuilder = new StringDataBuilder();
		StringData stringData = stringDataBuilder
				.addLetter(uppercaseH)
				.addLetter(lowercaseE)
				.addLetter(lowercaseL)
				.addLetter(lowercaseL)
				.addLetter(lowercaseO)
				.addLetter(uppercaseW)
				.addLetter(lowercaseO)
				.addLetter(lowercaseR)
				.addLetter(lowercaseL)
				.addLetter(lowercaseD)
				.build();

		PrinterContentDataBuilder printerContentDataBuilder = new PrinterContentDataBuilder();
		PrinterContentData printerContentData = printerContentDataBuilder.addStringData(stringData).build();

		PrinterContentBuilder printerContentBuilder = new PrinterContentBuilder();
		PrinterContent printerContent = printerContentBuilder.insertData(printerContentData).build();

		PrinterBuilder printerBuilder = new PrinterBuilder();
		Printer printer = printerBuilder.passContent(printerContent).build();

		LoggerMessageContentDataBuilder loggerMessageContentDataBuilder = 
				new LoggerMessageContentDataBuilder();
		LoggerMessageContentData loggerMessageContentData =
				loggerMessageContentDataBuilder.addPrinter(printer).build();

		LoggerMessageContentBuilder loggerMessageContentBuilder = new LoggerMessageContentBuilder();
		LoggerMessageContent loggerMessageContent = loggerMessageContentBuilder
				.insertData(loggerMessageContentData).build();

		LoggerMessageBuilder loggerMessageBuilder = new LoggerMessageBuilder();
		LoggerMessage loggerMessage = loggerMessageBuilder.passContent(loggerMessageContent).build();

		Logger logger = new Logger(loggerMessage);

		HelloWorldGenerator generator = new HelloWorldGenerator(logger);

		generator.generate();
	}
}