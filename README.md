# Projet : Application web avec Spring Boot

<p>Le TP consite a la réalisation d'une application web. Cette solution proposera un service dit API</p>
<p>Vous trouvez dercrition des dependances mise en place dans le projet</p>

## TP2

### Dépendance Web
<p>Créez une application Web, y compris RESTful, à l'aide de MVC. Utilise Apache Tomcat comme conteneur intégré par défaut</p>

### Dépendance JPA
<p>Le Spring Data JPA conserve les données dans SQL. Magasins avec l'API Java Persistence utilisant Spring Data et Hibernate</p>

### Dépendance Hibernate
<p>Autoriser la validation des beans avec le validateur d'hibernation dans une BDD</p>

### Dépendance H2
<p>Fournit une base de données en mémoire rapide qui prend en charge l'API JDBC et l'accès R2DBC, avec un faible encombrement (2 Mo). Prend en charge les modes embarqué et serveur ainsi qu'une application de console basée sur un navigateur</p>

### Dépendance DevTools
<p>Fournit des redémarrages rapides des applications, LiveReload et des configurations pour une expérience de développement améliorée</p>

### Thymeleaf
<p>Java côté serveur pour les environnements Web et autonomes. Permet au HTML d'être correctement affiché dans les navigateurs et en tant que prototypes statiques</p>

### Reponces Étape 13
<p>1) On paramétre l'url grace à l'étiquette @GetMapping d'une fonction dans un controleur</p>
<p>2) Le fichier HTML a affichier est défini au niveau du retour de la fonction implementé de étiquette @GetMapping</p>
<p>La fonction addAttribute de l'objet Model de la fonction où l'étiquette @GetMapping a été implmenté, permet de transmèttre des paramètres</p>

### Reponses Étape 17
<p>Oui, il y a eu un différence. Après avoir crée la classe "Address" , une table avec ses atributs ont été aussi crée au niveau de la base de données</p>

### Reponse Étape 18
<p>Grace aux anotation @Entity, @Id et @GeneratedValue, hibernate est en mesure de pouvoir généré une table
dans la base de données (Entity) et des différentes attribut matérialisé par ces variables membre, où certine ont
des propriétés d'unicité telque que Id</p>

### Reponse Étape 20
<p>Après avoir executer les deux requettes d'incersions, on retrouve dans la table deux enregistrements</p>

### Reponse Étape 23
<p>Permets d'implmenté les méthodes CRUD de façon automatique défini au niveau de l'interface </p>

### Reponse Étape 27
<p>Oui, il est possible de d'ajouter une navbar où les liens donnerons accès au différente pages de l'application</p>

## TP4 (Étape 6)

### 1) Faut-il une clé API pour appeler MeteoConcept ?

<p>Oui, en effet il est nessesaire d'avoir une clef API pour acceder au service car l'oganisation
qui gère le système proposer des offres onéreuse en plus d'une offre basique (gratuite) qui se trouve être 
utiliser dans ce devoir. Pour ce faire, il est nessesaire de crée un compte.</p>

### 2) Quelle URL appeler ?

<p>https://api.meteo-concept.com/api/ephemeride/1?token=[ CLEF API ]&latlng=[ LATITUDE ],[ LONGITUDE ]</p>

### 3) Quelle méthode HTTP utiliser ?

<p>La méthode HTTP qui est utiliser est GET</p>

### 4) Comment passer les paramètres d’appels ?

<p>Les paramètres sont ajoutés à l'URL. L'énumération des paramètres commance après le point d'intérogation, il sont souvent accompager d'une valeur et on retouve une sepraration matérialisé par un "&"</p>

### 5) Où est l’information dont j’ai besoin dans la réponse :

<p>Touteles informations lier a la météo sont recupéré dans l'application grace a l'API Meteo Consept</p>

#### - Pour afficher la température du lieu visé par les coordonnées GPS

<p>On va trouver l'information lier a la température dans l'objet JSONItemForecastMeteoConcept avec les methodes getTmin() et getTmax()</p>

#### - Pour afficher la prévision de météo du lieu visé par les coordonnées GPS

<p>Les prévisons sont stockers dans l'objet JSONMeteoConcept où l'on peut récupéré une collection d'objet JSONItemForecastMeteoConcept qui représente chaque jour a partir d'aujourd'hui jusqu'a 2 semaines</p>
