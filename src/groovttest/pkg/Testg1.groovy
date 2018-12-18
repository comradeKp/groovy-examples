package groovttest.pkg

class Testg1 {

	static main(args) {
		def map = [
			iPhone : 'iWebOS',
			Android: '2.3.3',
			Nokia  : 'Symbian',
			Windows: 'WM8'
		]
		for(m in map) {
			if("${m.value}" == "Symbian")
				continue
				println("${m.key} -------- ${m.value}")
		}
	}
	
	
}
