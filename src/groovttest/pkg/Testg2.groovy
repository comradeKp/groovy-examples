package groovttest.pkg

class Testg2 {

	static main(args) {
		def st1 = "String"
		def ss = 1
		switch(st1) {
			case "kp":
				print"it is a pk"
				break
			case "int":
				print "it is integer"
				break
			case "String":
				switch(ss) {
					case 0:
					print"it is a string"
					print ss
					break
					case 1:
					println"it is a string"
					println "${ss}"
					break
					default:
					print"it is a string"
					print "default"
					break
				}
				break
			default:
				print "it is jj"
		}
	}
}
