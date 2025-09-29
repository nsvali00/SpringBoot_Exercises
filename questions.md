# ❓ Spring Boot Questions & Self-Check

Ovaj dokument sadrži **pitanja za provjeru znanja** po fazama učenja Spring Boot-a.  
Možeš ih koristiti za samoprovjeru nakon što završiš određeni dio roadmap-a.

---

## 🟢 Tjedni 1–2: Osnove Spring Boot-a
1. Koja je razlika između **Spring** i **Spring Boot** frameworka?
2. Što radi anotacija `@SpringBootApplication`?
3. Koja je svrha `application.properties` ili `application.yml` fajla?
4. Koja je razlika između `@RestController` i `@Controller`?
5. Kako bi promijenio default port aplikacije?

---

## 🟢 Tjedni 3–4: Baza & CRUD
1. Što radi anotacija `@Entity` i kako označavamo primarni ključ?
2. Koja je razlika između `CrudRepository` i `JpaRepository`?
3. Kako definirati relaciju **OneToMany** između entiteta?
4. Što znači `spring.jpa.hibernate.ddl-auto=update`?
5. Kako napraviti custom query pomoću `@Query` anotacije?

---

## 🟢 Tjedni 5–6: REST & Validacija
1. Kako Spring Boot hendla greške u REST API-ju?
2. Čemu služi anotacija `@ControllerAdvice`?
3. Kako validiramo da polje ne smije biti null?
4. Koja je razlika između `ResponseEntity` i običnog vraćanja objekta iz kontrolera?
5. Kako koristiš `@Valid` u metodi kontrolera?

---

## 🟢 Tjedni 7–8: Sigurnost & JWT
1. Kako radi **Spring Security filter chain**?
2. Što je razlika između **Basic Auth** i **JWT** autentikacije?
3. Kako kreirati JWT token u Spring Boot aplikaciji?
4. Čemu služi anotacija `@PreAuthorize`?
5. Kako bi zaštitio određene endpointove da budu dostupni samo adminima?

---

## 🟢 Tjedni 9–10: Napredne funkcionalnosti
1. Koja je svrha **Spring Boot Actuator-a**?
2. Kako se definiraju različiti **profiles** (dev, test, prod)?
3. Koja je razlika između `.properties` i `.yml` konfiguracije?
4. Čemu služe anotacije `@Cacheable` i `@CacheEvict`?
5. Kada bi koristio caching u API-ju?

---

## 🟢 Tjedni 11–12: Async & Messaging
1. Koja je svrha anotacije `@Async`?
2. Koja je razlika između `Future` i `CompletableFuture`?
3. Kako Spring Boot integrira **Kafka** ili **RabbitMQ**?
4. Što je **Producer**, a što **Consumer** u messaging sistemima?
5. Kada bi koristio asinhrono izvršavanje u aplikaciji?

---

## 🟢 Tjedni 13–14: Testiranje
1. Koja je razlika između **jediničnog** i **integracijskog** testa?
2. Čemu služi anotacija `@SpringBootTest`?
3. Kako testirati REST endpoint pomoću **MockMvc**?
4. Kako bi testirao JPA repository sloj?
5. Kada i zašto koristiš **Mockito**?

---

## 🟢 Tjedni 15–16: Microservices & Deployment
1. Što je **Eureka** i čemu služi u microservices arhitekturi?
2. Kako radi **Feign Client**?
3. Koja je svrha **Config Servera**?
4. Što je **Circuit Breaker** i kada ga koristiš?
5. Kako bi spakirao i pokrenuo Spring Boot aplikaciju u **Dockeru**?

---

👨‍💻 *Odgovaraj na pitanja nakon svake faze – cilj je da razumiješ koncepte, ne samo da ih znaš napamet.*
