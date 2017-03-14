public class Driver {

	public void main() {
		// TODO - implement Driver.main
		throw new UnsupportedOperationException();
		FileLogger fl = new FileLogger();
		
		Logger logger=fl.getLogger();
		logger.log("A Message to Log");
	}

}
