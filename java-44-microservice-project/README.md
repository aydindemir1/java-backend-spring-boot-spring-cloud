# java-44-microservice-project

Bu proje, referans eğitim projesindeki mikroservis mimarisini güncel Java ve Spring ekosistemiyle adım adım yeniden uygulamak için hazırlanmıştır.

## Day 1

İlk gün yalnızca mikroservis projesinin temeli ve **AuthService** oluşturulmuştur.

### Teknolojiler

- Java 21
- Spring Boot 4.1.1
- Gradle 9.7.1
- Spring Web MVC
- Spring Data JPA
- PostgreSQL
- Lombok
- MapStruct
- SpringDoc OpenAPI

### Day 1 yapısı

```text
java-44-microservice-project
├── AuthService
│   └── src/main/java/com/aydindemir
│       ├── controller
│       ├── model
│       ├── repository
│       └── service
├── build.gradle
├── dependencies.gradle
└── settings.gradle
```

AuthService varsayılan olarak **9090** portunda çalışır.

PostgreSQL bağlantısı environment variable ile değiştirilebilir:

- `AUTH_DB_URL`
- `AUTH_DB_USERNAME`
- `AUTH_DB_PASSWORD`

Day 2'de kayıt/giriş iş mantığı, DTO'lar, hata yönetimi ve JWT tabanlı authentication akışı geliştirilecektir.

## Day 2

İkinci gün AuthService'in kayıt, giriş, JWT ve merkezi hata yönetimi akışı geliştirilmiştir.

### Eklenen yapılar

- Endpoint sabitleri için `constant/EndPoint`
- Request DTO'ları: `DoRegisterRequestDto`, `DoLoginRequestDto`
- Register response DTO örnekleri
- Generic service altyapısı: `IService` ve `ServiceManager`
- `AuthServiceException`, `ErrorType`, `ErrorMessage`, `GlobalExceptionHandler`
- Auth0 `java-jwt` ile token üretme ve doğrulama
- Postman collection

### Day 2 Yapısı

```text
java-44-microservice-project
├── AuthService
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java/com/aydindemir
│       │   │   ├── AuthServiceApplication.java
│       │   │   ├── constant
│       │   │   │   └── EndPoint.java
│       │   │   ├── controller
│       │   │   │   ├── AuthController.java
│       │   │   │   └── HelloController.java
│       │   │   ├── dto
│       │   │   │   ├── request
│       │   │   │   │   ├── DoLoginRequestDto.java
│       │   │   │   │   └── DoRegisterRequestDto.java
│       │   │   │   └── response
│       │   │   │       ├── DoRegisterResponseDto.java
│       │   │   │       ├── DoRegisterResponseEmailDto.java
│       │   │   │       ├── DoRegisterResponseIdDto.java
│       │   │   │       ├── DoRegisterResponseIdUsernameEmailDto.java
│       │   │   │       ├── DoRegisterResponseUsernameDto.java
│       │   │   │       └── DoRegisterResponseUsernameEmailDto.java
│       │   │   ├── exception
│       │   │   │   ├── AuthServiceException.java
│       │   │   │   ├── ErrorMessage.java
│       │   │   │   ├── ErrorType.java
│       │   │   │   └── GlobalExceptionHandler.java
│       │   │   ├── model
│       │   │   │   ├── Auth.java
│       │   │   │   └── BaseEntity.java
│       │   │   ├── repository
│       │   │   │   └── IAuthRepository.java
│       │   │   ├── service
│       │   │   │   ├── AuthService.java
│       │   │   │   ├── IService.java
│       │   │   │   └── ServiceManager.java
│       │   │   └── utils
│       │   │       └── JwtTokenManager.java
│       │   └── resources
│       │       ├── application.properties
│       │       └── application.yml
│       └── test
├── Microservices-Project.postman_collection.json
├── docker-compose.yml
├── build.gradle
├── dependencies.gradle
├── settings.gradle
├── gradlew
└── gradlew.bat
```

### Day 2 endpointleri

- `POST /auth/register`
- `POST /auth/login`
- `GET /auth/findAll?token=...`
- `GET /auth/getMessage`

JWT ayarları environment variable ile değiştirilebilir:

- `AUTH_JWT_SECRET`
- `AUTH_JWT_ISSUER`
- `AUTH_JWT_EXPIRE_MS`

> Not: Referans eğitim akışına paralel olarak Day 2'de parola alanı doğrudan karşılaştırılmaktadır. Gerçek üretim sistemlerinde parola hash'leme ve Spring Security gibi güvenlik mekanizmaları kullanılmalıdır.

## Day 3

Üçüncü gün proje tek bir AuthService yapısından çoklu mikroservis yapısına genişletilmiştir. Referans Day 3 akışına paralel olarak **UserProfileService**, **AgentService**, **BuyerService**, **PropertyService** ve **SellerService** eklenmiştir.

### Day 3'te eklenenler

- Spring Cloud OpenFeign ile servisler arası senkron HTTP iletişimi
- `AuthService -> UserProfileService` kayıt akışı
- Auth tarafında `IUserProfileManager` Feign client
- Auth tarafında MapStruct tabanlı `IAuthMapper`
- `UserProfileService` için controller, DTO, entity, repository, service ve mapper katmanları
- UserProfileService için ayrı PostgreSQL veritabanı
- Agent, Buyer, Property ve Seller servisleri için temel Spring Boot mikroservis iskeletleri
- Servisler için ayrı portlar ve Postman istekleri

### Servisler ve portlar

| Servis | Port | Açıklama |
|---|---:|---|
| AuthService | 9090 | Kayıt, giriş ve JWT |
| UserProfileService | 9091 | Kullanıcı profil verisi |
| AgentService | 9092 | Day 3 temel servis iskeleti |
| BuyerService | 9093 | Day 3 temel servis iskeleti |
| PropertyService | 9094 | Day 3 temel servis iskeleti |
| SellerService | 9095 | Day 3 temel servis iskeleti |

### Auth -> UserProfile akışı

```text
POST /auth/register
       |
       v
   AuthService
       |
       |  Spring Cloud OpenFeign
       v
POST /user/save
       |
       v
UserProfileService
       |
       v
micro_user_profile_service_db
```

Auth kaydı oluşturulduktan sonra `authId`, `username` ve `email` bilgileri Feign üzerinden UserProfileService'e gönderilir.

UserProfileService adresi environment variable ile değiştirilebilir:

- `USER_PROFILE_SERVICE_URL`

UserProfile PostgreSQL bağlantısı:

- `USER_PROFILE_DB_URL`
- `USER_PROFILE_DB_USERNAME`
- `USER_PROFILE_DB_PASSWORD`

### Day 3 Yapısı

```text
java-44-microservice-project
├── AuthService
│   └── src/main/java/com/aydindemir
│       ├── dto/request
│       │   └── UserProfileSaveRequestDto.java
│       ├── manager
│       │   └── IUserProfileManager.java
│       └── mapper
│           └── IAuthMapper.java
├── UserProfileService
│   ├── build.gradle
│   └── src/main
│       ├── java/com/aydindemir
│       │   ├── UserProfileServiceApplication.java
│       │   ├── constant
│       │   ├── controller
│       │   ├── dto/request
│       │   ├── exception
│       │   ├── mapper
│       │   ├── model
│       │   ├── repository
│       │   └── service
│       └── resources/application.yml
├── AgentService
├── BuyerService
├── PropertyService
├── SellerService
├── Microservices-Project.postman_collection.json
├── docker-compose.yml
├── build.gradle
├── dependencies.gradle
└── settings.gradle
```

### Docker

Day 3 ile ikinci PostgreSQL container'ı eklenmiştir:

- Auth DB: `localhost:5433/micro_auth_service_db`
- UserProfile DB: `localhost:5434/micro_user_profile_service_db`

```bash
docker compose up -d
```

> Day 3 kapsamında Eureka, Config Server ve API Gateway eklenmemiştir. Bu bileşenler sonraki günlerin kapsamındadır.


## Day 4

Dördüncü gün merkezi konfigürasyon yönetimi için **Spring Cloud Config** eklenmiştir. Day 1-3 servisleri korunmuş, servislerin çalışma ayarları Config Server üzerinden merkezi olarak yönetilecek hale getirilmiştir.

### Eklenen modüller

- `ConfigServerLocal` — native/classpath tabanlı Config Server, port `8888`
- `ConfigServerRemote` — Git tabanlı Config Server, port `8889`

### Local Config Server

`ConfigServerLocal`, `native` profile ile kendi classpath'indeki `config-repo` klasöründen servis konfigürasyonlarını okur.

```text
ConfigServerLocal :8888
        |
        +-- auth-service.yml
        +-- auth-service-dev.yml
        +-- auth-service-test.yml
        +-- user-profile-service.yml
        +-- agent-service.yml
        +-- buyer-service.yml
        +-- property-service.yml
        +-- seller-service.yml
```

Örnek Config Server sorguları:

```text
http://localhost:8888/auth-service/default
http://localhost:8888/auth-service/dev
http://localhost:8888/user-profile-service/default
http://localhost:8888/agent-service/default
```

### Config Client

Altı iş servisi artık yalnızca kendi application adını ve Config Server adresini lokal `application.yml` dosyasında tutar:

```yaml
spring:
  application:
    name: auth-service
  config:
    import: "configserver:"
  cloud:
    config:
      uri: ${CONFIG_SERVER_URL:http://localhost:8888}
```

Port, datasource, JPA, Swagger, JWT ve servis URL ayarları merkezi config repository'ye taşınmıştır.

### Remote Config Server

`ConfigServerRemote`, Git backend kullanır. Varsayılan olarak bu repository'nin `main` branch'indeki Day 4 config klasörünü okur.

- `CONFIG_REPO_URI` — Git repository URI
- `CONFIG_REPO_LABEL` — branch/label, varsayılan `main`

Remote Config Server portu `8889` olarak ayrılmıştır. Bir client'ı remote server ile çalıştırmak için:

```text
CONFIG_SERVER_URL=http://localhost:8889
```

kullanılabilir.

### Day 4 mimarisi

```text
                     ConfigServerLocal :8888
                       native backend
                             |
        +---------+----------+----------+---------+----------+
        |         |          |          |         |          |
       Auth   UserProfile   Agent      Buyer   Property    Seller
      :9090     :9091      :9092      :9093     :9094     :9095

                     ConfigServerRemote :8889
                         Git backend
                      (alternatif kaynak)
```

> Day 4 kapsamında Eureka, API Gateway ve load balancing henüz eklenmemiştir.
