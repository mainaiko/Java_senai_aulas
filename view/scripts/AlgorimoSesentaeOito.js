const frm = document.querySelector("form")

frm.addEventListener("submit", (e)=>{
    e.preventDefault()

    const nomeFilme = frm.filme.value
    alert(`o filme escolhido foi: ${nomeFilme}`)

    const tempo = Number(frm.tempo.value)
    const horas = Math.floor(tempo / 60)
    const minutos = tempo % 60
    alert(`o filme tem ${horas} horas e ${minutos} minutos de duração`)

})