function changePoster(event) {
    let poster =document.getElementById('post');
    console.log(event.target.src);
    poster.src = event.target.src;
}