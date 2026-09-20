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
