package groovttest.pkg

class Testg3 {
	def x
	

	def getX() {
		return x;
	}
	def setX( x) {
		this.x = x;
	}
	static main(args) {
		println"${simpleMethod(11,22)}"
		Testg3 testg3 = new Testg3()
		testg3.setX(1111)
		println("value of X = ${testg3.getX()}")
	}
	static def simpleMethod(a,b, c=11) {
		a+b+c
	}
}
