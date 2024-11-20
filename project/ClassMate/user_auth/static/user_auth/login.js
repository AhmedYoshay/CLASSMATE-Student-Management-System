document.addEventListener('DOMContentLoaded', function() {
    const loginSection = document.querySelector('.login-section');
    loginSection.style.opacity = '0';
    loginSection.style.transform = 'translateY(-20px)';
    
    setTimeout(() => {
        loginSection.style.transition = 'opacity 0.5s ease, transform 0.5s ease';
        loginSection.style.opacity = '1';
        loginSection.style.transform = 'translateY(0)';
    }, 100);

    function adjustRecaptcha() {
        const recaptchaContainer = document.querySelector('.recaptcha-container');
        const recaptcha = document.querySelector('.g-recaptcha');
        if (recaptchaContainer && recaptcha) {
            const containerWidth = recaptchaContainer.offsetWidth;
            const recaptchaWidth = recaptcha.offsetWidth;
            if (containerWidth < recaptchaWidth) {
                const scale = containerWidth / recaptchaWidth;
                recaptchaContainer.style.transform = `scale(${scale})`;
            } else {
                recaptchaContainer.style.transform = 'scale(1)';
            }
        }
    }

    window.addEventListener('resize', adjustRecaptcha);
    setTimeout(adjustRecaptcha, 1000); 
});