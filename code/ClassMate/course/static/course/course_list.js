document.addEventListener('DOMContentLoaded', function() {
    const courseCards = document.querySelectorAll('.course-card');
    const searchInput = document.getElementById('courseSearch');

    courseCards.forEach(card => {
        const showDescriptionBtn = card.querySelector('.show-description-btn');
        const description = card.querySelector('.course-description');

        showDescriptionBtn.addEventListener('click', function() {
            if (description.style.display === 'none') {
                description.style.display = 'block';
                showDescriptionBtn.textContent = 'Hide Description';
            } else {
                description.style.display = 'none';
                showDescriptionBtn.textContent = 'Show Description';
            }
        });
    });

    searchInput.addEventListener('input', function() {
        const searchTerm = this.value.toLowerCase();
        
        courseCards.forEach(card => {
            const courseName = card.querySelector('h2').textContent.toLowerCase();
            const courseCode = card.querySelector('.course-code').textContent.toLowerCase();
            const courseDescription = card.querySelector('.course-description').textContent.toLowerCase();
            
            if (courseName.includes(searchTerm) || courseCode.includes(searchTerm) || courseDescription.includes(searchTerm)) {
                card.style.display = '';
            } else {
                card.style.display = 'none';
            }
        });
    });
});

