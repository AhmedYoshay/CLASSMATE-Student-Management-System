document.addEventListener('DOMContentLoaded', function() {
    const sidebar = document.getElementById('sidebar');
    const mainContent = document.getElementById('main-content');
    const sidebarToggle = document.getElementById('sidebarToggle');
    const closeSidebar = document.getElementById('closeSidebar');

    function toggleSidebar() {
        sidebar.classList.toggle('open');
        if (window.innerWidth <= 768) {
            document.body.style.overflow = sidebar.classList.contains('open') ? 'hidden' : '';
        }
    }

    sidebarToggle.addEventListener('click', toggleSidebar);
    closeSidebar.addEventListener('click', toggleSidebar);

    document.addEventListener('click', function(event) {
        const isClickInsideSidebar = sidebar.contains(event.target);
        const isClickOnToggleButton = sidebarToggle.contains(event.target);

        if (!isClickInsideSidebar && !isClickOnToggleButton && sidebar.classList.contains('open') && window.innerWidth <= 768) {
            toggleSidebar();
        }
    });

    function handleResize() {
        if (window.innerWidth > 768) {
            sidebar.classList.remove('open');
            document.body.style.overflow = '';
        }
    }

    window.addEventListener('resize', handleResize);

    handleResize();
});

