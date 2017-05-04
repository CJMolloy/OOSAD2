public class Guardian {

	private String name;
	private String ward;
	
	public Guardian(){
		name = " ";
		ward = " ";
	}

	public Guardian(String n, String w){
		name = n;
		ward = w;
	}
	
	public void setWardName(String w) {
		// TODO - implement Guardian.setWardName
		throw new UnsupportedOperationException();
		ward = w;
		
	}

	public String getWard() {
		// TODO - implement Guardian.createWard
		throw new UnsupportedOperationException();
		return ward;
	}

}
