public class School {

	String name;
	int numberOfStudents;
	Ward[] studentList = new Ward[numberOfStudents];

	public School(){		
		numberOfStudents = 1;
	}
		
	public School(String n, int num){
		name = n;
		numberOfStudents = num;
	}

	public String getName(){
		return name;
	}

	public void setName(String newName){
		name = newName;
	}

	public void addStudent(Ward newStudent){				
		for(int i = 0; i < studentList.length(); i++){
			if(studentList[i] = null){
				studentList[i] = newStudent;
			}
		}		
		numberOfStudents++;
	}
}
