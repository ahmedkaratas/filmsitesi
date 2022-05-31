setInterval(displayHello, 5500);

function displayHello() {
    document.getElementById("container").style.display = "none";
}

function turcoMenuAc() {
    if (document.getElementById("turcomenu").style.display == "none") {
        document.getElementById("turcomenu").style.display = "block";
        document.getElementById("turcohello").style.display = "none";
        
    } else {
        document.getElementById("turcomenu").style.display = "none";
        document.getElementById("turcohello").style.display = "block";
    }
}

var ebModal = document.getElementById('KVKKModal');
var ebBtn = document.getElementById("KVKKChart");
var ebSpan = document.getElementsByClassName("e1")[0];
ebBtn.onclick = function () {
    ebModal.style.display = "flex";
    document.body.style.overflow = 'hidden';
}
ebSpan.onclick = function () {
    ebModal.style.display = "none";
    document.body.style.overflow = 'inherit';
}
window.onclick = function (event) {
    if (event.target == ebModal) {
        ebModal.style.display = "none";
        document.body.style.overflow = 'inherit';
    }
}

var eb2Modal = document.getElementById('GizlilikModal');
var eb2Btn = document.getElementById("GizlilikChart");
var eb2Span = document.getElementsByClassName("e2")[0];
eb2Btn.onclick = function () {
    eb2Modal.style.display = "flex";
    document.body.style.overflow = 'hidden';
}
eb2Span.onclick = function () {
    eb2Modal.style.display = "none";
     document.body.style.overflow = 'inherit';
}
window.onclick = function (event) {
    if (event.target == eb2Modal) {
        eb2Modal.style.display = "none";
         document.body.style.overflow = 'inherit';
    }
}

var eb3Modal = document.getElementById('KosullarModal');
var eb3Btn = document.getElementById("KosullarChart");
var eb3Span = document.getElementsByClassName("e3")[0];
eb3Btn.onclick = function () {
    eb3Modal.style.display = "flex";
    document.body.style.overflow = 'hidden';
}
eb3Span.onclick = function () {
    eb3Modal.style.display = "none";
     document.body.style.overflow = 'inherit';
}
window.onclick = function (event) {
    if (event.target == eb3Modal) {
        eb3Modal.style.display = "none";
         document.body.style.overflow = 'inherit';
    }
}

var eb4Modal = document.getElementById('HakkimizdaModal');
var eb4Btn = document.getElementById("HakkimizdaChart");
var eb4Span = document.getElementsByClassName("e4")[0];
eb4Btn.onclick = function () {
    eb4Modal.style.display = "flex";
    document.body.style.overflow = 'hidden';
}
eb4Span.onclick = function () {
    eb4Modal.style.display = "none";
     document.body.style.overflow = 'inherit';
}
window.onclick = function (event) {
    if (event.target == eb4Modal) {
        eb4Modal.style.display = "none";
         document.body.style.overflow = 'inherit';
    }
}


var gallery = $("#wrapper");
var contents = gallery.find("td, th").contents().detach();
gallery.find("table").remove();
gallery.append(contents);
