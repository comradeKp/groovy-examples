package groovttest.pkg

class InnerClassEx {

	static main(args) {
		Outer o =  new Outer()
		o.name = "Kp"
		o.callInner()
	}
}

class Outer {
	def name
	def callInner() {
		new Inner().p()
	}
	class Inner {
		def p() {
			println "${name}"
		}
	}
}