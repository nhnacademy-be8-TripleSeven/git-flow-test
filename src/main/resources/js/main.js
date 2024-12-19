let slideIndex = {};

function nextSlide(sliderId) {
    const container = document.querySelector(#${sliderId} .book-container);
    const items = container.querySelectorAll('.book-item');
    const totalItems = items.length;

    if (!slideIndex[sliderId]) slideIndex[sliderId] = 0;
    slideIndex[sliderId] = (slideIndex[sliderId] + 1) % totalItems;

    container.style.transform = translateX(-${slideIndex[sliderId] * 200}px);
}

function prevSlide(sliderId) {
    const container = document.querySelector(#${sliderId} .book-container);
    const items = container.querySelectorAll('.book-item');
    const totalItems = items.length;

    if (!slideIndex[sliderId]) slideIndex[sliderId] = 0;
    slideIndex[sliderId] = (slideIndex[sliderId] - 1 + totalItems) % totalItems;

    container.style.transform = translateX(-${slideIndex[sliderId] * 200}px);
}