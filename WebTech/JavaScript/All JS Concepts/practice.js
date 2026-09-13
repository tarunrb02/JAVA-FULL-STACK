
// var count = 0;
// let count=0;
function increment() {
    var count=0;
    return ()=> ++count;

}
console.log(count);

// let res=increment();
console.log(increment()());
console.log(count);
console.log(increment()());