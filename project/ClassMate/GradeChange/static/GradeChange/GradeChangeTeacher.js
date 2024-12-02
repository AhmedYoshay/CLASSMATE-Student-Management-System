document.addEventListener('DOMContentLoaded', function() {
    const searchInput = document.getElementById('searchInput');
    const table = document.getElementById('feedbackTable');
    const rows = table.getElementsByTagName('tr');

    searchInput.addEventListener('keyup', function() {
        const searchTerm = searchInput.value.toLowerCase(); // Get the search term
        for (let i = 1; i < rows.length; i++) { // Start from 1 to skip the table header
            const cells = rows[i].getElementsByTagName('td');
            let rowText = '';
            // Combine the text content of each column in the row for a full search
            for (let j = 0; j < cells.length; j++) {
                rowText += cells[j].textContent.toLowerCase() + ' ';
            }

            // If the row matches the search term, display it; otherwise, hide it
            if (rowText.indexOf(searchTerm) !== -1) {
                rows[i].style.display = '';
            } else {
                rows[i].style.display = 'none';
            }
        }
    });
});
