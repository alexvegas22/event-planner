document.getElementById("recherche").addEventListener('click', function (event) {
    if (event.target && event.target.matches("input[type='radio']")) {
        let str = "Rechercher "+document.querySelector('input[name="recherche"]:checked').value;
        document.getElementsByName('barreDeRecherche')[0].placeholder=str;
    }
});