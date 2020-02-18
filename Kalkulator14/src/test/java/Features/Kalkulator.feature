Feature: Dodawanie w kalkulatorze

Scenario: Dodawanie 2 + 2 = 4
Given Uzytkownik ma kalkulator
When Uzytkownik dodaje liczby 2 i 2
Then Uzytkownik otrzymuje wynik 4

@now @web
Scenario: Dodawanie 2 + 2 = 4
Given Uzytkownik ma kalkulator
When Uzytkownik wpisuje pierwsza wartosc 2
And Uzytkownik wpisuje druga wartosc 2
And Uzytkownik uruchamia dodawanie
Then Uzytkownik otrzymuje wynik 4

@web
Scenario: Dodawanie 5 + 2 = 7
Given Uzytkownik ma kalkulator
When Uzytkownik wpisuje pierwsza wartosc 5
And Uzytkownik wpisuje druga wartosc 2
And Uzytkownik uruchamia dodawanie
Then Uzytkownik otrzymuje wynik 7

@now
Scenario Outline: Dodawanie liczb
Given Uzytkownik ma kalkulator
When Uzytkownik wpisuje pierwsza wartosc <liczba1>
And Uzytkownik wpisuje druga wartosc <liczba2>
And Uzytkownik uruchamia dodawanie
Then Uzytkownik otrzymuje wynik <wynik>

Examples:
|liczba1|liczba2|wynik|
|2|2|4|
|5|6|11|
|2|-2|0|
