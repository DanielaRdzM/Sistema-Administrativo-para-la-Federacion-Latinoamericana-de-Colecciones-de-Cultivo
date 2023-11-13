document.addEventListener('keyup', e=>{

  if (e.target.matches('#buscador')){

      if (e.key ==="Escape")e.target.value = ""

      document.querySelectorAll('.clasificacion').forEach(especialidad =>{

          especialidad.textContent.toLowerCase().includes(e.target.value.toLowerCase())
            ?especialidad.classList.remove("filtro")
            :especialidad.classList.add("filtro")
            
      })
  }

})

