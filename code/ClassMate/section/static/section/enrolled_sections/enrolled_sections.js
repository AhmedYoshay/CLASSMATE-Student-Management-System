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