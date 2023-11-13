document.addEventListener("keyup", e=>{

  if (e.target.matches("#buscador")){

      if (e.key ==="Escape")e.target.value = ""

      document.querySelectorAll(".clasificacion").forEach(socio =>{

          socio.textContent.toLowerCase().includes(e.target.value.toLowerCase())
            ?socio.classList.remove("filtro")
            :socio.classList.add("filtro")
      })

  }

})


