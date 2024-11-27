function toggleSubcategories(element) {
    const subcategoryList = element.nextElementSibling;
    const toggleIcon = element.querySelector('.toggle-icon');
    const isVisible = subcategoryList.classList.contains('active');
    
    subcategoryList.classList.toggle('active');
    toggleIcon.innerHTML = isVisible ? '&#9660;' : '&#9650;';
    
    const allSubcategoryLists = document.querySelectorAll('.subcategory-list');
    allSubcategoryLists.forEach(list => {
        if (list !== subcategoryList) {
            list.classList.remove('active');
            list.previousElementSibling.querySelector('.toggle-icon').innerHTML = '&#9660;';
        }
    });
}
function toggleSubcategories(element) {
    const subcategoryList = element.nextElementSibling;
    const toggleIcon = element.querySelector('.toggle-icon');
    const isVisible = subcategoryList.classList.contains('active');
    
    subcategoryList.classList.toggle('active');
    toggleIcon.innerHTML = isVisible ? '&#9660;' : '&#9650;';
    
    const allSubcategoryLists = document.querySelectorAll('.subcategory-list');
    allSubcategoryLists.forEach(list => {
        if (list !== subcategoryList) {
            list.classList.remove('active');
            list.previousElementSibling.querySelector('.toggle-icon').innerHTML = '&#9660;';
        }
    });
}
document.addEventListener("DOMContentLoaded", function () {
    const canvas = document.getElementById('bellCurveCanvas');
    const ctx = canvas.getContext('2d');

    const bellCurveData = JSON.parse(document.getElementById('analysis-data').textContent);
    console.log('Bell Curve Data:', bellCurveData);

    let bellMean = bellCurveData.class_avg || 0;
    let stdDev = bellCurveData.class_std_dev || 1; 
    const studentMark = bellCurveData.obtained_weightage || 0; 
    if (stdDev <= 0) {
        stdDev = 1; 
    }

    function normalPDF(x, mean, stdDev) {
        const exponent = -0.5 * Math.pow((x - mean) / stdDev, 2);
        return (1 / (stdDev * Math.sqrt(2 * Math.PI))) * Math.exp(exponent);
    }

    function drawBellCurve() {
        ctx.clearRect(0, 0, canvas.width, canvas.height);

        const canvasWidth = canvas.width;
        const canvasHeight = canvas.height;
        const xMin = bellMean - 4 * stdDev;
        const xMax = bellMean + 4 * stdDev;
        const yMax = normalPDF(bellMean, bellMean, stdDev);

        const mapX = (x) => ((x - xMin) / (xMax - xMin)) * canvasWidth;
        const mapY = (y) => canvasHeight - (y / yMax) * (canvasHeight * 0.7);

        const gradient = ctx.createLinearGradient(0, 0, 0, canvasHeight);
        gradient.addColorStop(0, "rgba(0, 0, 255, 0.7)");
        gradient.addColorStop(1, "rgba(173, 216, 230, 0.3)");

        ctx.beginPath();
        ctx.moveTo(0, canvasHeight);
        for (let x = xMin; x <= xMax; x += 0.1) {
            const y = normalPDF(x, bellMean, stdDev);
            ctx.lineTo(mapX(x), mapY(y));
        }
        ctx.lineTo(canvasWidth, canvasHeight);
        ctx.closePath();

        ctx.fillStyle = gradient;
        ctx.fill();

        ctx.beginPath();
        for (let x = xMin; x <= xMax; x += 0.1) {
            const y = normalPDF(x, bellMean, stdDev);
            ctx.lineTo(mapX(x), mapY(y));
        }
        ctx.strokeStyle = "blue";
        ctx.lineWidth = 2;
        ctx.stroke();
    }

    function drawStudentMarker() {
        const canvasWidth = canvas.width;
        const canvasHeight = canvas.height;
        const xMin = bellMean - 4 * stdDev;
        const xMax = bellMean + 4 * stdDev;

        const mapX = (x) => ((x - xMin) / (xMax - xMin)) * canvasWidth;

        const studentX = mapX(studentMark);
        ctx.beginPath();
        ctx.moveTo(studentX, canvas.height);
        ctx.lineTo(studentX, canvasHeight * 0.3);
        ctx.strokeStyle = "red";
        ctx.lineWidth = 2;
        ctx.stroke();

        ctx.fillStyle = "black";
        ctx.font = "14px Arial";
        ctx.textAlign = "left";
        ctx.fillText('You: ' + studentMark.toFixed(2), studentX, canvasHeight * 0.25);
    }

    function resizeCanvas() {
        const container = canvas.parentElement;

        canvas.width = container.clientWidth;
        canvas.height = Math.min(400, container.clientWidth * 0.5);

        drawBellCurve();
        drawStudentMarker();
    }

    setTimeout(() => {
        drawBellCurve();
        drawStudentMarker();
    }, 0);

    window.addEventListener('resize', resizeCanvas);
});
