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



// const person = {
//   firstName: "John",
//   lastName: "Doe",
//   age: 30
// };

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

Object.entries(person).forEach(([key, value]) => {  // Looping through object entries using Object.entries()
    console.log(key + ": " + value);
});

//methods to get keys and values of an object
console.log(Object.keys(car));
console.log(Object.values(car));
console.log(Object.entries(car));

//copying objects
//shallow copy of an object
const carCopy = {...car};//shallow copy of car object using spread operator, it will create a new object with the same properties as car object

carCopy.make = "Honda"; // changing the make property of carCopy object
console.log(car);
console.log(carCopy);

//deep copy of an object

//for nested objects, we can use JSON.parse(JSON.stringify(obj)) to create a deep copy of the object
const studentCopy = JSON.parse(JSON.stringify(student));
console.log(studentCopy);

const studentCopy2 = structuredClone(student);
console.log(studentCopy2);

//structuredClone is a built-in method in JavaScript that creates a deep copy of an object, including nested objects and arrays. It is a more efficient and reliable way to clone objects compared to using JSON.parse(JSON.stringify(obj)), as it can handle more complex data types and circular references.

//shallow copy vs deep copy
//shallow copy creates a new object with the same properties as the original object, but if the original object has nested objects, the nested objects are still referenced in the new object. This means that if we change a property of a nested object in the new object, it will also change in the original object.
//deep copy creates a new object with the same properties as the original object, and all nested objects are also copied, not just referenced. This means that if we change a property of a nested object in the new object, it will not affect the original object.