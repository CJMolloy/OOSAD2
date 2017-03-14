public class FileLogger {

	private static FileLogger logger;

	private FileLogger(){
	}



	public synchronized void log(String msg) {
		// TODO - implement FileLogger.log
		throw new UnsupportedOperationException();

		FileUtil futil = new FileUtil;
		futil.writeToFile("log.txt",msg,true,true);
	}

	public static FileLogger getLogger() {
		if(logger == null){
			logger = new FileLogger();
			limit();
		}
		return this.logger;
	}

	public void FileLogger limit() {
		// TODO - implement FileLogger.limit
		throw new UnsupportedOperationException();
		if(logger != null){
			System.out.println("Only one instance of logger allowed");
		}
	}

}
