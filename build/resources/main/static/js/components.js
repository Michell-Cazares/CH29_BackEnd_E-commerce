//Arreglo para guardar los usuarios en el local storage
let userlogged = JSON.parse(this.localStorage.getItem("user-logged"));;


class Footer extends HTMLElement {
  constructor() {
    super();
  }
  connectedCallback() {
    this.innerHTML =
      `
       <!--Inicia footer-->
  <footer>
    <div class="container-fluid pieDePagina">
      <div class="row p-5 pb-2 color1">
        <div class="footer-center col-sm-12 col-md-4 col-lg-4 ">
          <p class="h4 mb-3">Síguenos</p>
          <!--Link de redes sociales-->
          <ul class="list-unstyled d-flex">
            <li>
              <a href="https://www.tiktok.com/@elotes.gutirrez?_t=8e8gVJCe1LB&_r=1"
                class="text-dark text-decoration-none" target="_blank" rel="noopener noreferrer">
                <i class='bx bxl-tiktok'></i></a>
              <a href="https://www.facebook.com/WinnivinMolina" class="text-dark text-decoration-none" target="_blank"
                rel="noopener noreferrer"><i class='bx bxl-facebook-circle'></i></a>
              <a href="https://www.instagram.com/Winnivinm/" class="text-dark text-decoration-none" target="_blank"
                rel="noopener noreferrer"><i class='bx bxl-instagram'></i></a>
              <a href="https://www.google.com/search?q=elotes+gutierrez+toluca&oq=elotes+gutierres+toluca&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIJCAEQIRgKGKABMgkIAhAhGAoYoAEyCQgDECEYChigATIJCAQQIRgKGKAB0gEJMTAzNjFqMGo0qAIAsAIA&sourceid=chrome&ie=UTF-8"
                class="text-dark text-decoration-none" target="_blank" rel="noopener noreferrer">
                <i class='bx bxl-google'></i></a>
            </li>
          </ul>
        </div>
        <div class="footer-center col-sm-12 col-md-4 col-lg-4 ">
          <p class="h4 mb-3">Legales</p>
          <ul class="list-unstyled d-flex">
            <li>
              <a href="./avisoPrivacidad.html" class="nav-link p-0 text-body-secondary" target="_blank" rel="noopener noreferrer">Aviso de privacidad</a>
              <a href="./terminosCondiciones.html" class="nav-link p-0 text-body-secondary" target="_blank" rel="noopener noreferrer">Términos y
                condiciones</a>
              <a href="./login.html" class="nav-link p-0 text-body-secondary">Mi
                cuenta</a>
            </li>
          </ul>
        </div>
        <div class="footer-center col-sm-12 col-md-4 col-lg-4">
          <p class="h4 mb-3">Patrocinador Oficial</p>
          <!--Link de patrocinadores-->
          <ul class="list-unstyled d-flex m-0">
            <li>
              <a href="https://sabritas.com.mx/promocion/" target="_blank" rel="noopener noreferrer"><img
                  src="https://res.cloudinary.com/dpgloi0zv/image/upload/v1693369525/sabritas_czhlje.png" width="70px" alt="logo-sabritas" /></a>
            </li>
          </ul>
        </div>
        <!-- Dirección -->
        <div class="col-xl-12">
          <p class="pt-4"><strong>Atendemos los 365 días del año. Reviviendo el sazón mexicano.</strong> <br>
            Elotes Gutiérrez. Av. Miguel Hidalgo Ote. 100, Centro, 50000 Toluca de Lerdo, México.</p>
        </div>
      </div>
    </div>
  </footer>
  <!--Termina footer-->
        `
  }
}



class IndexFooter extends HTMLElement {
  constructor() {
    super();
  }
  connectedCallback() {
    this.innerHTML =
      `
      <!--Inicia footer-->
      <footer>
        <div class="container-fluid pieDePagina">
          <div class="row p-5 pb-2 color1">
            <div class="footer-center col-sm-12 col-md-4 col-lg-4 ">
              <p class="h4 mb-3">Síguenos</p>
              <!--Link de redes sociales-->
              <ul class="list-unstyled d-flex">
                <li>
                  <a href="https://www.tiktok.com/@elotes.gutirrez?_t=8e8gVJCe1LB&_r=1"
                    class="text-dark text-decoration-none" target="_blank" rel="noopener noreferrer">
                    <i class='bx bxl-tiktok'></i></a>
                  <a href="https://www.facebook.com/WinnivinMolina" class="text-dark text-decoration-none" target="_blank"
                    rel="noopener noreferrer"><i class='bx bxl-facebook-circle'></i></a>
                  <a href="https://www.instagram.com/Winnivinm/" class="text-dark text-decoration-none" target="_blank"
                    rel="noopener noreferrer"><i class='bx bxl-instagram'></i></a>
                  <a href="https://www.google.com/search?q=elotes+gutierrez+toluca&oq=elotes+gutierres+toluca&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIJCAEQIRgKGKABMgkIAhAhGAoYoAEyCQgDECEYChigATIJCAQQIRgKGKAB0gEJMTAzNjFqMGo0qAIAsAIA&sourceid=chrome&ie=UTF-8"
                    class="text-dark text-decoration-none" target="_blank" rel="noopener noreferrer">
                    <i class='bx bxl-google'></i></a>
                </li>
              </ul>
            </div>
            <div class="footer-center col-sm-12 col-md-4 col-lg-4 ">
              <p class="h4 mb-3">Legales</p>
              <!--Legales-->
              <ul class="list-unstyled d-flex">
                <li>
                  <a href="./pages/avisoPrivacidad.html" class="nav-link p-0 text-body-secondary" target="_blank"
                    rel="noopener noreferrer">Aviso de privacidad</a>
                  <a href="./pages/terminosCondiciones.html" class="nav-link p-0 text-body-secondary" target="_blank"
                    rel="noopener noreferrer">Términos y
                    condiciones</a>
                  <a href="./pages/login.html" class="nav-link p-0 text-body-secondary">Mi
                    cuenta</a>
                </li>
              </ul>
            </div>
            <div class="footer-center col-sm-12 col-md-4 col-lg-4">
              <p class="h4 mb-3">Patrocinador Oficial</p>
              <!--Link de patrocinadores-->
              <ul class="list-unstyled d-flex m-0">
                <li>
                  <a href="https://sabritas.com.mx/promocion/" target="_blank" rel="noopener noreferrer"><img
                      src="https://res.cloudinary.com/dpgloi0zv/image/upload/v1693369525/sabritas_czhlje.png" width="70px" alt="logo-sabritas" /></a>
                </li>
              </ul>
            </div>
            <!-- Dirección -->
            <div class="col-xl-12">
              <p class="pt-4"><strong>Atendemos los 365 días del año. Reviviendo el sazón mexicano.</strong> <br>
                Elotes Gutiérrez. Av. Miguel Hidalgo Ote. 100, Centro, 50000 Toluca de Lerdo, México.</p>
            </div>
          </div>
        </div>
      </footer>
      <!--Termina footer-->
        `
  }
}




class IndexNavbar extends HTMLElement {
  connectedCallback() {
    this.innerHTML =
      `
      <!-- Navbar -->
      <nav class="navbar sticky-top navbar-expand-lg">
        <div class="container-fluid">
          <!-- Logo -->
          <a href="./index.html"><img src="https://res.cloudinary.com/dpgloi0zv/image/upload/v1693369525/logo_pbdywc.png" class="navbar-brand fs-4 logo"
              alt="logo de Elotes Gutierrez"></a>
          <!-- Toggle Btn -->
          <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar"
            aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <!-- SideBar -->
          <div class="sidebar offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar"
            aria-labelledby="offcanvasNavbarLabel">
            <!-- Side Header -->
            <div class="offcanvas-header">
              <a href="./index.html"><img src="https://res.cloudinary.com/dpgloi0zv/image/upload/v1693369525/logo_pbdywc.png" class="navbar-brand fs-4 logo-sidebar"
                  alt="logo de Elotes Gutierrez"></a>
              <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar"
                aria-controls="offcanvasNavbar" data-bs-dismiss="offcanvas" aria-label="Close">
                <i class='bx bx-x' style="font-size:30px"></i>
              </button>
            </div>
    
            <!-- Sidebar Body -->
            <div class="offcanvas-body d-flex flex-column flex-lg-row p-4 p-lg-0">
              <ul class="navbarUl navbar-nav pe-3">
                <li class="nav-item mx-2">
                  <a class="nav-link" href="./index.html">Inicio</a>
                </li>
                <li class="nav-item mx-2">
                  <a class="nav-link" href="./pages/nosotros.html">Nosotros</a>
                </li>
                <li class="nav-item mx-2">
                  <a class="nav-link" href="./pages/contacto.html">Contacto</a>
                </li>
                <li class="nav-item mx-2">
                  <a class="nav-link" href="./pages/productos.html">Productos</a>
                </li>
              </ul>
              <div class="d-flex justify-content-center align-items-center navBarButtons">
    
                <li class="nav-item dropdown">
                  <a class="nav-link" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    <i class='bx bx-user'></i>
                  </a>
                  <ul class="dropdown-menu dropdown-menu-right">
                    <li><a class="dropdown-item" id="btnIniciarSesion" href="./pages/login.html">Iniciar Sesión</a></li>
                    <li><a class="dropdown-item" id="btnRegistrate" href="./pages/signup.html">Regístrate</a></li>
                    <li><a id="btnLogout" class="dropdown-item" href="" style="display:none;">Cerrar Sesión</a></li>
                  </ul>
                </li>
    
    
                <a class="nav-link" href="./pages/carrito.html"><i class='bx bx-cart'></i></a>
    
              </div>
            </div>
          </div>
        </div>
      </nav>
      <!-- Termina Navbar -->
        `
  }
}



class Navbar extends HTMLElement {
  connectedCallback() {
    this.innerHTML =
      `
            <!-- Navbar -->
            <nav class="navbar sticky-top navbar-expand-lg bg-white">
              <div class="container-fluid">
                <!-- Logo -->
                <a href="../index.html"><img src="https://res.cloudinary.com/dpgloi0zv/image/upload/v1693369525/logo_pbdywc.png" class="navbar-brand fs-4 logo"
                    alt="logo de Elotes Gutierrez"></a>
                <!-- Toggle Btn -->
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar"
                  aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <!-- SideBar -->
                <div class="sidebar offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar"
                  aria-labelledby="offcanvasNavbarLabel">
                  <!-- Side Header -->
                  <div class="offcanvas-header">
                    <a href="../index.html"><img src="https://res.cloudinary.com/dpgloi0zv/image/upload/v1693369525/logo_pbdywc.png" class="navbar-brand fs-4 logo"
                        alt="logo de Elotes Gutierrez"></a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar"
                        aria-controls="offcanvasNavbar" data-bs-dismiss="offcanvas" aria-label="Close">
                        <i class='bx bx-x' style="font-size:40px"></i>
                      </button>
                  </div>
                  <!-- Sidebar Body -->
                  <div class="offcanvas-body d-flex flex-column flex-lg-row p-4 p-lg-0">
                  <ul class="navbarUl navbar-nav pe-3">
                      <li class="nav-item mx-2">
                        <a class="nav-link" href="../index.html">Inicio</a>
                      </li>
                      <li class="nav-item mx-2">
                        <a class="nav-link" href="./nosotros.html">Nosotros</a>
                      </li>
                      <li class="nav-item mx-2">
                        <a class="nav-link" href="./contacto.html">Contacto</a>
                      </li>
                      <li class="nav-item mx-2">
                        <a class="nav-link" href="./productos.html">Productos</a>
                      </li>
                    </ul>
                    <div class="d-flex justify-content-center align-items-center navBarButtons">
                    <li class="nav-item dropdown">
                    <a class="nav-link" role="button" data-bs-toggle="dropdown"
                      aria-expanded="false">
                      <i class='bx bx-user'></i>
                    </a>
                    <ul class="dropdown-menu">
                    <li><a class="dropdown-item" id="btnIniciarSesion" href="./login.html">Iniciar Sesión</a></li>
                    <li><a class="dropdown-item" id="btnRegistrate" href="./signup.html">Regístrate</a></li>
                    <li><a class="dropdown-item" id="btnLogout" href="" style="display:none;">Cerrar Sesión</a></li>
                    </ul>
                  </li>
                    <a class="nav-link" href="./carrito.html"><i class='bx bx-cart'></i></a>
                  </div>
                  </div>
                </div>
              </div>
            </nav>
            <!-- Termina Navbar -->
        `
  }
}



class Whatsapp extends HTMLElement {
  connectedCallback() {
    this.innerHTML =
      `
      <a href="https://wa.me/c/5217221953594" class="whatsapp" target="_blank" title="Whatsapp"> <i class='bx bxl-whatsapp whatsapp-icon'></i></a>
        `
  }
}

class CrearProducto extends HTMLElement {
  connectedCallback() {
    this.innerHTML =
      `
      <a href="./formProductos.html" class="btnCrearProducto" id="btnCrearProducto" style="display:none;" title="Crear un nuevo producto"><i class='bx bx-plus btnCrearProducto-icon'></i></a>
        `
  }
}

customElements.define('app-indexnavbar', IndexNavbar);
customElements.define('app-navbar', Navbar);
customElements.define('app-footer', Footer);
customElements.define('app-indexfooter', IndexFooter);
customElements.define('app-whatsapp', Whatsapp);
customElements.define('app-crearproducto', CrearProducto);

window.addEventListener("load", function (event) {
  event.preventDefault();
  let btnIniciarSesion = document.getElementById("btnIniciarSesion");
  let btnRegistrate = document.getElementById("btnRegistrate");
  let btnLogout = document.getElementById("btnLogout");
  if (userlogged != null || userlogged != undefined) {
    if (this.localStorage.getItem("user") == undefined || this.localStorage.getItem("user") == null) {
      getUser();
    }
    btnIniciarSesion.style.display = "none";
    btnRegistrate.style.display = "none";
    btnLogout.style.display = "initial";
    btnLogout.addEventListener("click", function (event) {
      event.preventDefault();
      Swal.fire({
        title: '¿Seguro que quieres cerrar sesión?',
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Cerrar Sesión',
        cancelButtonText: 'Cancelar'
      }).then((result) => {
        if (result.isConfirmed) {
          Swal.fire({
            position: 'center',
            icon: 'success',
            title: `¡Hasta la próxima,\n${JSON.parse(localStorage.getItem("user")).nombre}!`,
            showConfirmButton: false,
            timer: 1499
          })
          localStorage.removeItem("user-logged");
          localStorage.removeItem("user");
          setTimeout(function () {
            if (this.location.pathname.includes("pages")) {
              window.location.href = './login.html';
            } else {
              window.location.href = './pages/login.html';
            }
          }, 1500);
        }
      })
    });
  }//if
}); // window // load

function getUser() {
  let promesa = fetch("https://elotesgutierrez.onrender.com/api/usuarios/" + userlogged.slice(-1), {
    method: "GET"
  });

  promesa.then((response) => {
    response.json()
      .then(
        (data) => {
          this.localStorage.setItem("user", JSON.stringify(data));
        })
      .catch((error) => {
        console.error("Problema en el json", error);
      })
  }).catch((error) => {
    console.error(error, "Ocurrió un error en la solicitud");
  });
}