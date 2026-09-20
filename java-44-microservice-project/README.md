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
