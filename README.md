# Filmproductie
Filmproductie webapplicatie

## Instructies
### Frontend
- Installeer Node.js/npm
- Installeer Angular `npm install -g @angular/cli`
- Run `cd frontend && ng serve --open`
### Backend
- From the backend folder, run `mvn spring-boot:run`
- Backend is now listening on `localhost:8080`

## Applicatie
 database met films
    film bevat:
- ID
- titel
- jaar
- regisseur 
- rating 0-5 (1 cijfer na comma)

mogelijkheid om op film op te vragen op basis van:
- ID
- titel
- jaar
- regisseur

### Frontend
Kader met: 
- ID
- titel
- jaar
- regisseur
- rating 0-5 (1 cijfer na comma)

Inputveld: zoeken naar films

Knop: zoeken

 
### Backend
Initial load:  films toevoegen aan de database

Ontvangt GET request op localhost:8080/all
-> return volledige lijst van films
    
Ontvangt GET request met zoekstring op localhost:8080/search/{searchString}
    zoeken volgens een bepaalde volgorde (beschrijven in code)
-> Return naar frontend:
    JSONArray van film objecten.

