document.addEventListener('DOMContentLoaded', function() {
    const searchInput = document.getElementById('search');
    const tableBody = document.getElementById('booksTableBody');
    const rows = tableBody.querySelectorAll('tr');

    searchInput.addEventListener('input', function() {
        const searchQuery = this.value.toLowerCase();

        rows.forEach(function(row) {
            const text = row.textContent.toLowerCase();
            if (text.includes(searchQuery)) {
                row.style.display = '';
            } else {
                row.style.display = 'none';
            }
        });

        const visibleRows = tableBody.querySelectorAll('tr:not([style*="display: none"])');
        if (visibleRows.length === 0) {
            const noResultsRow = document.createElement('tr');
            noResultsRow.innerHTML = '<td colspan="4">No results found.</td>';
            tableBody.appendChild(noResultsRow);
        } else {
            const noResultsRow = tableBody.querySelector('tr td[colspan="4"]');
            if (noResultsRow) {
                noResultsRow.parentElement.remove();
            }
        }
    });
});