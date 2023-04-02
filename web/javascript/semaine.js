const semaineCourante = document.querySelector(".semaine-actuelle"),
    grilleDeJours = document.querySelector(".heures")
var curr = new Date; // get current date
var first = curr.getDate() - curr.getDay(); // First day is the day of the month - the day of the week
var last = first + 6; // last day is the first day + 6

var firstday = new Date(curr.setDate(first));
var lastday = new Date(curr.setDate(last));
const afficherSemaine = () => {
    let grille = "";
    for (let heure = 6; heure<24;heure++){
        for (let jour = 1; jour<8;jour++){
            grille += `<li class="rectangle"> ${heure}:00</li>`;
        }
    }
    semaineCourante.innerHTML = `Semaine du ${first} au ${last}`;
    grilleDeJours.innerHTML = grille;
}
afficherSemaine()