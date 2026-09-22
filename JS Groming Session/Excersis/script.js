const tickets = [];

function addTicket() {
  const ticketName = document.getElementById("ticketname").value.trim();
  const ticketIssue = document.getElementById("ticketissue").value.trim();
  // const ticketPriority = document.getElementById('ticketpriority').value.trim();

  if (!ticketName || !ticketIssue) {
    alert("Please fill in all fields before submitting the ticket.");
    return;
  }

  if (ticketName && ticketIssue) {
    const newTicket = {
      name: ticketName,
      issue: ticketIssue,
      // priority: ticketPriority,
      open: true,
    };
    tickets.push(newTicket);
    renderTickets(); // Update the ticket list display
    console.log(tickets);
  }
}
function closeTicket(index) {
  tickets[index].open = false;
  renderTickets();
}

function renderTickets() {
  document.querySelector("#ticketList").innerHTML = tickets
    .map((ticket, index) => `${name} - ${issue} ${open ? "Close" : "Closed"}`)
    .join("<br>");
}

document.getElementById("createTicket").onclick = addTicket();

document.getElementById("searchTicket").addEventListener("click", function (event) {
  if (event.target.tagName === ) {
    const index = parseInt(event.target.dataset.index, 10);
    closeTicket(index);
  }
});

renderTickets(); // Initial render of tickets