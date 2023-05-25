INSERT INTO planner.utilisateurs (nom, prenom, email, password)
VALUES ('admin', 'admin', 'admin@admin.com', '1'),
('Vegas', 'Alex', 'alex@email.com', 'root'),
('Djemaoune', 'Aimen', 'aimen@email.com', 'root'),
('Malo', 'Melyse', 'melyse@email.com', 'root'),
('Test', 'Test', 'test@email.com', 'password');

INSERT INTO planner.evenements (idUser ,nom, lieux, debut, fin)
VALUES (2,'examen web', 'college de rosemont', '2023-05-24 10:00:00', '2023-05-24 12:00:00'),
(2,'fete a samy', 'parc maisonneuve', '2023-05-27 13:30:00', '2023-05-27 17:00:00'),
(3,'chalet', 'pole nord', '2023-05-28 15:30:00', '2023-06-01 17:00:00'),
(3, 'competition', 'montreal', '2023-05-25 15:30:00', '2023-05-25 17:00:00'),
(4,'mariage', 'mairie', '2023-05-20 09:45:00', '2023-05-21 20:00:00'),
(4,'disco', 'club', '2023-05-21 09:45:00', '2023-05-21 20:00:00');

INSERT INTO planner.todo (tache)
VALUES ('faire a manger'),
('formatif web'),
('payer hydroquebec'),
('remettre les cles au nouveau locataire'),
('course a pied');