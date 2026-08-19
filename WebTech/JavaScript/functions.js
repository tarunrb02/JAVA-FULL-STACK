// 1. Function declaration 
function greet() {
    console.log("Hello, World!");
}
greet();

// 2. Function expression
const grt = function() {
    console.log("Hello from a function expression!");
};
grt();

// 3. Arrow function
const arrowGreet = () => {
    console.log("Hello from an arrow function!");
};
arrowGreet();

const add = (a, b) => a + b;
console.log("Sum: " + add(5, 3));

// 4. Function with parameters
function multiply(x, y) {
    return x * y;
}
console.log("Product: " + multiply(4, 6));

// 5. Function with default parameters
function greetWithDefault(name = "Guest") {
    console.log("Hello, " + name + "!");
}
greetWithDefault(); // Uses default parameter
greetWithDefault("Alice"); // Overrides default parameter

// 6. Function returning a value
function square(num) {
    return num * num;
}
console.log("Square: " + square(5));

// 7. Function with rest parameters
function sumAll(...numbers) {
    return numbers.reduce((acc, curr) => acc + curr, 0);
}
console.log("Sum of all numbers: " + sumAll(1, 2, 3, 4, 5));

// 8. Function with callback
// function processUserInput(callback) {
//     const name = "John Doe";
//     callback(name);
// }
// processUserInput((userName) => {
//     console.log("Processed user input for: " + userName);
// });

//------------------------------------------//

function hello(name) {
    console.log("Hello, " + name + "!");
}

function executeCallback(callback) {
    const name = "Jane Doe";
    callback(name);
}
executeCallback(hello); // function hello is passed as a callback to executeCallback, which then calls hello with the name "Jane Doe".

//------------------------------------------//

function hello(name) {
    console.log("Hello, " + name + "!");
}

function executeCallback(callback ,name) {
    callback(name);
}
executeCallback(hello, "Jane Doe"); // function hello is passed as a callback to executeCallback, which then calls hello with the name "Jane Doe".