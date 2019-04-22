//With NO dependency injection applied!

var Person = function(firstname, lastname){

	this.firstname = firstname;

	this.lastname = lastname;

}



function logPerson(person){

	var john = new Person('John', 'Doe');

	logPerson(john);

}



logPerson(john);

//Person {firstname:"John", lastname:"Doe"}






//With dependency injection applied!


var Person = function(firstname, lastname){

	this.firstname = firstname;

	this.lastname = lastname;

}



function logPerson(){	

	logPerson(john);

}



var john = new Person('John', 'Doe');

logPerson(john);

//Person {firstname:"John", lastname:"Doe"}
