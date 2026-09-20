# Java Spring Boot + DevOps Advanced Roadmap

Bu roadmap, **mimaraslan/java-2024**, **mimaraslan/java-se-course** ve **mimaraslan/java-se-edu** repository'lerinin konu kapsamı ile bu repository'de zaten uygulanmış temel çalışmalar birlikte dikkate alınarak yeniden düzenlenmiştir.

> **Başlangıç numarası: 50.** 1–49 aralığı burada tekrar listelenmez; temel eğitim/uygulama kapsamını temsil eder. Bu dosya özellikle bu üç eğitim reposunda bulunmayan veya onların belirgin biçimde ötesine geçen **Advanced → Senior → Staff → Principal** konulara odaklanır.

## Kapsam Kabulü: 1–49

Aşağıdaki başlıklar temel eğitim kapsamı kabul edilir ve aynı derinlikte yeniden proje üretilmez:

- Core Java, OOP, Collections, Generics, Stream API, Optional, Exception Handling ve temel concurrency
- RDBMS / SQL temelleri, JDBC, JPA / Hibernate, ilişkiler, HQL ve temel ORM kullanımı
- Spring Boot, DI / IoC, MVC, katmanlı mimari, CRUD, REST API, Spring Data JPA ve MongoDB CRUD
- Temel unit testing
- Spring Security / JWT tabanlı temel authentication ve authorization
- Docker image/container/Dockerfile/DockerHub ve temel container kullanımı
- Microservices'e giriş ve çok servisli Spring Boot uygulaması
- Spring Cloud OpenFeign, Config Server, API Gateway, Eureka / Service Discovery
- Temel Circuit Breaker / Resilience4j kullanımı
- Zipkin/Sleuth tabanlı temel distributed tracing
- RabbitMQ ile temel producer/consumer mesajlaşması
- Kafka, Saga ve CQRS'nin eğitim kapsamındaki giriş seviyesi
- Kubernetes'te temel Pod / Deployment / Service ve Minikube kullanımı
- Jenkins ile temel CI/CD pipeline

### Önemli Kural

Bir konu yukarıdaki eğitimlerde görülmüş olsa bile roadmap'te tekrar bulunabilir; ancak yalnızca kapsamı **internals, production failure, HA, performance, security, observability, operations veya architecture trade-off** seviyesine çıkıyorsa.

Örnek:

```text
Docker öğrendim
→ Docker networking / cgroups / PID 1 / BuildKit / runtime security

Hibernate öğrendim
→ Persistence Context / dirty checking / N+1 / batching / locking / production performance

Spring Cloud Gateway öğrendim
→ Gateway'in kendisini tekrar öğrenmek yok; resilience, failure domains, contract evolution ve production operasyonları var.

Kubernetes Pod/Deployment/Service öğrendim
→ scheduler, etcd, reconciliation, CNI/CSI, admission, operator, upgrade, backup, multi-cluster var.
```

## Çalışma Standardı

Her proje mümkün olduğunca şu döngüyle ilerler:

**Problem → Kısa teori → Uygulama → Test → Failure scenario → Ölçüm/debug → Trade-off → README → Commit → Teknik kontrol**

- **Lab:** tek mekanizmayı izole şekilde öğrenir.
- **Integration:** birden fazla bileşeni gerçekçi senaryoda birleştirir.
- **Failure Lab:** sistemi bilerek bozar, gözlemler, teşhis eder ve düzeltir.
- **Comparison:** alternatifleri ölçer ve ADR/decision matrix üretir.
- **Capstone:** birden fazla konuyu production-benzeri uçtan uca sistemde birleştirir.

## Eğitim Kaynakları

- Ana eğitim akışı: https://github.com/mimaraslan/java-2024
- Microservices / Spring Cloud / Docker / Kubernetes devamı: https://github.com/mimaraslan/java-se-course
- Aynı eğitim ailesinin daha geniş referans reposu: https://github.com/mimaraslan/java-se-edu

Bu üç repository ayrı ayrı üç kez tamamlanmış eğitim olarak sayılmaz. Ama konu kapsamları birlikte değerlendirilir; aynı konunun aynı seviyedeki tekrarı bu roadmap'e yeniden eklenmez.

---

## 01 - Advanced Java JVM Build Engineering

**Proje aralığı:** 50–69

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 50 | `java-advanced-collections-internals` | Java Backend | Advanced | Lab | 1–49 eğitim temeli |
| 51 | `java-concurrency-synchronization-jmm` | Java Backend | Advanced | Lab | 1–49 eğitim temeli |
| 52 | `java-concurrency-locks-atomics` | Java Backend | Advanced | Lab | 51 |
| 53 | `java-executors-threadpools-futures` | Java Backend | Advanced | Lab | 52 |
| 54 | `java-completablefuture` | Java Backend | Advanced | Lab | 53 |
| 55 | `java-virtual-threads` | Java Backend | Advanced | Lab | 53 |
| 56 | `java-jvm-memory-classloading` | Java Backend | Advanced | Lab | 1–49 eğitim temeli |
| 57 | `java-garbage-collection` | Java Backend | Advanced | Lab | 56 |
| 58 | `java-jfr-jmc-profiling` | Java Backend | Advanced | Lab | 56,57 |
| 59 | `java-jmh-benchmarking` | Java Backend | Advanced | Lab | 56 |
| 60 | `java-records-sealed-pattern-matching` | Java Backend | Advanced | Lab | 1–49 eğitim temeli |
| 61 | `java-reflection-annotations-proxies` | Java Backend | Advanced | Lab | 1–49 eğitim temeli |
| 62 | `java-nio-large-file-processing` | Java Backend | Advanced | Lab | 1–49 eğitim temeli |
| 63 | `java-threadlocal-context-propagation` | Java Backend | Advanced | Lab | 51 |
| 64 | `java-memory-leak-lab` | Java Backend | Advanced | Failure Lab | 58 |
| 65 | `java-maven-lifecycle-dependencies` | Build | Intermediate | Lab | 1–49 eğitim temeli |
| 66 | `java-maven-bom-dependency-management` | Build | Advanced | Lab | 65 |
| 67 | `java-maven-multi-module` | Build | Advanced | Integration | 66 |
| 68 | `java-gradle-deep-dive` | Build | Intermediate | Lab | 1–49 eğitim temeli |
| 69 | `java-reproducible-builds` | Build | Advanced | Lab | 66 |

## 02 - Advanced SQL PostgreSQL Persistence

**Proje aralığı:** 70–91

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 70 | `sql-query-plans-explain-analyze` | Data | Advanced | Lab | 1–49 eğitim temeli |
| 71 | `sql-indexing-advanced` | Data | Advanced | Lab | 70 |
| 72 | `database-transactions-isolation` | Data | Advanced | Failure Lab | 1–49 eğitim temeli |
| 73 | `database-locking-deadlocks` | Data | Advanced | Failure Lab | 72 |
| 74 | `postgresql-advanced-sql` | Data | Advanced | Lab | 1–49 eğitim temeli |
| 75 | `postgresql-jsonb-gin` | Data | Advanced | Lab | 74 |
| 76 | `postgresql-mvcc` | Data | Advanced | Lab | 72 |
| 77 | `postgresql-partitioning` | Data | Advanced | Lab | 74,71 |
| 78 | `postgresql-query-planner-statistics` | Data | Advanced | Lab | 70 |
| 79 | `postgresql-vacuum-autovacuum` | Data | Advanced | Lab | 76 |
| 80 | `jdbc-connection-pooling-hikari` | Java Backend | Advanced | Integration | 1–49 eğitim temeli |
| 81 | `jdbc-batching-performance` | Java Backend | Advanced | Lab | 80 |
| 82 | `jpa-persistence-context-internals` | Java Backend | Advanced | Lab | 1–49 eğitim temeli |
| 83 | `hibernate-dirty-checking-flush` | Java Backend | Advanced | Lab | 82 |
| 84 | `hibernate-fetching-n-plus-one` | Java Backend | Advanced | Failure Lab | 83 |
| 85 | `hibernate-locking` | Java Backend | Advanced | Failure Lab | 72,82 |
| 86 | `hibernate-batching-bulk-operations` | Java Backend | Advanced | Lab | 81,83 |
| 87 | `spring-data-jdbc` | Spring | Advanced | Lab | 1–49 eğitim temeli |
| 88 | `jooq-fundamentals` | Java Backend | Advanced | Lab | 74 |
| 89 | `jooq-advanced-querying` | Java Backend | Advanced | Lab | 88 |
| 90 | `jpa-vs-jooq-vs-jdbc` | Architecture | Senior | Comparison | 82,89,80 |
| 91 | `orm-production-performance` | Java Backend | Senior | Integration | 84,85,86 |

## 03 - Spring Core Boot MVC API

**Proje aralığı:** 92–116

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 92 | `spring-ioc-di-beanfactory-applicationcontext` | Spring | Advanced | Lab | 1–49 eğitim temeli |
| 93 | `spring-bean-lifecycle-scopes` | Spring | Advanced | Lab | 92 |
| 94 | `spring-beanpostprocessor` | Spring | Advanced | Lab | 93 |
| 95 | `spring-proxies-jdk-cglib` | Spring | Advanced | Lab | 61,92 |
| 96 | `spring-aop` | Spring | Advanced | Lab | 95 |
| 97 | `spring-transaction-management` | Spring | Advanced | Lab | 96,82 |
| 98 | `spring-transaction-propagation` | Spring | Advanced | Failure Lab | 97 |
| 99 | `spring-transaction-failure-lab` | Spring | Senior | Failure Lab | 98 |
| 100 | `spring-boot-autoconfiguration` | Spring | Advanced | Lab | 94 |
| 101 | `spring-boot-conditional-beans` | Spring | Advanced | Lab | 100 |
| 102 | `spring-configuration-properties-precedence` | Spring | Advanced | Lab | 100 |
| 103 | `spring-boot-lifecycle-graceful-shutdown` | Spring | Advanced | Failure Lab | 100 |
| 104 | `spring-mvc-request-lifecycle` | Spring | Advanced | Lab | 92 |
| 105 | `spring-filters-interceptors-argumentresolvers` | Spring | Advanced | Lab | 104 |
| 106 | `spring-jackson-json-processing` | Spring | Advanced | Lab | 104 |
| 107 | `spring-bean-validation-advanced` | Spring | Advanced | Lab | 1–49 eğitim temeli |
| 108 | `rest-api-design` | API | Advanced | Integration | 104,106 |
| 109 | `http-idempotency` | API | Advanced | Failure Lab | 108 |
| 110 | `api-pagination-filtering-sorting` | API | Advanced | Lab | 108 |
| 111 | `http-cache-etag-conditional-requests` | API | Advanced | Lab | 108 |
| 112 | `problem-details-rfc9457` | API | Advanced | Lab | 108 |
| 113 | `openapi-contract-first` | API | Advanced | Integration | 108 |
| 114 | `restclient-webclient-http-clients` | Spring | Advanced | Integration | 108 |
| 115 | `spring-async-scheduling-events` | Spring | Advanced | Lab | 92 |
| 116 | `spring-aot-graalvm-native` | Spring | Senior | Comparison | 100,61 |

## 04 - DB Migrations MultiTenancy Security

**Proje aralığı:** 117–135

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 117 | `flyway-deep-dive` | Data | Advanced | Lab | 1–49 eğitim temeli |
| 118 | `liquibase-deep-dive` | Data | Advanced | Lab | 1–49 eğitim temeli |
| 119 | `flyway-vs-liquibase` | Architecture | Senior | Comparison | 117,118 |
| 120 | `multitenancy-shared-schema` | Architecture | Senior | Integration | 82 |
| 121 | `multitenancy-schema-per-tenant` | Architecture | Senior | Integration | 120 |
| 122 | `multitenancy-isolation-failure-lab` | Security | Senior | Failure Lab | 120,121 |
| 123 | `oauth2-fundamentals` | Security | Advanced | Lab | 1–49 eğitim temeli |
| 124 | `openid-connect` | Security | Advanced | Lab | 123 |
| 125 | `keycloak-resource-server` | Security | Advanced | Integration | 124 |
| 126 | `keycloak-authorization-code-pkce` | Security | Advanced | Integration | 125 |
| 127 | `client-credentials-service-auth` | Security | Advanced | Integration | 125 |
| 128 | `spring-authorization-server` | Security | Senior | Lab | 123,124 |
| 129 | `service-to-service-mtls` | Security | Senior | Integration | 127 |
| 130 | `vault-secrets-management` | Security | Advanced | Integration | 1–49 eğitim temeli |
| 131 | `security-cors-csrf` | Security | Advanced | Failure Lab | 1–49 eğitim temeli |
| 132 | `security-idor-bola` | Security | Advanced | Failure Lab | 1–49 eğitim temeli |
| 133 | `security-ssrf-injection` | Security | Advanced | Failure Lab | 114 |
| 134 | `security-api-owasp-lab` | Security | Senior | Failure Lab | 131,132,133 |
| 135 | `security-audit-trail` | Security | Advanced | Integration | 1–49 eğitim temeli |

## 05 - Mongo Cache Reactive Realtime

**Proje aralığı:** 136–154

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 136 | `mongodb-document-modeling` | Data | Advanced | Lab | 1–49 eğitim temeli |
| 137 | `mongodb-indexing-performance` | Data | Advanced | Lab | 136 |
| 138 | `mongodb-aggregation-pipeline` | Data | Advanced | Lab | 136,137 |
| 139 | `mongodb-transactions-schema-evolution` | Data | Advanced | Lab | 136 |
| 140 | `caffeine-local-cache` | Data | Advanced | Lab | 1–49 eğitim temeli |
| 141 | `two-level-cache-caffeine-redis` | Data | Senior | Integration | 140 |
| 142 | `redis-sentinel-ha` | Data | Senior | Integration | 1–49 eğitim temeli |
| 143 | `redis-cluster` | Data | Senior | Integration | 1–49 eğitim temeli |
| 144 | `cache-failure-invalidation-lab` | Data | Senior | Failure Lab | 141,142,143 |
| 145 | `reactive-streams-fundamentals` | Java Backend | Advanced | Lab | 53 |
| 146 | `project-reactor` | Spring | Advanced | Lab | 145 |
| 147 | `spring-webflux` | Spring | Advanced | Integration | 146 |
| 148 | `r2dbc` | Data | Advanced | Integration | 147 |
| 149 | `mvc-vs-webflux-performance` | Architecture | Senior | Comparison | 104,147,148 |
| 150 | `spring-graphql` | API | Advanced | Integration | 108 |
| 151 | `graphql-dataloader-nplusone` | API | Advanced | Failure Lab | 150 |
| 152 | `server-sent-events` | API | Advanced | Lab | 147 |
| 153 | `websocket-stomp` | API | Advanced | Integration | 104 |
| 154 | `websocket-vs-sse-vs-polling` | Architecture | Senior | Comparison | 152,153 |

## 06 - Batch Workflow Files Enterprise Integration

**Proje aralığı:** 155–173

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 155 | `spring-batch-fundamentals` | Spring | Advanced | Integration | 1–49 eğitim temeli |
| 156 | `spring-batch-restart-recovery` | Spring | Advanced | Failure Lab | 155 |
| 157 | `spring-batch-parallel-processing` | Spring | Advanced | Integration | 155,53 |
| 158 | `quartz-scheduler` | Spring | Advanced | Integration | 1–49 eğitim temeli |
| 159 | `distributed-scheduler-shedlock` | Distributed Systems | Advanced | Integration | 158 |
| 160 | `distributed-leader-election` | Distributed Systems | Senior | Lab | 159 |
| 161 | `workflow-engine-fundamentals` | Architecture | Advanced | Integration | 108 |
| 162 | `workflow-long-running-business-process` | Architecture | Senior | Integration | 161 |
| 163 | `minio-object-storage` | Storage | Advanced | Integration | 1–49 eğitim temeli |
| 164 | `presigned-url-file-security` | Storage | Advanced | Lab | 163 |
| 165 | `large-file-streaming` | Java Backend | Advanced | Failure Lab | 62,163 |
| 166 | `csv-excel-import-export` | Java Backend | Advanced | Integration | 62 |
| 167 | `large-dataset-export` | Java Backend | Senior | Failure Lab | 166,81 |
| 168 | `soap-spring-ws` | Integration | Advanced | Integration | 1–49 eğitim temeli |
| 169 | `soap-to-rest-adapter` | Integration | Senior | Integration | 168,108 |
| 170 | `enterprise-integration-patterns` | Architecture | Senior | Lab | 108,115 |
| 171 | `spring-integration-or-camel` | Integration | Senior | Integration | 170 |
| 172 | `notification-service` | Java Backend | Advanced | Integration | 115,108 |
| 173 | `document-report-generation` | Java Backend | Advanced | Integration | 163 |

## 07 - Advanced Testing

**Proje aralığı:** 174–183

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 174 | `testcontainers-multi-service` | Testing | Advanced | Integration | 1–49 eğitim temeli |
| 175 | `wiremock-external-api-testing` | Testing | Advanced | Failure Lab | 114 |
| 176 | `rest-assured-api-testing` | Testing | Advanced | Lab | 108 |
| 177 | `awaitility-async-testing` | Testing | Advanced | Lab | 115 |
| 178 | `contract-testing` | Testing | Advanced | Integration | 113 |
| 179 | `api-backward-compatibility-testing` | Testing | Senior | Failure Lab | 178 |
| 180 | `mutation-testing` | Testing | Advanced | Lab | 1–49 eğitim temeli |
| 181 | `property-based-testing-jqwik` | Testing | Advanced | Lab | 1–49 eğitim temeli |
| 182 | `archunit-architecture-tests` | Testing | Senior | Lab | 67,92 |
| 183 | `toxiproxy-network-failure-testing` | Testing | Senior | Failure Lab | 175 |

## 08 - Advanced Docker Container Runtime

**Proje aralığı:** 184–197

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 184 | `docker-layers-build-cache` | DevOps | Advanced | Lab | 1–49 eğitim temeli |
| 185 | `docker-multistage-buildkit` | DevOps | Advanced | Lab | 184 |
| 186 | `docker-networking-dns` | DevOps | Advanced | Lab | 1–49 eğitim temeli |
| 187 | `docker-volumes-storage` | DevOps | Advanced | Lab | 1–49 eğitim temeli |
| 188 | `docker-compose-advanced` | DevOps | Advanced | Integration | 186,187 |
| 189 | `docker-healthchecks-dependencies` | DevOps | Advanced | Failure Lab | 188 |
| 190 | `docker-jvm-resource-limits` | DevOps | Advanced | Failure Lab | 56 |
| 191 | `docker-security-nonroot-distroless` | DevOps | Senior | Lab | 1–49 eğitim temeli |
| 192 | `docker-linux-namespaces-cgroups` | DevOps | Senior | Lab | 1–49 eğitim temeli |
| 193 | `docker-oci-containerd-runtime` | DevOps | Senior | Lab | 192 |
| 194 | `docker-overlayfs-image-layers` | DevOps | Senior | Lab | 184 |
| 195 | `docker-pid1-signals-zombies` | DevOps | Senior | Failure Lab | 1–49 eğitim temeli |
| 196 | `docker-buildx-multi-platform` | DevOps | Senior | Lab | 185 |
| 197 | `docker-rootless-capabilities-seccomp` | DevSecOps | Senior | Lab | 191,192 |

## 09 - Messaging RabbitMQ Kafka CDC

**Proje aralığı:** 198–213

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 198 | `rabbitmq-routing-exchanges` | Messaging | Advanced | Lab | 170 |
| 199 | `rabbitmq-ack-retry-dlq` | Messaging | Advanced | Failure Lab | 170 |
| 200 | `rabbitmq-publisher-confirms` | Messaging | Advanced | Failure Lab | 170 |
| 201 | `rabbitmq-competing-consumers-prefetch` | Messaging | Advanced | Lab | 170 |
| 202 | `rabbitmq-quorum-ha` | Messaging | Senior | Integration | 199,200,201 |
| 203 | `kafka-partitions-ordering` | Messaging | Advanced | Lab | 170 |
| 204 | `kafka-consumer-groups-rebalancing` | Messaging | Advanced | Failure Lab | 170 |
| 205 | `kafka-retry-dlt-idempotency` | Messaging | Advanced | Failure Lab | 170,109 |
| 206 | `kafka-transactions-delivery-semantics` | Messaging | Senior | Lab | 170 |
| 207 | `kafka-schema-registry` | Messaging | Advanced | Integration | 170 |
| 208 | `kafka-schema-evolution` | Messaging | Senior | Failure Lab | 207 |
| 209 | `kafka-streams` | Messaging | Senior | Integration | 170 |
| 210 | `kafka-consumer-lag-monitoring` | Observability | Senior | Integration | 204 |
| 211 | `kafka-connect` | Messaging | Senior | Integration | 170 |
| 212 | `debezium-postgresql-cdc` | Messaging | Senior | Integration | 211,76 |
| 213 | `cdc-event-driven-data-pipeline` | Distributed Systems | Senior | Capstone | 212 |

## 10 - Distributed Systems Resilience

**Proje aralığı:** 214–230

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 214 | `distributed-systems-fundamentals` | Distributed Systems | Advanced | Lab | 170 |
| 215 | `cap-pacelc-consistency` | Distributed Systems | Senior | Lab | 214 |
| 216 | `replication-partitioning-sharding` | Distributed Systems | Senior | Lab | 214,215 |
| 217 | `timeout-retry-backoff-jitter` | Distributed Systems | Advanced | Failure Lab | 114,214 |
| 218 | `bulkhead-rate-limit-load-shedding` | Distributed Systems | Senior | Failure Lab | 217 |
| 219 | `backpressure-overload-control` | Distributed Systems | Senior | Failure Lab | 218,145 |
| 220 | `distributed-rate-limiter` | Distributed Systems | Senior | Integration | 214 |
| 221 | `distributed-locking-comparison` | Distributed Systems | Senior | Comparison | 160,214 |
| 222 | `transactional-outbox-inbox` | Architecture | Senior | Integration | 214,170 |
| 223 | `eventual-consistency-failure-lab` | Distributed Systems | Senior | Failure Lab | 214,170,222 |
| 224 | `database-primary-replica` | Data | Senior | Integration | 76,214 |
| 225 | `spring-read-write-datasource-routing` | Spring | Senior | Integration | 224 |
| 226 | `replication-lag-consistency-lab` | Distributed Systems | Senior | Failure Lab | 224,225 |
| 227 | `connection-pool-exhaustion-lab` | Java Backend | Senior | Failure Lab | 80,217 |
| 228 | `distributed-id-generation` | Distributed Systems | Senior | Comparison | 214 |
| 229 | `feature-flags` | Architecture | Senior | Integration | 108 |
| 230 | `feature-flag-cleanup` | Architecture | Senior | Lab | 229 |

## 11 - Architecture DDD Modulith Microservices

**Proje aralığı:** 231–248

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 231 | `clean-architecture` | Architecture | Advanced | Integration | 108 |
| 232 | `hexagonal-architecture` | Architecture | Advanced | Integration | 231 |
| 233 | `onion-architecture` | Architecture | Advanced | Integration | 231 |
| 234 | `architecture-style-comparison` | Architecture | Senior | Comparison | 231,232,233 |
| 235 | `ddd-tactical-patterns` | Architecture | Advanced | Integration | 231 |
| 236 | `ddd-aggregates-invariants` | Architecture | Senior | Failure Lab | 235 |
| 237 | `ddd-strategic-design` | Architecture | Senior | Lab | 235 |
| 238 | `bounded-context-context-map` | Architecture | Senior | Lab | 237 |
| 239 | `modular-monolith` | Architecture | Senior | Capstone | 238 |
| 240 | `spring-modulith` | Spring | Senior | Integration | 239 |
| 241 | `spring-modulith-events-testing` | Spring | Senior | Integration | 240 |
| 242 | `modular-monolith-boundary-enforcement` | Testing | Senior | Integration | 240,182 |
| 243 | `microservices-decomposition` | Architecture | Senior | Lab | 238,239 |
| 244 | `microservices-grpc` | Architecture | Senior | Integration | 243 |
| 245 | `grpc-streaming-deadlines` | API | Senior | Integration | 244 |
| 246 | `microservices-data-consistency` | Architecture | Senior | Capstone | 243,214,170,222 |
| 247 | `spring-cloud-resilience` | Spring Cloud | Senior | Integration | 243,217 |
| 248 | `distributed-context-propagation` | Observability | Senior | Integration | 243,114,170 |

## 12 - Search Observability

**Proje aralığı:** 249–260

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 249 | `elasticsearch-fundamentals` | Search | Advanced | Integration | 1–49 eğitim temeli |
| 250 | `elasticsearch-advanced-search` | Search | Senior | Integration | 249 |
| 251 | `opensearch-fundamentals` | Search | Advanced | Integration | 249 |
| 252 | `event-driven-search-indexing` | Search | Senior | Capstone | 213,249 |
| 253 | `prometheus-micrometer` | Observability | Advanced | Integration | 1–49 eğitim temeli |
| 254 | `grafana-dashboards` | Observability | Advanced | Integration | 253 |
| 255 | `prometheus-recording-rules-alertmanager` | Observability | Senior | Integration | 254 |
| 256 | `structured-logging-loki` | Observability | Advanced | Integration | 1–49 eğitim temeli |
| 257 | `opentelemetry-tracing` | Observability | Advanced | Integration | 248 |
| 258 | `tempo-distributed-tracing` | Observability | Advanced | Integration | 257 |
| 259 | `metrics-logs-traces-correlation` | Observability | Senior | Capstone | 253,256,258 |
| 260 | `observability-cardinality-sampling-cost` | Observability | Senior | Failure Lab | 253,257 |

## 13 - Linux Networking Reverse Proxy

**Proje aralığı:** 261–271

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 261 | `linux-processes-files-permissions` | DevOps | Advanced | Lab | 1–49 eğitim temeli |
| 262 | `linux-systemd-resources-troubleshooting` | DevOps | Advanced | Failure Lab | 261 |
| 263 | `linux-filesystems-inodes-pagecache` | DevOps | Senior | Lab | 262 |
| 264 | `linux-kernel-syscalls-tuning` | DevOps | Senior | Lab | 263 |
| 265 | `networking-tcp-dns-http-tls` | DevOps | Advanced | Lab | 261 |
| 266 | `tls-certificates-pki-operations` | DevSecOps | Senior | Integration | 265 |
| 267 | `networking-routing-nat-firewall-tools` | DevOps | Senior | Lab | 265 |
| 268 | `nginx-reverse-proxy-load-balancing` | DevOps | Advanced | Integration | 265,267 |
| 269 | `haproxy-load-balancing` | DevOps | Senior | Integration | 268 |
| 270 | `network-failure-diagnostics` | DevOps | Senior | Failure Lab | 265,267 |
| 271 | `network-tcp-congestion-mtu` | DevOps | Senior | Failure Lab | 270 |

## 14 - Kubernetes Fundamentals Advanced Internals

**Proje aralığı:** 272–297

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 272 | `kubernetes-architecture` | Kubernetes | Advanced | Lab | 261,265,193 |
| 273 | `kubernetes-config-secrets-probes` | Kubernetes | Advanced | Integration | 272 |
| 274 | `kubernetes-resources-scheduling` | Kubernetes | Advanced | Lab | 272 |
| 275 | `kubernetes-networking-ingress` | Kubernetes | Advanced | Integration | 272,265 |
| 276 | `kubernetes-storage-statefulset` | Kubernetes | Advanced | Integration | 272 |
| 277 | `kubernetes-security-rbac-networkpolicy` | Kubernetes | Advanced | Integration | 272,275 |
| 278 | `kubernetes-autoscaling` | Kubernetes | Senior | Integration | 274,253 |
| 279 | `kubernetes-jobs-daemonsets-pdb` | Kubernetes | Advanced | Integration | 272 |
| 280 | `kubernetes-troubleshooting` | Kubernetes | Senior | Failure Lab | 273,274,275,276 |
| 281 | `kubernetes-etcd-internals` | Kubernetes | Senior | Lab | 272 |
| 282 | `kubernetes-scheduler-internals` | Kubernetes | Senior | Lab | 272,274 |
| 283 | `kubernetes-controller-reconciliation` | Kubernetes | Senior | Lab | 272 |
| 284 | `kubernetes-finalizers-ownerreferences` | Kubernetes | Senior | Lab | 283 |
| 285 | `kubernetes-cri-cni-csi` | Kubernetes | Senior | Lab | 272,275,276 |
| 286 | `kubernetes-coredns-service-discovery` | Kubernetes | Senior | Failure Lab | 275 |
| 287 | `kubernetes-kubeproxy-networking-internals` | Kubernetes | Senior | Lab | 275 |
| 288 | `kubernetes-admission-control` | Kubernetes | Senior | Lab | 277 |
| 289 | `kubernetes-crd-custom-controller` | Kubernetes | Senior | Integration | 283,288 |
| 290 | `kubernetes-operator-pattern` | Kubernetes | Senior | Integration | 289 |
| 291 | `kubernetes-gateway-api` | Kubernetes | Senior | Integration | 275 |
| 292 | `kubernetes-service-mesh` | Kubernetes | Senior | Integration | 275 |
| 293 | `service-mesh-mtls-traffic-management` | Kubernetes | Senior | Failure Lab | 292 |
| 294 | `kubernetes-cluster-upgrade` | Kubernetes | Senior | Failure Lab | 280 |
| 295 | `kubernetes-api-deprecation-migration` | Kubernetes | Senior | Failure Lab | 294 |
| 296 | `kubernetes-backup-restore-velero` | Kubernetes | Senior | Failure Lab | 276,280 |
| 297 | `kubernetes-multi-cluster-fundamentals` | Kubernetes | Senior | Lab | 294,296 |

## 15 - Helm CI CD GitOps IaC DevSecOps

**Proje aralığı:** 298–324

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 298 | `helm` | DevOps | Advanced | Integration | 272 |
| 299 | `helm-advanced-library-charts` | DevOps | Senior | Integration | 298 |
| 300 | `kustomize` | DevOps | Advanced | Integration | 272 |
| 301 | `github-actions-ci` | CI/CD | Advanced | Integration | 67 |
| 302 | `sonarqube-quality-gates` | CI/CD | Advanced | Integration | 65 |
| 303 | `nexus-artifact-repository` | DevOps | Advanced | Integration | 65 |
| 304 | `harbor-container-registry` | DevSecOps | Advanced | Integration | 184 |
| 305 | `ci-cd-artifact-promotion` | CI/CD | Senior | Integration | 301,67,303,304 |
| 306 | `argocd-gitops-fundamentals` | GitOps | Advanced | Integration | 298,300,272 |
| 307 | `argocd-helm-kustomize` | GitOps | Senior | Integration | 306 |
| 308 | `argocd-applicationset` | GitOps | Senior | Integration | 306 |
| 309 | `gitops-repository-design` | GitOps | Senior | Lab | 306 |
| 310 | `gitops-secrets-management` | GitOps | Senior | Integration | 306,130 |
| 311 | `ci-reusable-pipelines-matrix-builds` | CI/CD | Senior | Integration | 301 |
| 312 | `ci-ephemeral-preview-environments` | CI/CD | Senior | Capstone | 311,306 |
| 313 | `ci-cd-supply-chain-provenance` | DevSecOps | Senior | Integration | 305,304 |
| 314 | `infrastructure-as-code-fundamentals` | IaC | Advanced | Lab | 261,272 |
| 315 | `opentofu-terraform-fundamentals` | IaC | Advanced | Integration | 314 |
| 316 | `opentofu-state-locking-drift-import` | IaC | Senior | Failure Lab | 315 |
| 317 | `opentofu-modules-environments` | IaC | Senior | Integration | 315,316 |
| 318 | `ansible-fundamentals` | IaC | Advanced | Integration | 261 |
| 319 | `ansible-advanced-roles-vault` | IaC | Senior | Integration | 318 |
| 320 | `devsecops-sast-dependency-scanning` | DevSecOps | Advanced | Integration | 301,302 |
| 321 | `container-security-sbom-signing` | DevSecOps | Senior | Integration | 304,320 |
| 322 | `policy-as-code-opa-gatekeeper-kyverno` | DevSecOps | Senior | Integration | 288,321 |
| 323 | `secrets-vault-dynamic-credentials` | DevSecOps | Senior | Integration | 130 |
| 324 | `kubernetes-security-hardening` | DevSecOps | Senior | Capstone | 277,288,321,322 |

## 16 - SRE HA Performance Release Engineering

**Proje aralığı:** 325–343

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 325 | `sre-sli-slo-sla-error-budget` | SRE | Senior | Lab | 253 |
| 326 | `sre-red-use-golden-signals` | SRE | Senior | Lab | 325,253 |
| 327 | `sre-alerting-incident-management` | SRE | Senior | Integration | 255,325 |
| 328 | `sre-toil-oncall-escalation` | SRE | Senior | Lab | 327 |
| 329 | `sre-production-readiness-review` | SRE | Senior | Capstone | 325,327,324 |
| 330 | `high-availability-failover` | SRE | Senior | Integration | 214,272 |
| 331 | `horizontal-scaling-load-balancing` | SRE | Senior | Integration | 330,278 |
| 332 | `capacity-planning` | SRE | Senior | Lab | 253,331 |
| 333 | `finops-resource-efficiency` | Platform | Senior | Lab | 332 |
| 334 | `performance-engineering-jvm-database` | Performance | Senior | Failure Lab | 58,70,80,332 |
| 335 | `load-stress-spike-soak-testing` | Performance | Senior | Failure Lab | 334 |
| 336 | `chaos-engineering-failure-injection` | SRE | Senior | Failure Lab | 280,327,335 |
| 337 | `zero-downtime-db-migrations` | Release | Senior | Integration | 117,118,305 |
| 338 | `blue-green-deployments` | Release | Senior | Integration | 305,306 |
| 339 | `canary-deployments` | Release | Senior | Integration | 338,293 |
| 340 | `disaster-recovery-fundamentals-rpo-rto` | SRE | Senior | Integration | 296,330 |
| 341 | `postgresql-ha-pitr` | Data | Senior | Integration | 224,340 |
| 342 | `kafka-operational-ha` | Messaging | Senior | Integration | 170,340 |
| 343 | `redis-failover-recovery-drill` | Data | Senior | Integration | 142,340 |

## 17 - Advanced Architecture CQRS Event Sourcing Staff Principal

**Proje aralığı:** 344–359

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 344 | `event-driven-architecture` | Architecture | Senior | Integration | 170,243 |
| 345 | `cqrs-eventual-consistency` | Architecture | Senior | Failure Lab | 235,344,223 |
| 346 | `event-sourcing-fundamentals` | Architecture | Senior | Integration | 235,344 |
| 347 | `event-sourcing-projections-snapshots` | Architecture | Staff | Integration | 346 |
| 348 | `advanced-service-boundaries` | Architecture | Staff | Lab | 238,243 |
| 349 | `api-event-contract-evolution` | Architecture | Staff | Failure Lab | 179,208 |
| 350 | `failure-domains-blast-radius` | Architecture | Staff | Failure Lab | 218,330 |
| 351 | `architecture-quality-attributes` | Architecture | Staff | Lab | 330,325 |
| 352 | `architecture-tradeoff-analysis` | Architecture | Staff | Comparison | 234,351 |
| 353 | `adr-rfc` | Architecture | Staff | Lab | 352 |
| 354 | `c4-architecture-documentation` | Architecture | Staff | Lab | 353 |
| 355 | `evolutionary-architecture` | Architecture | Staff | Integration | 348,353 |
| 356 | `platform-engineering-golden-path-design` | Platform | Staff | Lab | 305,306,329 |
| 357 | `architecture-governance` | Architecture | Principal | Capstone | 351,353,356 |
| 358 | `platform-engineering-golden-path-capstone` | Platform | Staff | Capstone | 356,307,324 |
| 359 | `backstage-idp-local-lab` | Platform | Staff | Integration | 358 |

## 18 - Capstones Failure Engineering Principal

**Proje aralığı:** 360–378

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 360 | `modular-monolith-business-capstone` | Architecture | Senior | Capstone | 239,241,242 |
| 361 | `microservices-business-capstone` | Architecture | Senior | Capstone | 243,247,248 |
| 362 | `modular-monolith-vs-microservices` | Architecture | Staff | Comparison | 360,361 |
| 363 | `rest-vs-grpc-vs-messaging` | Architecture | Staff | Comparison | 243,114,245,170 |
| 364 | `kafka-vs-rabbitmq` | Messaging | Staff | Comparison | 202,213 |
| 365 | `polyglot-persistence-capstone` | Data | Staff | Capstone | 91,139,143,252 |
| 366 | `saga-outbox-failure-lab` | Distributed Systems | Staff | Failure Lab | 214,170,222,223 |
| 367 | `duplicate-delivery-idempotency-lab` | Distributed Systems | Staff | Failure Lab | 109,199,205 |
| 368 | `cache-failure-lab` | Data | Staff | Failure Lab | 144 |
| 369 | `database-concurrency-failure-lab` | Data | Staff | Failure Lab | 72,73,85 |
| 370 | `cascading-failure-lab` | SRE | Staff | Failure Lab | 217,218,219 |
| 371 | `kubernetes-failure-lab` | Kubernetes | Staff | Failure Lab | 280,336 |
| 372 | `observability-incident-lab` | Observability | Staff | Failure Lab | 259,327 |
| 373 | `performance-bottleneck-lab` | Performance | Staff | Failure Lab | 334,335 |
| 374 | `zero-downtime-production-release-capstone` | Release | Staff | Capstone | 305,307,337,338,339 |
| 375 | `ha-disaster-recovery-capstone` | SRE | Staff | Capstone | 330,340,341,342,343 |
| 376 | `secure-platform-capstone` | DevSecOps | Staff | Capstone | 125,129,321,322,324 |
| 377 | `system-design-comparison-capstone` | Architecture | Principal | Capstone | 352,354,362,363,365,374,375,376 |
| 378 | `principal-engineering-system-design-capstone` | Architecture | Principal | Capstone | 377,357,359 |

---

## Son Audit Notu

Bu liste nihai ve değişmez değildir. Eğitim çalışmaları tamamlandıktan sonra:

1. `java-2024` üzerinden gerçekten uygulanan konular,
2. `java-se-course` üzerinden tamamlanan Microservices / Spring Cloud / Docker / Kubernetes bölümleri,
3. gerektiğinde `java-se-edu` ile doğrulanan ek kapsam,
4. bu repository'deki gerçek kod, test ve README'ler

yeniden taranır.

Ardından yalnızca gerçekten eksik kalan veya daha ileri derinlik gerektiren projeler korunur; gereksiz tekrarlar silinir, birleştirilir veya daha ileri bir Failure Lab / Integration / Capstone'a dönüştürülür.
