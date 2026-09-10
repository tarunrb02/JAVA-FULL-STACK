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
colors.forEach(a=>{
    console.log(a);    
});

console.log();

//forof
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
7. splice();
8. includes();
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

//Multidimensional arrays
let matrix=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
];
console.log(matrix);

//Array destructuring
let [a,b,c]=colors;
console.log(a,b,c);
