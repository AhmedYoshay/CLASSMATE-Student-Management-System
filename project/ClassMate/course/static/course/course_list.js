document.addEventListener('DOMContentLoaded', function() {
    const courseCards = document.querySelectorAll('.course-card');

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
});