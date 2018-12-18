package groovttest.pkg

class Example {

	static main(args) {
		Child c = new Child()
		c.id = 123
		c.name = "kk"
		print("id  = ${c.getId()} and name = ${c.getName()}")
	}
}

class Child extends Person{
	def id

	Child() {
		super()
	}
}

class Person {
	def name
}
