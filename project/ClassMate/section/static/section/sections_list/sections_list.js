document.addEventListener('DOMContentLoaded', function() {
    const searchInput = document.getElementById('courseSearch');
    const tableBody = document.getElementById('sectionsTableBody');

    if (searchInput && tableBody) {
        searchInput.addEventListener('input', filterSections);
    }

    function filterSections() {
        const searchTerm = searchInput.value.toLowerCase();
        const rows = tableBody.getElementsByTagName('tr');

        for (let row of rows) {
            const text = row.textContent.toLowerCase();
            row.style.display = text.includes(searchTerm) ? '' : 'none';
        }
    }
});

function openConfirmationModal(sectionLabel, courseName, teacherName, availableSeats, capacity, sectionId) {
    const sectionDetails = `Section: ${sectionLabel}<br>Course: ${courseName}<br>Teacher: ${teacherName}<br>Capacity: ${availableSeats} / ${capacity}`;
    document.getElementById('sectionDetails').innerHTML = sectionDetails;
    document.getElementById('confirmEnrollForm').action = `enroll/${sectionId}/`; 
    document.getElementById('confirmationModal').style.display = "block";
}

function closeConfirmationModal() {
    document.getElementById('confirmationModal').style.display = "none";
}

// Close the modal when clicking anywhere outside of it
window.onclick = function(event) {
    if (event.target === document.getElementById('confirmationModal')) {
        closeConfirmationModal();
    }
}

function showMessage(message, type) {
    const messagesContainer = document.getElementById('messagesContainer');
    if (messagesContainer) {
        const alertDiv = document.createElement('div');
        alertDiv.className = `alert ${type}`;
        alertDiv.innerHTML = `
            <span class="alert-icon">
                ${type === 'success' ? '✔' : type === 'error' ? '⚠' : 'ℹ'}
            </span>
            ${message}
        `;
        messagesContainer.appendChild(alertDiv);

        setTimeout(() => {
            alertDiv.remove();
        }, 5000);
    }
}

function adjustTableLayout() {
    const table = document.querySelector('.sections-table');
    if (table) {
        if (window.innerWidth <= 768) {
            table.classList.add('responsive');
        } else {
            table.classList.remove('responsive');
        }
    }
}

window.addEventListener('load', adjustTableLayout);
window.addEventListener('resize', adjustTableLayout);
