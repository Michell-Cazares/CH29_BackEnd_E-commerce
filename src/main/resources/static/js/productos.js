let btnCrearProducto = document.getElementById("btnCrearProducto");
let listaProductos = document.getElementById("listaProductos");

window.addEventListener("load", function (event) {
    event.preventDefault();
    if (isAdmin()) {
        btnCrearProducto.style.display = "initial";
    } else {
        btnCrearProducto.style.display = "none";
    }
});

function isAdmin() {
    let user = JSON.parse(this.localStorage.getItem("user"));
    if (user != null) {
        if (user.userType == "admin") {
            return true;
        } else {
            return false;
        }
    }
}

function getData() {
    let promesa = fetch("https://elotesgutierrez.onrender.com/api/productos/", {
        method: "GET"
    });

    promesa.then((response) => {
        response.json()
            .then(
                (data) => {
                    addItem(data);
                })
            .catch((error) => {
                console.error("Problema en el json", error);
            })
    }).catch((error) => {
        console.error(error, "Ocurrió un error en la solicitud");
    });

}//get Data

getData();
//FUNCIÓN PARA AÑADIR UN PRODUCTO CON CARD A LISTA PRODUCTOS
function addItem(data) {
    data.forEach(producto => {
        listaProductos.insertAdjacentHTML("beforeend", `            
        <div class="col-12 col-md-6 col-lg-4 mb-3">
            <div class="card-box card h-90">
                <img src="${producto.imagen}" class="card-img-top" alt="Foto elote">
                <div class="card-body">
                    <h5 class="card-title">${producto.nombre}</h5>
                    <p class= "card-text"> ${producto.descripcion} </p>
                    <p class="text-center"><strong>$${producto.precio}</strong></p>
                    <!-- BOTÓN -->
                    <div class="row">
                        <div class="col">
                            <div style="text-align: center">
                                <button id="btnAgregar" class="btn btn-lg btn-block"
                                    type="submit"><strong>Agregar</strong></button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>`);
    }
    );
}