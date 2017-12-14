<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Java EE Spring - Formularze

### Zadania.

#### Zadanie 1 - rozwiązywane z wykładowcą
1. Utwórz akcję wyświetlającą formularz w kontrolerze `PersonController`.
2. Dodaj widok formularza zawierający pola `login` oraz `password`, `email`.
3. Wykorzystaj w tym celu encję `Person` z poprzednich zajęć.
4. Dodaj akcję przetwarzająca formularz (akcja ma zakończyć się zapisem danych do bazy)-
 pobieraj dane za pomocą **@RequestParam**.

#### Zadanie 2 - rozwiązywane z wykładowcą

1. Zmodyfikuj formularz oraz akcję kontrolera w taki sposób aby dane bindowały się automatycznie.

-----------------------------------------------------------------------------

#### Zadanie 3

1. W projekcie `Spring01hibernate` utwórz kontroler `PersonDetailController`.
2. Utwórz formularz zawierający następujące pola:

- login
- password
- email
- firstName
- lastName
- gender (radio button)
- country (select z możliwością pojedynczego wyboru)
- notes (textarea)
- mailingList (checkbox)
- programmingSkills (select z możliwością wyboru wielu opcji)
- hobbies (grupa checkboxów)

#### Zadanie 4

1. Dla formularza z zadania 3, utwórz klasę o nazwie `PersonDTO`.
2. Utwórz metody, które przy pomocy adnotacji `@ModelAttribute` utworzą zestaw danych dla opcji:
- programmingSkills
- hobbies
- country
3. Wyświetl zestawy danych do wyboru w widoku.
4. Klasa ma posiadać takie pola aby przyjąć wszystkie dane z formularza.
5. Po zatwierdzeniu formularza wyświetl wszystkie zapisane w zbindowanym obiekcie dane.
