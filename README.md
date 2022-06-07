# Filmproductie
Filmproductie webapplicatie

## Frontend instructies:
	- Installeer Node.js/npm
	- Installeer Angular `npm install -g @angular/cli`
	- Run `cd frontend && ng serve --open`

Applicatie
database met films
    film bevat:
        ID
        titel
        jaar van release
        regisseur
        rating 0-5 (1 cijfer na comma)

mogelijkheid om op film op te vragen op basis van:
    ID
    titel
    jaar
    regisseur

Frontend
    kader met:
        ID
        titel
        jaar van release
        regisseur
        rating 0-5 (1 cijfer na comma)

    inputveld: zoeken naar films
    Knop: zoeken

 
Backend
    initial load
        10 films toevoegen
    
    ontvangt JSON met zoekstring:  
        zoeken volgens een bepaalde volgorde (beschrijven in code)

    return naar frontend:
        JSON lijst van film objecten.

        