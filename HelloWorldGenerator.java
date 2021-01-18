public class HelloWorldGenerator {
	public Logger logger;

	public HelloWorldGenerator(Logger logger) {
		this.logger = logger;
	}

	public void generate() {
		this.logger.log();
	}
}
