public class Ward {

	private String name;
	private String state;

	public Ward(){
		name = " ";
		state = " ";
	}

	public Ward(String n, String s){
		name = n;
		state = s;
	}

	public void setName(String newName) {
		// TODO - implement Ward.setName
		throw new UnsupportedOperationException();
		name = newName;

	}

	public void getName() {
		// TODO - implement Ward.getName
		throw new UnsupportedOperationException();
		return name;
	}

	public void stateGet() {
		// TODO - implement Ward.stateGet
		throw new UnsupportedOperationException();
		return state;
	}

	public void stateSet(String newState) {
		// TODO - implement Ward.stateSet
		throw new UnsupportedOperationException();
		state = newState;
	}

}
