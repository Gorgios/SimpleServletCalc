### Treść
Student tworzy pierwszy projekt SpringBoot przy użyciu [Spring Initializr](https://start.spring.io)
Ustawienia:
- Projekt: _Maven Project_
- Language: _Java_
- Spring Boot: _2.1.9_
- Project Metadata: dowolny zgodnie z nazewnictwem grup i artefaktów w Mavenie
- Dependencies:
  - Spring Web
  - Spring Boot Actuator
  - Spring Boot DevTools
 
 Następnie po rozpakowaniu archiwum z generatora, w __katalogu głównym__ projektu z linii poleceń student uruchamia projekt:  
 $ mvn spring-boot:run

### Wejście
Projekt wygenerowany za pomocą Spring Initializr 

### Wyjście
Działająca aplikacja webowa (na razie bez klas własnych)

### Warunki poprawności zadania
1. Zadanie jest zaliczone gdy po uruchomieniu projektu pojawia się status `UP` po wykonaniu requestu z przeglądaki na adres:  
http://localhost:8080/actuator/health
2. Projekt znajdzie się w odpowiednim katalogu w repozytorium studenta.
3. Projekt zawiera sensowny plik `.gitignore` który eliminuje z repo pliki będące rezultatem kompilacji, logów, bibliotek itp. 
4. Student importuje projekt do swojego środowiska programistycznego np. IntelliJ 