<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
  <link rel="stylesheet" href="css/semaine.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200">

  <script src="javascript/semaine.js" defer></script>
</head>
<body>
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
</body>
</html>
