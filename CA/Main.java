public class Main {
	public static void main(String [] args){

		Guardian g = new Guardian("Tom","Joe");
		School s = new School("Ard Scoil",1);
		Ward w1 = new Ward("Joe", "Adopted");
		Ward w2 = new Ward("Simon", "Pending");
		Ward w3 = new Ward("Marv", "Adult");
		Ward w4 = new Ward("John", "Adopted");

		w1.getName();
		w1.setName("Mark");

		s.addStudent(w1);
		s.addStudent(w2);
		s.addStudent(w3);
		s.addStudent(w4);
	
	}
}
