package com.diegolirio.micronaut

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.diegolirio.micronaut")
		.start()
}

