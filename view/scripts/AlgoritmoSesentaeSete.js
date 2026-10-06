const frm = document.getElementById("form");
const res = document.querySelector("h5");

frameElement.addEventListener("submit", (e)=>{
    const nome = frm.nome.value
    res.textContent = 'Alo, ${nome}!'
    e.preventDefault()
});