let button=document.querySelectorAll('button');
let cart_box=document.getElementsByClassName('updateContent');

console.log(cart_box);

// console.log(btn);
let arr=Array.from(button);
let count=0;
arr.forEach(button=>{
    button.addEventListener('click',(e)=>{
        count++;
        let string = `${count} items added`;
        cart_box[0].innerText=string;
    });
});
console.log(cart_box);

