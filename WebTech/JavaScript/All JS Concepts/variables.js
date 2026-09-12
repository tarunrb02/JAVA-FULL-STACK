//---------let------------
//when we declare a variable with let, we can reassign it. It is a mutable value.
//redeclaration of a variable with let is not allowed in the same scope.
let name="tarun";
let age=25;

console.log("My name is " + name + " and I am " + age + " years old.");
age=23; //reassignable
console.log("My name is " + name + " and I am " + age + " years old.");

//---------const------------
//when we declare a variable with const, we cannot reassign it. It is a constant value.
const pi=3.14;
console.log("The value of pi is " + pi);

//---------var------------
//when we declare a variable with var, we can reassign it. It is a mutable value.
//but it is not recommended to use var as it has some issues with scoping and hoisting.
var city="New York";
console.log("I live in " + city);

var city="Los Angeles"; //redeclaration is allowed with var
console.log("I live in " + city); //reassignable
//---------var vs let------------
//var is function scoped, while let is block scoped.
//var can be redeclared and updated, while let can be updated but not redeclared in the same scope.

for (var i=0; i<5; i++) {
    console.log(i);
}

//what is scope?
//scope is the area of the code where a variable is defined and can be accessed. 
//There are three types of scope in JavaScript: global scope, function scope, and block scope.

//------------------------------------------------------------------------
//global scope: variables declared outside of any function or block have global scope and can be accessed from anywhere in the code.
let b= 20; // b has global scope
//function scope: variables declared inside a function have function scope and can only be accessed within that function.
function globalScopeExample() {
    let a= 10; // a has function scope
    console.log(a);
    console.log(b); // b has global scope
}
globalScopeExample();
// console.log(a); //a has function scope and cannot be accessed outside the function
//----------------------------------------------------------------

//-----------------------------------------------------------------------
//block scope: variables declared inside a block (e.g. if statement, for loop) have block scope and can only be accessed within that block.
{
    let c= 30; // c has block scope
    console.log(c);
    var d= 40; // d has function scope
}
// console.log(c); // c has block scope and cannot be accessed outside the block
console.log(d); // d has function scope and can be accessed outside the block
//---------------------------------------------------------------------------