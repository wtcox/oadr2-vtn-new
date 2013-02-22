package org.enernoc.oadr2.vtn

class Ven {

	 String venID;
	 String programID;
	 String venName;
	 String clientURI;
	
	 static belongsTo = [program: Program]
	 
    static constraints = {
		venID(blank: false)
		clientURI(nullable: true)
		
		//select a program id from one of the available programs
	
    }
}
