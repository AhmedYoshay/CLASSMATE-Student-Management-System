document.addEventListener('DOMContentLoaded', function() {
    const sidebar = document.getElementById('sidebar');
    const mainContent = document.getElementById('main-content');
    const sidebarToggle = document.getElementById('sidebarToggle');

    function toggleSidebar() {
        sidebar.classList.toggle('open');
        mainContent.classList.toggle('sidebar-open');
    }

    sidebarToggle.addEventListener('click', function(event) {
        event.stopPropagation();
        toggleSidebar();
    });

    document.addEventListener('click', function(event) {
        if (!sidebar.contains(event.target) && sidebar.classList.contains('open')) {
            toggleSidebar();
        }
    });

    sidebar.addEventListener('click', function(event) {
        event.stopPropagation();
    });
});

