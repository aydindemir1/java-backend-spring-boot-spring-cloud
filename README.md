# Java Backend Geliştirme

Bu repository, **Core Java temellerinden modern Spring Boot ve Spring Cloud tabanlı backend/microservice geliştirmeye** adım adım ilerleyen uygulamalı eğitim projelerini içerir.

Çalışmalar; Java ve OOP temelleri, Collections/Stream API, concurrency, SQL/RDBMS, JDBC, JPA/Hibernate, REST API, Spring Boot, Spring Security, Redis, MongoDB, test otomasyonu, Docker ve çok servisli Spring Cloud uygulamalarına kadar genişleyen bir öğrenme yolunu takip eder. Repository aynı zamanda ileri seviye backend, dağıtık sistemler, DevOps/platform ve software architecture çalışmalarına temel oluşturacak şekilde geliştirilmektedir.

## Kullanılan Teknolojiler

* Java
* Maven
* Gradle
* SQL
* RDBMS
* JDBC
* Spring Boot
* Spring Cloud
* Spring Cloud OpenFeign
* Spring Cloud Config
* Spring Cloud Gateway
* Spring Cloud Circuit Breaker
* Resilience4j
* Spring Security
* Spring Web
* Spring Data JPA
* Hibernate
* JWT
* Flyway
* Spring Data MongoDB
* Spring Data Redis
* Spring Cache
* Redis
* Lettuce
* MySQL
* PostgreSQL
* H2 Database
* MongoDB
* Jakarta Validation
* Swagger / OpenAPI
* SpringDoc OpenAPI
* Spring Boot Actuator
* MapStruct
* Lombok
* SLF4J
* Logback
* Docker
* Docker Compose
* Docker Hub
* RedisInsight
* JUnit 5
* Mockito
* MockMvc
* AssertJ
* Testcontainers
* Gradle Multi-Project
* React
* Angular
* Vue

## Repository İçeriği

### Core Java

```text
java-01  Hello World
java-02  Değişkenler
java-03  Operatörler
java-04  Döngüler
java-05  Karar ve Kontrol Mekanizmaları
java-06  Metotlar
java-07  Diziler
java-08  Object ve Class
java-09  Composition
java-10  Encapsulation
java-11  Inheritance
java-12  Polymorphism
java-13  Polymorphism
java-14  Interface
java-15  Abstract Class ve Method
java-16  Collections
java-17  Generics
java-18  Stream API
java-19  Optional
java-20  Exception Handling
java-21  Concurrency ve Multithreading
```

### Spring Boot

`java-35-spring-boot-hello`

Spring Boot, REST API, katmanlı mimari, Spring Data JPA, Hibernate, MySQL ve Docker Compose konularını içerir.

`java-36-spring-boot-exception`

REST API exception handling, Bean Validation, Spring Profiles, PostgreSQL/MySQL, Swagger ve Actuator konularını içerir.

`java-37-mongo-crud`

Spring Boot + MongoDB CRUD REST API ile React, Angular ve Vue frontend uygulamalarını içerir.

`java-38-testing-unit-webmvc-datajpa`

JUnit 5, Mockito, `@WebMvcTest`, MockMvc, `@DataJpaTest`, H2 ve AssertJ kullanılarak Spring Boot test örneklerini içerir.

`java-39-spring-boot-logging`

SLF4J ve Logback kullanılarak log seviyeleri, console logging, file logging ve exception logging örneklerini içerir.

`java-40-spring-boot-redis`

Spring Data Redis ve Spring Cache ile Redis veri yapıları, TTL, cache-aside, Pub/Sub, Streams, transaction, distributed lock, rate limiting, idempotency, Testcontainers ve Docker tabanlı Redis/RedisInsight kullanım örneklerini içerir.

`java-41-spring-security`

Spring Security ve JWT tabanlı kimlik doğrulama/yetkilendirme projesidir. Stateless authentication, RBAC, `SecurityFilterChain`, `UserDetailsService`, BCrypt, kısa ömürlü JWT access token, refresh token rotation/revocation, logout/logout-all, PostgreSQL/MySQL, Flyway migration, OpenAPI/Swagger, global exception handling, JUnit/Mockito, MockMvc ve PostgreSQL Testcontainers entegrasyon testlerini içerir.

`java-42-hello-docker`

Spring Boot uygulamasının JAR'dan Docker image'a, image'dan container'a ve Docker Hub'a taşınması sürecini uygulamalı olarak ele alır. Dockerfile, image/container yaşam döngüsü, port mapping, Docker registry, Docker Hub ve container tabanlı deployment temellerini içerir.

`java-43-microservice-basic-demo`

Java 21 ve Spring Boot 4.1.1 ile hazırlanmış temel bir multi-module microservice demonstrasyonudur. `ServiceA`, `ServiceB` ve `ServiceC` modülleri üzerinden Gradle multi-project yapısı, bağımsız Spring Boot servisleri, ortak dependency yönetimi, ayrı servis konfigürasyonları ve microservice temel organizasyonu uygulanır.

`java-44-microservice-project`

Adım adım geliştirilen çok modüllü Spring Boot + Spring Cloud microservice projesidir. AuthService ile başlayan yapı; JWT tabanlı authentication, merkezi exception handling, PostgreSQL, Docker Compose, MapStruct ve Spring Cloud OpenFeign altyapısından sonra UserProfileService, AgentService, BuyerService, PropertyService ve SellerService ile genişletilmiştir.

Projede şu anda:

- `AuthService -> UserProfileService` senkron iletişimi için **Spring Cloud OpenFeign**,
- native/classpath ve private Git backend seçenekleriyle **Spring Cloud Config Server**,
- servis konfigürasyonlarının merkezi yönetimi için **Config Client**,
- edge routing için **Spring Cloud Gateway Server Web MVC**,
- servis arızalarında kontrollü fallback için **Spring Cloud Circuit Breaker + Resilience4j**,
- health/operasyonel endpoint'ler için **Spring Boot Actuator**

uygulanmıştır.

Service Discovery/Eureka ve sonraki Spring Cloud bileşenleri projenin ilerleyen adımlarında eklenecektir.

## Backend Mimarisi

Repository'deki temel Spring Boot projelerinde aşağıdaki katmanlı yapı ağırlıklı olarak kullanılmaktadır:

```text
Controller
   ↓
Service
   ↓
Repository
   ↓
JPA / Hibernate / Spring Data MongoDB
   ↓
Database
```

Microservice çalışmalarında bu yapı servis sınırları içinde korunurken; servisler arası iletişim, centralized configuration, API Gateway ve resilience gibi dağıtık sistem sorumlulukları Spring Cloud bileşenleriyle ayrıca ele alınmaktadır.

## Ana Konular

* Java temelleri
* Nesne yönelimli programlama
* Collections ve Generics
* Stream API
* Exception Handling
* Concurrency ve Multithreading
* SQL ve ilişkisel veritabanları
* JDBC
* REST API geliştirme
* Katmanlı mimari
* Dependency Injection
* Spring Data JPA
* Hibernate ORM
* MongoDB
* DTO ve Validation
* Global Exception Handling
* Spring Security
* Authentication ve Authorization
* JWT Access Token ve Refresh Token
* Role-Based Access Control (RBAC)
* Flyway veritabanı migration yönetimi
* OpenAPI / Swagger
* Logging (SLF4J / Logback)
* Redis ve Spring Data Redis
* Cache yönetimi ve TTL
* Redis Pub/Sub ve Streams
* Distributed Lock ve Rate Limiting
* Docker ve Docker Compose
* Multi-module Gradle projeleri
* Microservice mimarisi temelleri
* Spring Cloud OpenFeign ile servisler arası iletişim
* Spring Cloud Config ile merkezi konfigürasyon
* Native ve Git tabanlı Config Server
* API Gateway Pattern ve Spring Cloud Gateway
* Route / Predicate / Filter yapısı
* Circuit Breaker ve Fallback Pattern
* Resilience4j
* Unit Test
* Web MVC Test
* Repository Test
* Testcontainers
* Spring Security entegrasyon testleri
* Full Stack REST API entegrasyonu

## Amaç

Bu repository'nin amacı, Java'nın temel konularından başlayarak modern backend geliştirme süreçlerine adım adım ilerlemek; Spring Boot, Spring Security, Spring Cloud, veri teknolojileri, test, container ve dağıtık sistem konularını uygulamalı projelerle öğrenmektir.

Repository yalnızca örnek kod arşivi olarak değil, **temel → intermediate → advanced → senior seviye backend/platform/software architecture öğrenme yolunun yaşayan çalışma alanı** olarak geliştirilmektedir. İleri aşamalarda distributed systems, database internals, Kubernetes/platform engineering, security, observability, performance ve production-oriented architecture konularında derinleşme hedeflenmektedir.


## Gelişim Yol Haritası

Repository için hazırlanan **384 projelik Java Spring Boot + DevOps/Platform/SRE + Software Architecture master roadmap** ayrı bir dokümanda tutulmaktadır.

- ➡️ [Master Roadmap — proje ve öğrenme sırası](ROADMAP.md)
- ➡️ [Roadmap Ana Konular Envanteri — mimari, pattern, teknoloji ve mühendislik konuları](ROADMAP-TOPICS.md)

Roadmap; mevcut temel projeleri gereksiz yere tekrar etmek yerine, bunların **internals, production failure, HA, performance, security, observability, operations ve architecture trade-off** seviyesindeki ileri devamlarına odaklanır.
