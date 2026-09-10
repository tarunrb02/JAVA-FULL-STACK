/* 
arithmetic operators -> +, -, *, /, %, **
logical operators   -> &&, ||, !
comparison operators -> ==, !=, ===, !==, <, >, <=, >=
assignment operators -> =, +=, -=, *=, /=, %=
bitwise operators -> &, |, ^, ~, <<, >>
unary operators -> +, -, !, typeof, instanceof, ++, --
ternary operators -> condition ? expr1 : expr2
String Concatenation -> +
*/

//---------arithmetic operators------------
let a=10, b=5;
console.log("Addition: " + (a+b)); //Addition: 15
console.log("Subtraction: " + (a-b)); //Subtraction: 5
console.log("Multiplication: " + (a*b)); //Multiplication: 50
console.log("Division: " + (a/b));   //Division: 2
console.log("Modulus: " + (a%b)); //Modulus: 0
console.log("Exponentiation: " + (a**b)); //Exponentiation: 100000

//---------logical operators------------
let x=true, y=false;
console.log("Logical AND: " + (x && y)); //Logical AND: false
console.log("Logical OR: " + (x || y)); //Logical OR: true
console.log("Logical NOT: " + (!x)); //Logical NOT: false

//---------comparison operators------------
let m=10, n=20;
console.log("Equal to: " + (m==n)); //Equal to: false
console.log("Equal to: " + (m=="10")); //Equal to: true
console.log("Strictly equal to: " + (m===10)); //Strictly equal to: true
console.log("Not equal to: " + (m!=n)); //Not equal to: true
console.log("Strictly not equal to: " + (m!==10)); //Strictly not equal to: false
console.log("Greater than: " + (m>n)); //Greater than: false
console.log("Less than: " + (m<n)); //Less than: true
console.log("Greater than or equal to: " + (m>=n)); //Greater than or equal to: false
console.log("Less than or equal to: " + (m<=n)); //Less than or equal to: true

//---------assignment operators------------
let c=10;
console.log("Assignment: " + (c)); //Assignment: 10
c+=5;
console.log("Addition Assignment: " + (c)); //Addition Assignment: 15
c-=5;
console.log("Subtraction Assignment: " + (c)); //Subtraction Assignment: 10
c*=5;
console.log("Multiplication Assignment: " + (c)); //Multiplication Assignment: 50
c/=5;
console.log("Division Assignment: " + (c)); //Division Assignment: 10
c%=5;
console.log("Modulus Assignment: " + (c)); //Modulus Assignment: 0

//---------bitwise operators------------
let p=5, q=3;
console.log("Bitwise AND: " + (p & q)); //Bitwise AND: 1
console.log("Bitwise OR: " + (p | q)); //Bitwise OR: 7
console.log("Bitwise XOR: " + (p ^ q)); //Bitwise XOR: 6
console.log("Bitwise NOT: " + (~p)); //Bitwise NOT: -6
console.log("Left Shift: " + (p << 1)); //Left Shift: 10
console.log("Right Shift: " + (p >> 1)); //Right Shift: 2

//---------unary operators------------
let r=10;
console.log("Unary Plus: " + (+r)); //Unary Plus: 10
console.log("Unary Minus: " + (-r)); //Unary Minus: -10
console.log("Logical NOT: " + (!r)); //Logical NOT: false
console.log("Typeof: " + (typeof r)); //Typeof: number  
console.log("Increment: " + (++r)); //Increment: 11
console.log("Decrement: " + (--r)); //Decrement: 10

//---------ternary operators------------
let age=18;
let canVote=(age>=18) ? "Yes" : "No";
console.log("Can vote: " + canVote); //Can vote: Yes

//---------String Concatenation------------
let firstName="John", lastName="Doe";
let fullName=firstName + " " + lastName;
console.log("Full Name: " + fullName); //Full Name: John Doe
let greeting=`Hello ${firstName} ${lastName}`; //template literal backticks important instead of quotes in development
console.log(greeting); //Hello John Doe