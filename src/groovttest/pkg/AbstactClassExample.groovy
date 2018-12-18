package groovttest.pkg

import java.awt.DisplayMode

class AbstactClassExample {

	static main(args) {
		StudentA st =  new StudentA();
		st.name = "doe";
		st.marks = 100
		println(st.name)
//		println(st.marks)
		st.displayMarks()
		
	}
	
	

}

abstract class PersonA {
	String name
	PersonA() {
		
	}
	abstract void displayMarks()
}

class StudentA extends Person {
	def studentId, marks
	public StudentA() {
		super()
	}
	
	void displayMarks() {
		println(marks);
	}
	
}