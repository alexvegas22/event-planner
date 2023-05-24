const texte = document.querySelector(".date");
var today = new Date;
const months = ["Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Decembre"];
let month = months[today.getMonth()];

const afficherSemaine = () => {texte.innerHTML = `Évènements du ${today.getDate()} ${month}`;};
afficherSemaine();