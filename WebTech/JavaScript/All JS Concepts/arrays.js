const colors=["red", "green", "blue", "yellow", "purple", "orange"];
console.log(colors);

const arr=[10,"arjun", true];
console.log(arr);

//access element
console.log(arr[0]);

//replace element
arr[0]=20;
console.log(arr[0]);

//length of array
console.log(arr.length);

for(let i=0;i<colors.length;i++){
    console.log(colors[i]);
}

console.log();

//foreach
colors.forEach((a)=>{
    console.log(a);    
});
console.log();

let numbers=[1,2,3,4,5];
console.log(numbers);

numbers.forEach((a,i)=>{
    console.log(a+3);
    console.log("index"+i);
        
});
console.log();

//map function
let newNumbers=numbers.map((a, i)=>{
    return a+3;
});
console.log(newNumbers);
console.log();

//filter function
let evenNumbers=numbers.filter((a)=>{ //filter returns a new array with elements that pass the test implemented by the provided function
    return a%2==0; //returns true if a is even
});
console.log(evenNumbers);

//reduce function
let sum=numbers.reduce((acc, a)=>{ //acc is accumulator, a is current value
    return acc+a; //returns the sum of accumulator and current value back to accumulator for next iteration
},0); //0 is initial value of accumulator
console.log(sum);

//for of
for(let a of arr){
    console.log(a);
};

/*
    methods in array
1. push(); // add element to end
2. pop(); // remove last
3. shift(); // remove 1st element
4. indexOf(); //get index
5. join(); //join all elements in to String
6. slice(); // extract part
7. splice(); // remove or replace elements
8. includes(); // check if element is present
9. reverse();// reverse the array
10. sort(); // sort the array
11. concat(); // merge two arrays 
*/

let cart=[];

//add item
cart.push("T-shirt");
cart.push("shoes");
cart.push("watch");

console.log("cart item: ",cart);

// removing item
let popItem=cart.pop();
console.log("pop item",popItem);
console.log("cart item: ",cart);

//indexOf
console.log(cart.indexOf("shoes")); // returns index of shoes

//includes
console.log(cart.includes("shoes")); // returns true if shoes is in the array

//join
console.log(cart.join(", ")); // returns string of all items in the array

//slice
let newCart=cart.slice(0,1); // returns new array with items from index 0 to 1
console.log("new cart: ",newCart);

//splice
cart.splice(1,1);// removes 1 item from index 1
console.log("cart item: ",cart);

// let numbers=[1,2,3,4,5];
//map()
let squaredNumbers=numbers.map((a)=>{
    return a*a;
});
console.log("squared numbers: ",squaredNumbers);

//filter()
let oddNumbers=numbers.filter((a)=>{
    return a%2!=0;
});
console.log("odd numbers: ",oddNumbers);

//reduce()
let product=numbers.reduce((acc, a)=>{
    return acc*a;
},1);
console.log("product: ",product);

//Multidimensional arrays
let matrix=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
];
console.log(matrix);

//Array destructuring
let [a,b,c]=colors;
let [d,e,f]=colors; // we can't store random index values in array destructuring, we can only store values in order of the array

// ...rest operator
let [x,y,...rest]=colors;
console.log(rest); // rest will store the remaining values in the array
console.log(typeof rest); // typeof rest will return object because rest is an array and arrays are objects in javascript

console.log(d,e,f);

console.log(a,b,c);

// spread operator
// spread operator is used to spread the elements of an array or object into a new array or object. It is denoted by three dots (...).
let newColors=[...colors,"black","white"];
console.log(newColors);

//difference between rest and spread operator

//find() returns the first element in the array that satisfies the provided testing function. If no values satisfy the testing function, undefined is returned.
const people = [
    { name: "Alice", age: 25 },
    { name: "Bob", age: 30 },
    { name: "Charlie", age: 35 }
];

const person = people.find((p) => p.age === 30).name;
console.log(person); // Output: { name: "Bob", age: 30 }    