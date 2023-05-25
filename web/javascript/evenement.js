const texte = document.querySelector(".date");
var today = new Date;
const months = ["Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Decembre"];
let month = months[today.getMonth()];



$(document).ready(function(){
    $("#right-section").toggle();
  $("#add").click(function(){
      $("#add").toggle(300);
    $("#right-section").toggle(500);
  });
  
  $("#create").click(function(){
      $("#add").toggle(300);
    $("#right-section").toggle(500);
  });
  

  $("#back").click(function(){
      $("#add").toggle(300);
    $("#right-section").toggle(500);
  });
  
});