//String
let name="Tarun";
let message=`Welcome ${name} to the world of JavaScript`;//dynamic string
console.log(message);

name[0]="t"; // strings are immutable, this will not change the string
console.log(name); // Output: Tarun

name="tarun"; // reassigning the variable to a new string
console.log(name); // Output: tarun

let str="Hello World";
console.log(str[0]); // accessing first character
console.log(str[6]); // accessing character at index 6

console.log(str.length); // length of string

//String methods
console.log(str.length);// length of string
console.log(str.toUpperCase());// converts string to uppercase
console.log(str.toLowerCase()); //converts string to lowercase
console.log(str.indexOf("World")); // returns index of "World" in the string
console.log(str.includes("Hello")); // returns true if "Hello" is in the string
console.log(str.slice(0, 5)); // extracts "Hello"
console.log(str.replace("World", "JavaScript")); // replaces "World" with "JavaScript"
console.log(str.split(" ")); // splits the string into an array of words
console.log(str.trim()); // removes whitespace from both ends of the string
console.log(str.charAt(4)); // returns character at index 4

//type conversion
let num=123;
let strNum=String(num); // converts number to string
console.log(typeof strNum); // Output: string
let str5=num.toString(); // another way to convert number to string

let ss="456";
let num2=Number(ss); // converts string to number
console.log(typeof num2);

let bool=Boolean(num2); // converts number to boolean
console.log(bool); // Output: true

//=============================================================================================

let name1="    TaRuN BomBaLekAr             ";
name1=name1.trim(); // removes whitespace from both ends
let name2=name1.toLowerCase().split(" "); // converts to lowercase and splits into an array
console.log(name2);
let fname=name2[0].charAt(0).toUpperCase()+name2[0].slice(1); // capitalizes first letter of first name
let lname=name2[1].charAt(0).toUpperCase()+name2[1].slice(1);

console.log("First Name: " + fname);// Output: First Name: Tarun
console.log("Last Name: " + lname); // Output: Last Name: Bombalekar