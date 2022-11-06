# selenium2022

## Jak przygotować projekt do testów automatycznych?

1. Tworzymy nowy projekt w IntelliJ z wykorzystaniem Maven (np. maven-archetype-quickstart).
2. W IntelliJ instalujemy plugin "Cucumber for Java".
3. Dodajemy w pom.xml zależności selenium-java, selenium-chrome-driver.
4. Dodajemy w src/test/resources/drivers plik chromedriver.exe
5. Dodajemy pierwszy test sprawdzający konfigurację
6. Dodajemy zależności związane z cucumber i gherkin
7. Stworzenie pierwszego Feature (np. dla logowania)
8. Dodanie TestRunner
9. Dodanie definicji stepów związanych z feature
