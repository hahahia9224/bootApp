package com.example.bootapp.service

import spock.lang.Specification

class TestServiceTest extends Specification {

	def "test" () {
		when:
			def a = 1
		then:
			a == 1
	}

}
