setInterval(displayHello, 5500);

function displayHello() {
    document.getElementById("container").style.display = "none";
}

// Watch için
const tabLink = document.querySelectorAll(".tab-menu-link");
const tabContent = document.querySelectorAll(".tab-bar-content");

tabLink.forEach((item) => {
  item.addEventListener("click", activeTab);
});

function activeTab(item) {
  const btnTarget = item.currentTarget;
  const content = btnTarget.dataset.content;

  tabContent.forEach((item) => {
    item.classList.remove("is-active");
  });

  tabLink.forEach((item) => {
    item.classList.remove("is-active");
  });

  document.querySelector("#" + content).classList.add("is-active");
  btnTarget.classList.add("is-active");
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

$(function(){
    var numberOfSpans = $('#wrapper').children('div').length;
    var selam = $('#wrapper').children('div')[4];
    $('<h1 data-reactid=".0.4.0.0" style="width: 100%;margin-top: 64px;">Şu sıralar trend</h1>').insertAfter(selam);
    var selam2 = $('#wrapper').children('div')[9];
    $('<h1 data-reactid=".0.4.0.0" style="width: 100%;margin-top: 64px;">Bu sıralar trend değil</h1>').insertAfter(selam2);
    var selam3 = $('#wrapper').children('div')[14];
    $('<h1 data-reactid=".0.4.0.0" style="width: 100%;margin-top: 64px;">Yakında trend</h1>').insertAfter(selam3);
    var selam4 = $('#wrapper').children('div')[19];
    $('<h1 data-reactid=".0.4.0.0" style="width: 100%;margin-top: 64px;">Çok yakında trend değil</h1>').insertAfter(selam4);
})();