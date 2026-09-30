let heading=document.getElementById("heading");
heading.style.color="blue";
heading.style.fontSize="30px";
heading.style.textAlign="center";
heading.style.fontFamily="cursive";
heading.style.backgroundColor="lightgray";

let subheading=document.getElementById("subheading");
subheading.style.color="green";
subheading.style.fontSize="20px";
subheading.style.textAlign="center";
subheading.style.fontFamily="serif";
subheading.style.backgroundColor="lightblue";

console.log(subheading.innerText+" this is innerText");
console.log(subheading.innerHTML+" this is innerHTML");
console.log(subheading.textContent+" this is textContent"); 


let mainDiv=document.getElementsByClassName("main")[0];
let newParagraph=document.createElement("p");
newParagraph.innerText="This is a new paragraph added to the main div.";
mainDiv.appendChild(newParagraph);

newParagraph.setAttribute("id","newPara");



// form task

let formDiv=document.getElementById("formDiv");
let form=document.createElement("form");
form.setAttribute("id","myForm");
formDiv.appendChild(form);

let nameInput=document.createElement("input");
nameInput.setAttribute("type","text");
nameInput.setAttribute("placeholder","Enter your name");
nameInput.setAttribute("id","nameInput");
form.appendChild(nameInput);
// form.appendChild(document.createElement("br")); // Add a line break between inputs
// form.appendChild(document.createElement("br")); // Add a line break between inputs

let ageInput=document.createElement("input");
ageInput.setAttribute("type","text");
ageInput.setAttribute("placeholder","Enter your age");
ageInput.setAttribute("id","ageInput");
form.appendChild(ageInput);
// form.appendChild(document.createElement("br")); // Add a line break between inputs
// form.appendChild(document.createElement("br")); // Add a line break between inputs

let addressInput=document.createElement("input");
addressInput.setAttribute("type","text");
addressInput.setAttribute("placeholder","Enter your address");
addressInput.setAttribute("id","addressInput");
form.appendChild(addressInput);
// form.appendChild(document.createElement("br")); // Add a line break between inputs
// form.appendChild(document.createElement("br")); // Add a line break between inputs

let submitButton=document.createElement("button");
submitButton.innerText="Submit";
submitButton.setAttribute("type","submit");
submitButton.setAttribute("id","submitButton");
form.appendChild(submitButton);



// ============================= Inline EventHandlers==================================
// let  showImage=()=>{
//     let image=document.querySelector("img");
//     // image.style.display="block";
//     image.style.visibility="visible";
// }

// let  hideImage=()=>{
//     let image=document.querySelector("img");
//     // image.style.display="none";
//     image.style.visibility="hidden";
// }

let  toggleImage=()=>{
    // let image=document.querySelector("img");
    // let btn=document.querySelector("#btn");
   
    // image.style.display="block";
    if(btn.innerText=="Show"){
        image.style.visibility="visible";
        btn.innerText="Hide";
    } else {
        image.style.visibility="hidden";
        btn.innerText="Show";
    }
}

// =============================  DOM Property EventHandlers==================================

// there 3 ways to add event handlers in javascript
// 1. Inline Event Handlers
// 2. DOM Property Event Handler 
// 3. addEventListener()

// let image=document.querySelector("img");
// let btn=document.querySelector("#btn");

// btn.onclick=()=>{
//     if(btn.innerText=="Show"){
//         image.style.visibility="visible";
//         btn.innerText="Hide";
//     } else {
//         image.style.visibility="hidden";
//         btn.innerText="Show";
//     }
// }


// ==============================  addEventListener() EventHandlers==================================

let image=document.querySelector("img");
let btn=document.querySelector("#btn");

btn.addEventListener("click",toggleImage); //it will call the toggleImage function when the button is clicked

//!event delegation is a technique in which we add an event listener to a parent element instead of adding it to each child element. This is useful when we have a large number of child elements and we want to avoid adding event listeners to each one of them. Instead, we can add a single event listener to the parent element and use the event object to determine which child element was clicked.

let parentDiv=document.getElementById("parent");

parentDiv.addEventListener("click", (e) => {
    if (e.target.tagName === "BUTTON") {
        console.log(`Button clicked: ${e.target.innerText}`);
    }
});