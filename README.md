# Lekce 3 – kartička osoby

Vytvoříme webovou stránku, která bude zobrazovat údaje o osobě – jméno, příjmení, datum narození, věk a adresu. Údaje pro zobrazení budeme načítat z modelu
sestávajícího ze dvou entit – `Person` (pro osobní údaje) a `Address` (pro adresu). 

1. Udělej fork zdrojového repository do svého účtu na GitHubu.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Vytvoř kontrolér – třídu `cz.czechitas.java2webapps.lekce3.controller.CardController`.
1. V kontroléru bude jedna metoda, která bude vracet `ModelAndView`. Jako view bude použito `card`. Metoda bude navázána na cestu `/`.
1. Vytvoř `view` jménem `card` – jako základ použij `index.html`z adresáře `static`.
1. Vytvoř entitu `cz.czechitas.java2webapps.lekce3.entity.Person`, která bude obsahovat jméno, příjmení, datum narození a také věk vypočtený z data narození.    
1. V kontroléru vytvoř instanci entity `Person`, zadej do ní nějaké údaje a vlož ji do modelu pod klíčem `person`.
1. Uprav `card.html` tak, aby se použily údaje o osobě z modelu.
1. Vytvoř entitu `cz.czechitas.java2webapps.lekce3.entity.Address`, která bude obsahovat ulici (s čísly domu), obec a PSČ.
1. V kontroléru vytvoř instanci entity `Address`, zadej do ní nějaké údaje a vlož ji do modelu pod klíčem `address`.
1. Uprav `card.ftlh` tak, aby se použily údaje o adrese z modelu.

## Mohlo by se hodit
* příklady kódu najdeš v projektu pod adresářem `src/test/java`
* stránka, která pomocí umělé inteligence generuje „fotografie“ neexistujících osob: [thispersondoesnotexist.com](https://thispersondoesnotexist.com/) – 
  náhodně generované obrázky je možné získat z adresy [https://thispersondoesnotexist.com/image](https://thispersondoesnotexist.com/image)
