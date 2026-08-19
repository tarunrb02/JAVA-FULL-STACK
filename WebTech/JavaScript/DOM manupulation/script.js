
const h2=document.querySelector("h2");
h2.innerText="Welcome to "+h2.innerText;

console.log(h2.innerText);

let mydivs=document.querySelectorAll(".box");
mydivs.forEach((div,index)=>{
    div.innerText=`This is a unique content for each div ${index+1}`;
});