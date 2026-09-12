//------------Control Flow------------//
// Control flow is the order in which individual statements, instructions, or function calls are executed or evaluated in a program. It is a fundamental concept in programming that allows developers to dictate how their code behaves under different conditions. Control flow can be managed using various constructs such as conditional statements, loops, and function calls.
// Conditional Statements: These allow the program to make decisions based on certain conditions. The most common conditional statements are if, else if, and else. They enable the execution of specific blocks of code depending on whether a condition evaluates to true or false.

let age = 18;
if (age >= 18) {
    console.log("You are an adult.");
} else {
    console.log("You are not an adult.");
}
// The switch statement evaluates an expression and executes the corresponding case block based on the value of the expression.
switch (age) { 
    case 18:
        console.log("You are exactly 18 years old.");
        break;
    case 19:
        console.log("You are 19 years old.");
        break;
    default:
        console.log("Your age is not specifically handled.");
}

// Loops: Loops are used to execute a block of code repeatedly as long as a specified condition is true. Common types of loops include for, while, and do-while loops.
// For Loop: Executes a block of code a specific number of times.
for (let i = 0; i < 5; i++) {
    console.log("For Loop iteration: " + i);
}

//for each loop
const fruits = ["apple", "banana", "cherry"];
fruits.forEach((fruit, index) => {
    console.log(`Fruit at index ${index}: ${fruit}`);
});
