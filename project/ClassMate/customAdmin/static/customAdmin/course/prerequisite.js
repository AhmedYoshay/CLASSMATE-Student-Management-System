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

