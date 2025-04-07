
# Java Spring Boot Course 🧠💻

Ten projekt zawiera komplet materiałów edukacyjnych do nauki Spring Boot – krok po kroku, na bazie praktycznych przykładów. Każdy folder reprezentuje osobny moduł tematyczny kursu.

## 📁 Struktura projektu

```
java-spring-boot-course-main/
│
├── 01-spring-boot-overview            # Wprowadzenie do Spring Boot
├── 02-spring-boot-spring-core         # Core Spring – Beans, DI, konfiguracja
├── 03-spring-boot-hibernate-jpa-crud  # Hibernate + JPA + operacje CRUD
├── 04-spring-boot-rest-crud           # Tworzenie REST API z CRUD
├── 05-spring-boot-rest-security       # REST + bezpieczeństwo (Spring Security)
```

## 🛠 Technologie

- Java 17+
- Spring Boot
- Spring Core (DI, konfiguracja)
- Spring Data JPA + Hibernate
- Spring Web (REST)
- Spring Security
- Maven
- IntelliJ IDEA (rekomendowane)

## 🚀 Jak uruchomić

1. Sklonuj repozytorium (albo rozpakuj ZIP):
   ```bash
   git clone https://github.com/twoj-repo/java-spring-boot-course.git
   cd java-spring-boot-course
   ```

2. Przejdź do interesującego Cię modułu:
   ```bash
   cd 03-spring-boot-hibernate-jpa-crud
   ```

3. Uruchom aplikację:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Otwórz w przeglądarce:
   ```
   http://localhost:8080
   ```

## 🧪 Przykładowe komendy Maven

- Budowanie projektu:
  ```bash
  ./mvnw clean package
  ```

- Testy:
  ```bash
  ./mvnw test
  ```

## ✅ Wymagania

- Java 17+
- Maven 3.8+
- (Opcjonalnie) Docker – jeśli chcesz dodać bazę danych kontenerowo

## 📌 Notatki

Każdy folder-moduł to oddzielna aplikacja Spring Boot, którą można uruchomić niezależnie. Kurs zbudowany jest progresywnie – najlepiej realizować go w kolejności folderów.

---

💡 Stworzono jako materiał do nauki Spring Boot.
