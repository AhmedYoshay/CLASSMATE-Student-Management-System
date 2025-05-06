document.addEventListener('DOMContentLoaded', () => {
    // Handle AJAX form submissions
    const ajaxForms = document.querySelectorAll('form[data-ajax="true"]');

    ajaxForms.forEach(form => {
        form.addEventListener('submit', async (event) => {
            event.preventDefault(); // Prevent default form submission
            const formData = new FormData(form);
            const actionUrl = form.action;

            try {
                const response = await fetch(actionUrl, {
                    method: 'POST',
                    body: formData
                });

                if (response.ok) {
                    const jsonResponse = await response.json();
                    alert(jsonResponse.message); // Notify the user
                    if (form.dataset.redirect) {
                        window.location.href = form.dataset.redirect; // Redirect if specified
                    } else {
                        location.reload(); // Reload the page to reflect changes
                    }
                } else {
                    const errorResponse = await response.json();
                    alert(`Error: ${errorResponse.error}`);
                }
            } catch (error) {
                console.error('Error submitting form:', error);
                alert('An error occurred. Please try again.');
            }
        });
    });

    // Countdown Timer for Assignment Deadlines
    const countdownElements = document.querySelectorAll('[data-countdown]');

    countdownElements.forEach(element => {
        const deadline = new Date(element.dataset.countdown).getTime();

        const updateCountdown = () => {
            const now = new Date().getTime();
            const timeLeft = deadline - now;

            if (timeLeft <= 0) {
                element.textContent = 'Deadline passed';
                clearInterval(interval);
                return;
            }

            const days = Math.floor(timeLeft / (1000 * 60 * 60 * 24));
            const hours = Math.floor((timeLeft % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
            const minutes = Math.floor((timeLeft % (1000 * 60 * 60)) / (1000 * 60));
            const seconds = Math.floor((timeLeft % (1000 * 60)) / 1000);

            element.textContent = `${days}d ${hours}h ${minutes}m ${seconds}s`;
        };

        const interval = setInterval(updateCountdown, 1000);
        updateCountdown(); // Initial call to set the countdown immediately
    });
});
