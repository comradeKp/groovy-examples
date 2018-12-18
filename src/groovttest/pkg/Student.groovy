package groovttest.pkg

class Student {
	private def studentId, studentName
	private def  mark1, mark2, mark3
	
	static def total(s) {
		def total = s.mark1 + s.mark2 + s.mark3
	}
	
	 static def display(st) {
		println(st.studentId +"-----"+ st.studentName)
	}

	static main(args) {
		Student student = new Student()
		student.studentId =123
		student.studentName ="Kp"
		student.mark1 =12
		student.mark2 =12
		student.mark3 =12
		println(total(student))
		display(student)
		
		Student student1 = new Student()
		student1.studentId =1234
		student1.studentName ="Kp4"
		student1.mark1 =124
		student1.mark2 =124
		student1.mark3 =124
		println(total(student1))
		display(student1)
		
		
	}

}
