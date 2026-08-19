class Parent {
    constructor() {
        this.name = 'Parent';
    }
    hello() {
        console.log('Hello from Parent');
    }

    sleep() {
        console.log('Parent is sleeping');
    }
    work() {
        console.log('Parent is working');
    }
}

class Child extends Parent {
    work() { 
        super.sleep(); // Call the sleep method from Parent class
        console.log('Child is working');
    }
    constructor() {
        super(); 
        this.name = 'Child';
    }
}

let childInstance = new Child();
console.log(childInstance.name); // Output: Child
childInstance.hello(); // This will call the hello method from Parent class since it's not overridden in Child class
childInstance.work(); // This will call the work method from Child class