package com.mkyong.controller

import groovy.xml.XmlUtil
import java.security.SecureRandom

public class addToXml {

	def public addPerson(String username){
		def xmlFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def xml= new XmlParser().parse(xmlFile)

		new Node (xml, "person", username)

		xmlFile.withWriter ("utf-8") {writer ->
			writer.writeLine(new XmlUtil().serialize(xml))
		}
	}

	def public getUserName(String id){
		def xmlFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def xml= new XmlParser().parse(xmlFile)
		def nodeUser = xml.person.find{it ->
			it.@id == id}
		return nodeUser.text()

	}


}
