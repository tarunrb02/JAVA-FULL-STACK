//JS is not multi-threaded language 
//javascript is single-threaded, meaning it can only execute one piece of code at a time.
// but it can handle asynchronous operations using event loop and callback functions.
// Asynchronous operations are those that do not block the execution of other code while waiting for a task to complete.
// Examples of asynchronous operations include fetching data from an API, reading files, or waiting for user input.
// non blocking thread lng

function getData(id, callback) {
    console.log("Fetching data...");
    setTimeout(() => {
        console.log(`Data fetched successfully for id: ${id}`);
        callback();
    }, 2000);
}

getData(1, () => {
    getData(2, () => {
        getData(3, () => {
            console.log("All data fetched successfully!");
        });
    });
});


async function fetchData() {
    console.log("Fetching data...");
    // return "Hello, World!";
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Hello, World!");
        }, 2000);
});
}

console.log("Fetching data...");
console.log(fetchData());
console.log("Data fetched successfully!");

function demo() {
    console.log("Demo function started");
    promiseDemo().then((result) => {
        console.log("Promise resolved with result: " + result);
    }).catch((error) => {
        console.error("Promise rejected with error: " + error);
    });
    console.log("Demo function ended");
}
