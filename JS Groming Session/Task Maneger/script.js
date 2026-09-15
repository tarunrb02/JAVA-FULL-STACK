// Main container
let app = document.getElementById("app");

// Create main container
let container = document.createElement("div");
container.classList.add("container");

// Heading
let heading = document.createElement("h1");
heading.innerText = "Task Manager";

// Input
let input = document.createElement("input");
input.placeholder = "Enter a task";

// Add button
let addButton = document.createElement("button");
addButton.innerText = "Add Task";

// Task list
let taskList = document.createElement("div");

// Add elements to container
container.append(heading, input, addButton, taskList);

// Add container to page
app.append(container);

// Add Task
addButton.addEventListener("click", function () {
  let taskText = input.value;

  if (taskText === "") {
    alert("Please enter a task");
    return;
  }

  // Create task container
  let task = document.createElement("div");
  task.classList.add("task");

  // Task name
  let taskName = document.createElement("span");
  taskName.innerText = taskText;

  // Complete button
  let completeButton = document.createElement("button");
  completeButton.innerText = "Complete";

  // Delete button
  let deleteButton = document.createElement("button");
  deleteButton.innerText = "Delete";

  // Add elements
  task.append(taskName, completeButton, deleteButton);

  // Add task to list
  taskList.append(task);

  // Clear input
  input.value = "";

  // Complete task
  completeButton.addEventListener("click", function () {
    taskName.classList.toggle("completed");
  });

  // Delete task
  deleteButton.addEventListener("click", function () {
    task.remove();
  });
});