<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--

-->
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/home.css" type="text/css"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200">
        <link rel="stylesheet" href="css/calendrier.css">
        <link rel="stylesheet" href="css/semaine.css">
        <script src="javascript/calendrier.js" defer></script>
        <script src="javascript/semaine.js" defer></script>

    </head>
    <body>
        <div class="home-section">
            <div class="left-bar">
                <img src="https://img.icons8.com/material-rounded/60/null/user-male-circle.png"/>
                <img src="https://img.icons8.com/material-rounded/60/null/settings.png"/>
                <img src="https://img.icons8.com/material-rounded/60/null/search.png"/>
                <img src="https://img.icons8.com/material-rounded/60/null/topic.png"/>

            </div>
            <div class="week-section">
                <div class="wrapper-semaine">
                    <header>

                        <div class="icons">
                            <span id="prev" class="material-symbols-rounded">chevron_left</span>
                            <div class="semaine-actuelle">Semaine du 26 au 1er Avril</div>
                            <span id="next" class="material-symbols-rounded">chevron_right</span>
                        </div>
                    </header>
                    <div class="planificateur">
                        <ul class = semaine >
                            <li>Dimanche</li>
                            <li>Lundi</li>
                            <li>Mardi</li>
                            <li>Mercredi</li>
                            <li>Jeudi</li>
                            <li>Vendredi</li>
                            <li>Samedi</li>
                        </ul>
                        <ul class="heures"> </ul>
                    </div>
                </div>
            </div>
            <!-- Portion calendrier*/ -->
            <div class="right-section" >
                <div class="wrapper">
                    <header>
                        <p class="current-date"></p>
                        <div class="icons">
                            <span id="prev" class="material-symbols-rounded">chevron_left</span>
                            <span id="next" class="material-symbols-rounded">chevron_right</span>
                        </div>
                    </header>
                    <div class="calendar">
                        <ul class="weeks">
                            <li>Dim</li>
                            <li>Lun</li>
                            <li>Mar</li>
                            <li>Mer</li>
                            <li>Jeu</li>
                            <li>Ven</li>
                            <li>Sam</li>
                        </ul>
                        <ul class="days"></ul>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
