// Object creation
//we can create an object in 2 ways 
// 1. using object literal syntax
// 2. using object constructor syntax
let obj1 = {}; // object literal syntax
let obj3=[] // array literal syntax
obj3.name="John";
console.log(typeof obj3);

let obj2 = new Object(); // object constructor syntax
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 30
};

console.log(person); // Output the entire object

// !Accessing object properties
console.log(person.firstName);
console.log(person.lastName);// dot notation
console.log(person["age"]);// bracket notation

// !Modifying object properties or updating object properties
person.age = 31; // Modifying object property  
//even if we can modify the properties of an object, we cannot reassign the object itself if it is declared with const.
console.log(person.age);

// !Adding new properties to an object
person.address = "123 Main St"; // Adding new property
console.log(person);

// !Deleting properties
delete person.address; // Deleting property
console.log(person.address); // undefined
console.log(person);

//nested objects
console.log("nested objects");
const student = {
  name: "Alice",
    age: 20,
    address: {
        city: "New York",
        state: "NY"
    }
};
console.log(student);
console.log(student.address.city);
console.log(student.details?.age); //  -? optional chaining operator, if details is undefined, it will not throw an error and will return undefined instead of throwing an error
// access nested properties of non existent objects using optional chaining operator

// converting js object to json string
const jsonString = JSON.stringify(student);
console.log(jsonString);

// converting json string to js object
const jsonObject = JSON.parse(jsonString);
console.log(jsonObject);

// Object methods
const car = {
    make: "Toyota",
    model: "Camry",
    year: 2020,
    getCarInfo: function() {
        return `${this.make} ${this.model} (${this.year})`;
    }
};

console.log(car.getCarInfo());

const car2 = {
    make: "Toyota",
    model: "Camry",
    year: 2020,
    getCarInfo(){
        // return `${this.make} ${this.model} (${this.year})`;/
            console.log(`${this.make} ${this.model} (${this.year})`);
    }
};
car2.getCarInfo(); // Output: Toyota Camry (2020)
// console.log(car.getCarInfo());


// Object destructuring
const { firstName, lastName } = person;
console.log(firstName); 
console.log(lastName);  

// looping through object properties
for (let key in person) {
    if (person.hasOwnProperty(key)) {
        console.log(key + ": " + person[key]);
    }
}

Object.keys(car).forEach(key => { // Looping through object properties using Object.keys()
    console.log(key + ": " + car[key]);
}); 

Object.values(person).forEach(value => {  // Looping through object values using Object.values()
    console.log(value);
}); 