// Initialize Bootstrap tooltips
document.addEventListener('DOMContentLoaded', function () {
    var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'));
    tooltipTriggerList.forEach(function (tooltipTriggerEl) {
        new bootstrap.Tooltip(tooltipTriggerEl);
    });
});

// Example: Adding rows to a dynamic table
document.getElementById('add-expense-btn').addEventListener('click', function () {
    const tableBody = document.getElementById('expense-table-body');
    const row = document.createElement('tr');
    row.innerHTML = `
        <td>Example Category</td>
        <td>Example Date</td>
        <td>₹1000</td>
        <td><button class="btn btn-danger btn-sm delete-row">Delete</button></td>
    `;
    tableBody.appendChild(row);
});

// Example: Delete a row from the table
document.addEventListener('click', function (event) {
    if (event.target && event.target.classList.contains('delete-row')) {
        event.target.closest('tr').remove();
    }
});

// Modal handling for adding expenses
const expenseModal = document.getElementById('addExpenseModal');
expenseModal.addEventListener('show.bs.modal', function (event) {
    // Clear the form fields when modal is opened
    document.getElementById('expense-form').reset();
});

// Form validation
document.getElementById('expense-form').addEventListener('submit', function (event) {
    event.preventDefault();
    const amountInput = document.getElementById('expense-amount');
    if (amountInput.value <= 0) {
        alert('Amount must be greater than zero!');
        return;
    }
    alert('Expense added successfully!');
    bootstrap.Modal.getInstance(expenseModal).hide();
});
