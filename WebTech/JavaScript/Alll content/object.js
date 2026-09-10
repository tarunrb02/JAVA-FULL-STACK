// Object creation
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 30
};

console.log(person); // Output the entire object

// Accessing object properties
console.log(person.firstName);
console.log(person.lastName);// dot notation
console.log(person["age"]);// bracket notation

// Modifying object properties
person.age = 31; // Modifying object property
console.log(person.age);

// Adding and deleting properties
person.address = "123 Main St"; // Adding new property
console.log(person);

delete person.address; // Deleting property
console.log(person.address); // undefined
console.log(person);

//nested objects
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