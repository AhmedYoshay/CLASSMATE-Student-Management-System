document.addEventListener('DOMContentLoaded', function() {
    function scrollToEditForm() {
        const editForm = document.querySelector('form');
        if (editForm) {
            editForm.scrollIntoView({ behavior: 'smooth', block: 'start' });
        }
    }

    const urlParams = new URLSearchParams(window.location.search);
    if (urlParams.has('edit')) {
        scrollToEditForm();
    }

    const editLinks = document.querySelectorAll('a[href^="?edit="]');
    editLinks.forEach(link => {
        link.addEventListener('click', function(e) {
            setTimeout(scrollToEditForm, 100);
        });
    });
});
document.addEventListener("DOMContentLoaded", () => {
    const searchInput = document.getElementById("searchInput");
    const tableRows = document.querySelectorAll("#issuedBooksTable tbody tr");

    searchInput.addEventListener("input", () => {
        const searchQuery = searchInput.value.toLowerCase();

        tableRows.forEach((row) => {
            const cells = Array.from(row.children);
            const rowText = cells.map(cell => cell.textContent.toLowerCase()).join(" ");
            if (rowText.includes(searchQuery)) {
                row.style.display = "";
            } else {
                row.style.display = "none";
            }
        });
    });
});

