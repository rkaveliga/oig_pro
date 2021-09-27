package com.groovy

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVRecord
import groovy.json.*
import groovy.transform.*
import java.io.*


class JsonScript{
	
	static void main(String[] args) throws Exception {
		
		ArrayList<Person> plist=new ArrayList<Person>()
		String [] headers=["code","gender","firstname","lastname"]
		FileReader fr=new FileReader("one.csv")
		//iterate thru csv file using Iterable<CSVRecord>
		Iterable<CSVRecord> iterable=CSVFormat.DEFAULT.withHeader(headers).parse(fr)
		
		for(CSVRecord csv:iterable) {
		println csv
			Person person=new Person()
			person.setCode(csv.get("code"))
			person.setGender(csv.get("gender"))
			person.setFirstname(csv.get("firstname"))
			person.setLastname(csv.get("lastname"))
			plist.add(person)
				}
				
		def jsonb=new JsonBuilder()
		jsonb{
			person plist.collect()
		}
		println(jsonb.toPrettyString())
	}
	
}


class Person{
	String code;
	String gender;
	String firstname;
	String lastname;
}






