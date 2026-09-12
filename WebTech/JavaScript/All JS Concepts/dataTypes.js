//data types in JavaScript
//primitives: string, number, boolean, null, undefined, symbol, boolean, bigint
//non-primitives: object, array, function

//---------primitives------------
let str="Hello World"; //string
console.log(typeof str); //string

let num=25; //number
console.log(typeof num); //number

let bool=true; //boolean
console.log(typeof bool); //boolean

let n=null; //null
console.log(typeof n); //object

let u; //undefined
console.log(typeof u); //undefined

let sym=Symbol("id"); //symbol
console.log(typeof sym); //symbol

let bigInt=9007199254740991n; //bigint
console.log(typeof bigInt); //bigint

//---------non-primitives------------
let arr=[1,2,3,4,5];
console.log(typeof arr); //object

let obj={
    name:"tarun", 
    age:25
}; //object
console.log(typeof obj); //object

function greet(name) { //function
    return "Hello " + name;
}
console.log(typeof greet); //function
console.log(greet("tarun")); //function call //o/p: Hello tarun

