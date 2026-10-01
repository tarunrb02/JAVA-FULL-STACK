let loginButton = document.getElementById("loginButton");
let from = document.getElementById("form");

function validateForm(e) { //onsubmit function is called when the login button is clicked
    // e.preventDefault();
    let userName = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    console.log(userName, password);
    
    let regex = /^[a-zA-Z0-9]+$/; // Regular expression to allow only alphanumeric characters

    let errorMessage = document.getElementById("error-message");
    if(userName =="" || password == "") {
        errorMessage.style.display = "block";
        errorMessage.textContent = "Username and password cannot be empty.";
        return false;   // Prevent form submission
    }

    if(userName.length < 4 || password.length < 4) {
        errorMessage.style.display = "block";
        errorMessage.textContent = "Username and password must be at least 4 characters long.";
        return false; // Prevent form submission
    }
    if(!regex.test(userName) || !regex.test(password)) {
        errorMessage.style.display = "block";
        errorMessage.textContent = "Username and password can only contain alphanumeric characters.";
        return false; // Prevent form submission
    }
};