# Java Spring Boot + DevOps Master Roadmap

Bu roadmap, repository'nin Java/Spring Boot backend, DevOps/Platform/SRE ve Software Architecture gelişim planını tek bir sırada toplar.

> **Canonical plan:** 384 proje. Yeni bir proje eklenmeden önce mevcut repository kodu kontrol edilir; aynı konu aynı derinlikte tekrar edilmez.

## Çalışma Standardı

Her proje mümkün olduğunca şu döngüyle ilerler: **Problem → Kısa teori → Uygulama → Test → Failure scenario → Ölçüm/debug → Trade-off → README → Commit → Teknik kontrol**.

Proje tipleri: **Lab** (tek kavram), **Integration** (birkaç bileşeni birleştirir), **Failure Lab** (bilerek bozar ve teşhis eder), **Comparison** (aynı problemi farklı yaklaşımlarla karşılaştırır), **Capstone** (uçtan uca sistem).

---

## 01 - Java Fundamentals

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 1 | `java-01-hello-world` | Java Backend | Beginner | Lab |  |
| 2 | `java-02-degiskenler` | Java Backend | Beginner | Lab | 1 |
| 3 | `java-03-operatorler` | Java Backend | Beginner | Lab | 2 |
| 4 | `java-04-donguler` | Java Backend | Beginner | Lab | 3 |
| 5 | `java-05-karar-kontrol-mekanizmalari` | Java Backend | Beginner | Lab | 4 |
| 6 | `java-06-method` | Java Backend | Beginner | Lab | 5 |
| 7 | `java-07-arrays` | Java Backend | Beginner | Lab | 6 |
| 8 | `java-08-object-class` | Java Backend | Beginner | Lab | 7 |
| 9 | `java-09-composition` | Java Backend | Beginner | Lab | 8 |
| 10 | `java-10-encapsulation` | Java Backend | Beginner | Lab | 8 |
| 11 | `java-11-inheritance-kalitim-miras` | Java Backend | Beginner | Lab | 10 |
| 12 | `java-12-polymorphism` | Java Backend | Beginner | Lab | 11 |
| 13 | `java-13-polymorphism-advanced` | Java Backend | Beginner | Lab | 12 |
| 14 | `java-14-interface-arayuz` | Java Backend | Beginner | Lab | 13 |
| 15 | `java-15-abstract-class-method` | Java Backend | Beginner | Lab | 14 |
| 16 | `java-16-collections` | Java Backend | Beginner | Lab | 15 |
| 17 | `java-17-generics` | Java Backend | Beginner | Lab | 16 |
| 18 | `java-18-stream-api` | Java Backend | Beginner | Lab | 17 |
| 19 | `java-19-optional` | Java Backend | Beginner | Lab | 18 |
| 20 | `java-20-exceptions` | Java Backend | Beginner | Lab | 19 |
| 21 | `java-21-concurrency-basic` | Java Backend | Beginner | Lab | 20 |
## 02 - RDBMS SQL JDBC JPA Hibernate Foundations

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 22 | `java-22-rdbms-fundamentals` | Data | Beginner | Lab | 21 |
| 23 | `java-23-sql-crud-queries` | Data | Beginner | Lab | 22 |
| 24 | `java-24-sql-joins-subqueries` | Data | Beginner | Lab | 23 |
| 25 | `java-25-sql-grouping-functions` | Data | Beginner | Lab | 24 |
| 26 | `java-26-rdbms-normalization-design` | Data | Intermediate | Lab | 25 |
| 27 | `java-27-sql-indexes-transactions` | Data | Intermediate | Lab | 26 |
| 28 | `java-28-jdbc-fundamentals` | Java Backend | Intermediate | Lab | 27 |
| 29 | `java-29-jdbc-preparedstatement-crud` | Java Backend | Intermediate | Lab | 28 |
| 30 | `java-30-jdbc-transactions-dao` | Java Backend | Intermediate | Lab | 29 |
| 31 | `java-31-jpa-fundamentals` | Java Backend | Intermediate | Lab | 30 |
| 32 | `java-32-jpa-relationships-jpql` | Java Backend | Intermediate | Lab | 31 |
| 33 | `java-33-hibernate-fundamentals` | Java Backend | Intermediate | Lab | 32 |
| 34 | `java-34-hibernate-intermediate` | Java Backend | Intermediate | Lab | 33 |
## 03 - Existing Spring Boot Foundations

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 35 | `java-35-spring-boot-hello` | Spring | Intermediate | Integration | 34 |
| 36 | `java-36-spring-boot-exception` | Spring | Intermediate | Integration | 35 |
| 37 | `java-37-mongo-crud` | Data | Intermediate | Integration | 35 |
| 38 | `java-38-testing-unit-webmvc-datajpa` | Testing | Intermediate | Integration | 35 |
| 39 | `java-39-spring-boot-logging` | Observability | Intermediate | Lab | 35 |
| 40 | `java-40-spring-boot-redis` | Data | Advanced | Integration | 35 |
| 41 | `java-41-spring-security` | Security | Advanced | Integration | 35 |
| 42 | `java-42-hello-docker` | DevOps | Intermediate | Lab | 35 |
## 04 - Advanced Java JVM Build Engineering

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 43 | `java-advanced-collections-internals` | Java Backend | Advanced | Lab | 16 |
| 44 | `java-concurrency-synchronization-jmm` | Java Backend | Advanced | Lab | 21 |
| 45 | `java-concurrency-locks-atomics` | Java Backend | Advanced | Lab | 44 |
| 46 | `java-executors-threadpools-futures` | Java Backend | Advanced | Lab | 45 |
| 47 | `java-completablefuture` | Java Backend | Advanced | Lab | 46 |
| 48 | `java-virtual-threads` | Java Backend | Advanced | Lab | 46 |
| 49 | `java-jvm-memory-classloading` | Java Backend | Advanced | Lab | 21 |
| 50 | `java-garbage-collection` | Java Backend | Advanced | Lab | 49 |
| 51 | `java-jfr-jmc-profiling` | Java Backend | Advanced | Lab | 49,50 |
| 52 | `java-jmh-benchmarking` | Java Backend | Advanced | Lab | 49 |
| 53 | `java-records-sealed-pattern-matching` | Java Backend | Advanced | Lab | 17 |
| 54 | `java-reflection-annotations-proxies` | Java Backend | Advanced | Lab | 14,17 |
| 55 | `java-nio-large-file-processing` | Java Backend | Advanced | Lab | 20 |
| 56 | `java-threadlocal-context-propagation` | Java Backend | Advanced | Lab | 44 |
| 57 | `java-memory-leak-lab` | Java Backend | Advanced | Failure Lab | 51 |
| 58 | `java-maven-lifecycle-dependencies` | Build | Intermediate | Lab | 35 |
| 59 | `java-maven-bom-dependency-management` | Build | Advanced | Lab | 58 |
| 60 | `java-maven-multi-module` | Build | Advanced | Integration | 59 |
| 61 | `java-gradle-deep-dive` | Build | Intermediate | Lab | 42 |
| 62 | `java-reproducible-builds` | Build | Advanced | Lab | 59 |
## 05 - Advanced SQL PostgreSQL Persistence

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 63 | `sql-query-plans-explain-analyze` | Data | Advanced | Lab | 27 |
| 64 | `sql-indexing-advanced` | Data | Advanced | Lab | 63 |
| 65 | `database-transactions-isolation` | Data | Advanced | Failure Lab | 27 |
| 66 | `database-locking-deadlocks` | Data | Advanced | Failure Lab | 65 |
| 67 | `postgresql-advanced-sql` | Data | Advanced | Lab | 24,25 |
| 68 | `postgresql-jsonb-gin` | Data | Advanced | Lab | 67 |
| 69 | `postgresql-mvcc` | Data | Advanced | Lab | 65 |
| 70 | `postgresql-partitioning` | Data | Advanced | Lab | 67,64 |
| 71 | `postgresql-query-planner-statistics` | Data | Advanced | Lab | 63 |
| 72 | `postgresql-vacuum-autovacuum` | Data | Advanced | Lab | 69 |
| 73 | `jdbc-connection-pooling-hikari` | Java Backend | Advanced | Integration | 30 |
| 74 | `jdbc-batching-performance` | Java Backend | Advanced | Lab | 73 |
| 75 | `jpa-persistence-context-internals` | Java Backend | Advanced | Lab | 34 |
| 76 | `hibernate-dirty-checking-flush` | Java Backend | Advanced | Lab | 75 |
| 77 | `hibernate-fetching-n-plus-one` | Java Backend | Advanced | Failure Lab | 76 |
| 78 | `hibernate-locking` | Java Backend | Advanced | Failure Lab | 65,75 |
| 79 | `hibernate-batching-bulk-operations` | Java Backend | Advanced | Lab | 74,76 |
| 80 | `spring-data-jdbc` | Spring | Advanced | Lab | 30 |
| 81 | `jooq-fundamentals` | Java Backend | Advanced | Lab | 30,67 |
| 82 | `jooq-advanced-querying` | Java Backend | Advanced | Lab | 81 |
| 83 | `jpa-vs-jooq-vs-jdbc` | Architecture | Senior | Comparison | 75,82,73 |
| 84 | `orm-production-performance` | Java Backend | Senior | Integration | 77,78,79 |
## 06 - Spring Core Boot MVC API

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 85 | `spring-ioc-di-beanfactory-applicationcontext` | Spring | Advanced | Lab | 35 |
| 86 | `spring-bean-lifecycle-scopes` | Spring | Advanced | Lab | 85 |
| 87 | `spring-beanpostprocessor` | Spring | Advanced | Lab | 86 |
| 88 | `spring-proxies-jdk-cglib` | Spring | Advanced | Lab | 54,85 |
| 89 | `spring-aop` | Spring | Advanced | Lab | 88 |
| 90 | `spring-transaction-management` | Spring | Advanced | Lab | 89,75 |
| 91 | `spring-transaction-propagation` | Spring | Advanced | Failure Lab | 90 |
| 92 | `spring-transaction-failure-lab` | Spring | Senior | Failure Lab | 91 |
| 93 | `spring-boot-autoconfiguration` | Spring | Advanced | Lab | 87 |
| 94 | `spring-boot-conditional-beans` | Spring | Advanced | Lab | 93 |
| 95 | `spring-configuration-properties-precedence` | Spring | Advanced | Lab | 93 |
| 96 | `spring-boot-lifecycle-graceful-shutdown` | Spring | Advanced | Failure Lab | 93 |
| 97 | `spring-mvc-request-lifecycle` | Spring | Advanced | Lab | 85,35 |
| 98 | `spring-filters-interceptors-argumentresolvers` | Spring | Advanced | Lab | 97 |
| 99 | `spring-jackson-json-processing` | Spring | Advanced | Lab | 97 |
| 100 | `spring-bean-validation-advanced` | Spring | Advanced | Lab | 36 |
| 101 | `rest-api-design` | API | Advanced | Integration | 97,99 |
| 102 | `http-idempotency` | API | Advanced | Failure Lab | 101 |
| 103 | `api-pagination-filtering-sorting` | API | Advanced | Lab | 101 |
| 104 | `http-cache-etag-conditional-requests` | API | Advanced | Lab | 101 |
| 105 | `problem-details-rfc9457` | API | Advanced | Lab | 36,101 |
| 106 | `openapi-contract-first` | API | Advanced | Integration | 101 |
| 107 | `restclient-webclient-http-clients` | Spring | Advanced | Integration | 101 |
| 108 | `spring-async-scheduling-events` | Spring | Advanced | Lab | 85 |
| 109 | `spring-aot-graalvm-native` | Spring | Senior | Comparison | 93,54 |
## 07 - DB Migrations MultiTenancy Security

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 110 | `flyway-deep-dive` | Data | Advanced | Lab | 27 |
| 111 | `liquibase-deep-dive` | Data | Advanced | Lab | 27 |
| 112 | `flyway-vs-liquibase` | Architecture | Senior | Comparison | 110,111 |
| 113 | `multitenancy-shared-schema` | Architecture | Senior | Integration | 75 |
| 114 | `multitenancy-schema-per-tenant` | Architecture | Senior | Integration | 113 |
| 115 | `multitenancy-isolation-failure-lab` | Security | Senior | Failure Lab | 113,114 |
| 116 | `oauth2-fundamentals` | Security | Advanced | Lab | 41 |
| 117 | `openid-connect` | Security | Advanced | Lab | 116 |
| 118 | `keycloak-resource-server` | Security | Advanced | Integration | 117 |
| 119 | `keycloak-authorization-code-pkce` | Security | Advanced | Integration | 118 |
| 120 | `client-credentials-service-auth` | Security | Advanced | Integration | 118 |
| 121 | `spring-authorization-server` | Security | Senior | Lab | 116,117 |
| 122 | `service-to-service-mtls` | Security | Senior | Integration | 120 |
| 123 | `vault-secrets-management` | Security | Advanced | Integration | 35 |
| 124 | `security-cors-csrf` | Security | Advanced | Failure Lab | 41 |
| 125 | `security-idor-bola` | Security | Advanced | Failure Lab | 41 |
| 126 | `security-ssrf-injection` | Security | Advanced | Failure Lab | 41,107 |
| 127 | `security-api-owasp-lab` | Security | Senior | Failure Lab | 124,125,126 |
| 128 | `security-audit-trail` | Security | Advanced | Integration | 41 |
## 08 - Mongo Cache Reactive Realtime

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 129 | `mongodb-document-modeling` | Data | Advanced | Lab | 37 |
| 130 | `mongodb-indexing-performance` | Data | Advanced | Lab | 129 |
| 131 | `mongodb-aggregation-pipeline` | Data | Advanced | Lab | 129,130 |
| 132 | `mongodb-transactions-schema-evolution` | Data | Advanced | Lab | 129 |
| 133 | `caffeine-local-cache` | Data | Advanced | Lab | 35 |
| 134 | `two-level-cache-caffeine-redis` | Data | Senior | Integration | 133,40 |
| 135 | `redis-sentinel-ha` | Data | Senior | Integration | 40 |
| 136 | `redis-cluster` | Data | Senior | Integration | 40 |
| 137 | `cache-failure-invalidation-lab` | Data | Senior | Failure Lab | 134,135,136 |
| 138 | `reactive-streams-fundamentals` | Java Backend | Advanced | Lab | 46 |
| 139 | `project-reactor` | Spring | Advanced | Lab | 138 |
| 140 | `spring-webflux` | Spring | Advanced | Integration | 139 |
| 141 | `r2dbc` | Data | Advanced | Integration | 140,27 |
| 142 | `mvc-vs-webflux-performance` | Architecture | Senior | Comparison | 97,140,141 |
| 143 | `spring-graphql` | API | Advanced | Integration | 101 |
| 144 | `graphql-dataloader-nplusone` | API | Advanced | Failure Lab | 143 |
| 145 | `server-sent-events` | API | Advanced | Lab | 140 |
| 146 | `websocket-stomp` | API | Advanced | Integration | 97 |
| 147 | `websocket-vs-sse-vs-polling` | Architecture | Senior | Comparison | 145,146 |
## 09 - Batch Workflow Files Enterprise Integration

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 148 | `spring-batch-fundamentals` | Spring | Advanced | Integration | 35,27 |
| 149 | `spring-batch-restart-recovery` | Spring | Advanced | Failure Lab | 148 |
| 150 | `spring-batch-parallel-processing` | Spring | Advanced | Integration | 148,46 |
| 151 | `quartz-scheduler` | Spring | Advanced | Integration | 35 |
| 152 | `distributed-scheduler-shedlock` | Distributed Systems | Advanced | Integration | 151,27 |
| 153 | `distributed-leader-election` | Distributed Systems | Senior | Lab | 152 |
| 154 | `workflow-engine-fundamentals` | Architecture | Advanced | Integration | 101 |
| 155 | `workflow-long-running-business-process` | Architecture | Senior | Integration | 154 |
| 156 | `minio-object-storage` | Storage | Advanced | Integration | 35,42 |
| 157 | `presigned-url-file-security` | Storage | Advanced | Lab | 156,41 |
| 158 | `large-file-streaming` | Java Backend | Advanced | Failure Lab | 55,156 |
| 159 | `csv-excel-import-export` | Java Backend | Advanced | Integration | 55 |
| 160 | `large-dataset-export` | Java Backend | Senior | Failure Lab | 159,74 |
| 161 | `soap-spring-ws` | Integration | Advanced | Integration | 35 |
| 162 | `soap-to-rest-adapter` | Integration | Senior | Integration | 161,101 |
| 163 | `enterprise-integration-patterns` | Architecture | Senior | Lab | 101,108 |
| 164 | `spring-integration-or-camel` | Integration | Senior | Integration | 163 |
| 165 | `notification-service` | Java Backend | Advanced | Integration | 108,101 |
| 166 | `document-report-generation` | Java Backend | Advanced | Integration | 156 |
## 10 - Advanced Testing

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 167 | `testcontainers-multi-service` | Testing | Advanced | Integration | 38,42 |
| 168 | `wiremock-external-api-testing` | Testing | Advanced | Failure Lab | 107 |
| 169 | `rest-assured-api-testing` | Testing | Advanced | Lab | 101 |
| 170 | `awaitility-async-testing` | Testing | Advanced | Lab | 108 |
| 171 | `contract-testing` | Testing | Advanced | Integration | 106 |
| 172 | `api-backward-compatibility-testing` | Testing | Senior | Failure Lab | 171 |
| 173 | `mutation-testing` | Testing | Advanced | Lab | 38 |
| 174 | `property-based-testing-jqwik` | Testing | Advanced | Lab | 38 |
| 175 | `archunit-architecture-tests` | Testing | Senior | Lab | 60,85 |
| 176 | `toxiproxy-network-failure-testing` | Testing | Senior | Failure Lab | 168,42 |
## 11 - Advanced Docker Container Runtime

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 177 | `docker-layers-build-cache` | DevOps | Advanced | Lab | 42 |
| 178 | `docker-multistage-buildkit` | DevOps | Advanced | Lab | 177 |
| 179 | `docker-networking-dns` | DevOps | Advanced | Lab | 42 |
| 180 | `docker-volumes-storage` | DevOps | Advanced | Lab | 42 |
| 181 | `docker-compose-advanced` | DevOps | Advanced | Integration | 179,180 |
| 182 | `docker-healthchecks-dependencies` | DevOps | Advanced | Failure Lab | 181 |
| 183 | `docker-jvm-resource-limits` | DevOps | Advanced | Failure Lab | 49,42 |
| 184 | `docker-security-nonroot-distroless` | DevOps | Senior | Lab | 42 |
| 185 | `docker-linux-namespaces-cgroups` | DevOps | Senior | Lab | 42 |
| 186 | `docker-oci-containerd-runtime` | DevOps | Senior | Lab | 185 |
| 187 | `docker-overlayfs-image-layers` | DevOps | Senior | Lab | 177 |
| 188 | `docker-pid1-signals-zombies` | DevOps | Senior | Failure Lab | 42 |
| 189 | `docker-buildx-multi-platform` | DevOps | Senior | Lab | 178 |
| 190 | `docker-rootless-capabilities-seccomp` | DevSecOps | Senior | Lab | 184,185 |
## 12 - Messaging RabbitMQ Kafka CDC

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 191 | `messaging-fundamentals` | Distributed Systems | Advanced | Lab | 163 |
| 192 | `rabbitmq-fundamentals` | Messaging | Advanced | Integration | 191 |
| 193 | `rabbitmq-routing-exchanges` | Messaging | Advanced | Lab | 192 |
| 194 | `rabbitmq-ack-retry-dlq` | Messaging | Advanced | Failure Lab | 192 |
| 195 | `rabbitmq-publisher-confirms` | Messaging | Advanced | Failure Lab | 192 |
| 196 | `rabbitmq-competing-consumers-prefetch` | Messaging | Advanced | Lab | 192 |
| 197 | `rabbitmq-quorum-ha` | Messaging | Senior | Integration | 194,195,196 |
| 198 | `kafka-fundamentals` | Messaging | Advanced | Integration | 191 |
| 199 | `kafka-partitions-ordering` | Messaging | Advanced | Lab | 198 |
| 200 | `kafka-consumer-groups-rebalancing` | Messaging | Advanced | Failure Lab | 198 |
| 201 | `kafka-retry-dlt-idempotency` | Messaging | Advanced | Failure Lab | 198,102 |
| 202 | `kafka-transactions-delivery-semantics` | Messaging | Senior | Lab | 198 |
| 203 | `kafka-schema-registry` | Messaging | Advanced | Integration | 198 |
| 204 | `kafka-schema-evolution` | Messaging | Senior | Failure Lab | 203 |
| 205 | `kafka-streams` | Messaging | Senior | Integration | 198 |
| 206 | `kafka-consumer-lag-monitoring` | Observability | Senior | Integration | 200 |
| 207 | `kafka-connect` | Messaging | Senior | Integration | 198 |
| 208 | `debezium-postgresql-cdc` | Messaging | Senior | Integration | 207,69 |
| 209 | `cdc-event-driven-data-pipeline` | Distributed Systems | Senior | Capstone | 208 |
## 13 - Distributed Systems Resilience

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 210 | `distributed-systems-fundamentals` | Distributed Systems | Advanced | Lab | 191,198 |
| 211 | `cap-pacelc-consistency` | Distributed Systems | Senior | Lab | 210 |
| 212 | `replication-partitioning-sharding` | Distributed Systems | Senior | Lab | 210,211 |
| 213 | `timeout-retry-backoff-jitter` | Distributed Systems | Advanced | Failure Lab | 107,210 |
| 214 | `circuit-breaker-resilience4j` | Distributed Systems | Advanced | Failure Lab | 213 |
| 215 | `bulkhead-rate-limit-load-shedding` | Distributed Systems | Senior | Failure Lab | 214 |
| 216 | `backpressure-overload-control` | Distributed Systems | Senior | Failure Lab | 215,138 |
| 217 | `distributed-rate-limiter` | Distributed Systems | Senior | Integration | 40,210 |
| 218 | `distributed-locking-comparison` | Distributed Systems | Senior | Comparison | 40,153,210 |
| 219 | `saga-pattern` | Architecture | Senior | Integration | 210,191 |
| 220 | `transactional-outbox-inbox` | Architecture | Senior | Integration | 219,198 |
| 221 | `eventual-consistency-failure-lab` | Distributed Systems | Senior | Failure Lab | 219,220 |
| 222 | `database-primary-replica` | Data | Senior | Integration | 69,210 |
| 223 | `spring-read-write-datasource-routing` | Spring | Senior | Integration | 222 |
| 224 | `replication-lag-consistency-lab` | Distributed Systems | Senior | Failure Lab | 222,223 |
| 225 | `connection-pool-exhaustion-lab` | Java Backend | Senior | Failure Lab | 73,213 |
| 226 | `distributed-id-generation` | Distributed Systems | Senior | Comparison | 210 |
| 227 | `feature-flags` | Architecture | Senior | Integration | 101 |
| 228 | `feature-flag-cleanup` | Architecture | Senior | Lab | 227 |
## 14 - Architecture DDD Modulith Microservices

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 229 | `clean-architecture` | Architecture | Advanced | Integration | 101 |
| 230 | `hexagonal-architecture` | Architecture | Advanced | Integration | 229 |
| 231 | `onion-architecture` | Architecture | Advanced | Integration | 229 |
| 232 | `architecture-style-comparison` | Architecture | Senior | Comparison | 229,230,231 |
| 233 | `ddd-tactical-patterns` | Architecture | Advanced | Integration | 229 |
| 234 | `ddd-aggregates-invariants` | Architecture | Senior | Failure Lab | 233 |
| 235 | `ddd-strategic-design` | Architecture | Senior | Lab | 233 |
| 236 | `bounded-context-context-map` | Architecture | Senior | Lab | 235 |
| 237 | `modular-monolith` | Architecture | Senior | Capstone | 236 |
| 238 | `spring-modulith` | Spring | Senior | Integration | 237 |
| 239 | `spring-modulith-events-testing` | Spring | Senior | Integration | 238 |
| 240 | `modular-monolith-boundary-enforcement` | Testing | Senior | Integration | 238,175 |
| 241 | `microservices-decomposition` | Architecture | Senior | Lab | 236,237 |
| 242 | `microservices-sync-rest` | Architecture | Senior | Integration | 241,107 |
| 243 | `microservices-grpc` | Architecture | Senior | Integration | 241 |
| 244 | `grpc-streaming-deadlines` | API | Senior | Integration | 243 |
| 245 | `microservices-async-messaging` | Architecture | Senior | Integration | 241,191 |
| 246 | `microservices-data-consistency` | Architecture | Senior | Capstone | 241,219,220 |
| 247 | `spring-cloud-config` | Spring Cloud | Senior | Integration | 241 |
| 248 | `service-discovery-load-balancing` | Spring Cloud | Senior | Integration | 241 |
| 249 | `spring-cloud-gateway` | Spring Cloud | Senior | Integration | 248 |
| 250 | `spring-cloud-resilience` | Spring Cloud | Senior | Integration | 249,214 |
| 251 | `distributed-context-propagation` | Observability | Senior | Integration | 242,245 |
## 15 - Search Observability

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 252 | `elasticsearch-fundamentals` | Search | Advanced | Integration | 35 |
| 253 | `elasticsearch-advanced-search` | Search | Senior | Integration | 252 |
| 254 | `opensearch-fundamentals` | Search | Advanced | Integration | 252 |
| 255 | `event-driven-search-indexing` | Search | Senior | Capstone | 209,252 |
| 256 | `prometheus-micrometer` | Observability | Advanced | Integration | 39 |
| 257 | `grafana-dashboards` | Observability | Advanced | Integration | 256 |
| 258 | `prometheus-recording-rules-alertmanager` | Observability | Senior | Integration | 257 |
| 259 | `structured-logging-loki` | Observability | Advanced | Integration | 39 |
| 260 | `opentelemetry-tracing` | Observability | Advanced | Integration | 251 |
| 261 | `tempo-distributed-tracing` | Observability | Advanced | Integration | 260 |
| 262 | `metrics-logs-traces-correlation` | Observability | Senior | Capstone | 256,259,261 |
| 263 | `observability-cardinality-sampling-cost` | Observability | Senior | Failure Lab | 256,260 |
## 16 - Linux Networking Reverse Proxy

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 264 | `linux-processes-files-permissions` | DevOps | Advanced | Lab | 42 |
| 265 | `linux-systemd-resources-troubleshooting` | DevOps | Advanced | Failure Lab | 264 |
| 266 | `linux-filesystems-inodes-pagecache` | DevOps | Senior | Lab | 265 |
| 267 | `linux-kernel-syscalls-tuning` | DevOps | Senior | Lab | 266 |
| 268 | `networking-tcp-dns-http-tls` | DevOps | Advanced | Lab | 264 |
| 269 | `tls-certificates-pki-operations` | DevSecOps | Senior | Integration | 268 |
| 270 | `networking-routing-nat-firewall-tools` | DevOps | Senior | Lab | 268 |
| 271 | `nginx-reverse-proxy-load-balancing` | DevOps | Advanced | Integration | 268,270 |
| 272 | `haproxy-load-balancing` | DevOps | Senior | Integration | 271 |
| 273 | `network-failure-diagnostics` | DevOps | Senior | Failure Lab | 268,270 |
| 274 | `network-tcp-congestion-mtu` | DevOps | Senior | Failure Lab | 273 |
## 17 - Kubernetes Fundamentals Advanced Internals

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 275 | `kubernetes-architecture` | Kubernetes | Advanced | Lab | 264,268,186 |
| 276 | `kubernetes-pods-deployments-services` | Kubernetes | Advanced | Integration | 275 |
| 277 | `kubernetes-config-secrets-probes` | Kubernetes | Advanced | Integration | 276 |
| 278 | `kubernetes-resources-scheduling` | Kubernetes | Advanced | Lab | 276 |
| 279 | `kubernetes-networking-ingress` | Kubernetes | Advanced | Integration | 276,268 |
| 280 | `kubernetes-storage-statefulset` | Kubernetes | Advanced | Integration | 276 |
| 281 | `kubernetes-security-rbac-networkpolicy` | Kubernetes | Advanced | Integration | 276,279 |
| 282 | `kubernetes-autoscaling` | Kubernetes | Senior | Integration | 278,256 |
| 283 | `kubernetes-jobs-daemonsets-pdb` | Kubernetes | Advanced | Integration | 276 |
| 284 | `kubernetes-troubleshooting` | Kubernetes | Senior | Failure Lab | 277,278,279,280 |
| 285 | `kubernetes-etcd-internals` | Kubernetes | Senior | Lab | 275 |
| 286 | `kubernetes-scheduler-internals` | Kubernetes | Senior | Lab | 275,278 |
| 287 | `kubernetes-controller-reconciliation` | Kubernetes | Senior | Lab | 275 |
| 288 | `kubernetes-finalizers-ownerreferences` | Kubernetes | Senior | Lab | 287 |
| 289 | `kubernetes-cri-cni-csi` | Kubernetes | Senior | Lab | 275,279,280 |
| 290 | `kubernetes-coredns-service-discovery` | Kubernetes | Senior | Failure Lab | 279 |
| 291 | `kubernetes-kubeproxy-networking-internals` | Kubernetes | Senior | Lab | 279 |
| 292 | `kubernetes-admission-control` | Kubernetes | Senior | Lab | 281 |
| 293 | `kubernetes-crd-custom-controller` | Kubernetes | Senior | Integration | 287,292 |
| 294 | `kubernetes-operator-pattern` | Kubernetes | Senior | Integration | 293 |
| 295 | `kubernetes-gateway-api` | Kubernetes | Senior | Integration | 279 |
| 296 | `kubernetes-service-mesh` | Kubernetes | Senior | Integration | 279 |
| 297 | `service-mesh-mtls-traffic-management` | Kubernetes | Senior | Failure Lab | 296 |
| 298 | `kubernetes-cluster-upgrade` | Kubernetes | Senior | Failure Lab | 284 |
| 299 | `kubernetes-api-deprecation-migration` | Kubernetes | Senior | Failure Lab | 298 |
| 300 | `kubernetes-backup-restore-velero` | Kubernetes | Senior | Failure Lab | 280,284 |
| 301 | `kubernetes-multi-cluster-fundamentals` | Kubernetes | Senior | Lab | 298,300 |
## 18 - Helm CI CD GitOps IaC DevSecOps

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 302 | `helm` | DevOps | Advanced | Integration | 276 |
| 303 | `helm-advanced-library-charts` | DevOps | Senior | Integration | 302 |
| 304 | `kustomize` | DevOps | Advanced | Integration | 276 |
| 305 | `github-actions-ci` | CI/CD | Advanced | Integration | 60,42 |
| 306 | `jenkins-pipeline` | CI/CD | Advanced | Integration | 60,42 |
| 307 | `sonarqube-quality-gates` | CI/CD | Advanced | Integration | 38,58 |
| 308 | `nexus-artifact-repository` | DevOps | Advanced | Integration | 58 |
| 309 | `harbor-container-registry` | DevSecOps | Advanced | Integration | 42,177 |
| 310 | `ci-cd-artifact-promotion` | CI/CD | Senior | Integration | 305,306,308,309 |
| 311 | `argocd-gitops-fundamentals` | GitOps | Advanced | Integration | 302,304,275 |
| 312 | `argocd-helm-kustomize` | GitOps | Senior | Integration | 311 |
| 313 | `argocd-applicationset` | GitOps | Senior | Integration | 311 |
| 314 | `gitops-repository-design` | GitOps | Senior | Lab | 311 |
| 315 | `gitops-secrets-management` | GitOps | Senior | Integration | 311,123 |
| 316 | `ci-reusable-pipelines-matrix-builds` | CI/CD | Senior | Integration | 305 |
| 317 | `ci-ephemeral-preview-environments` | CI/CD | Senior | Capstone | 316,311 |
| 318 | `ci-cd-supply-chain-provenance` | DevSecOps | Senior | Integration | 310,309 |
| 319 | `infrastructure-as-code-fundamentals` | IaC | Advanced | Lab | 264,275 |
| 320 | `opentofu-terraform-fundamentals` | IaC | Advanced | Integration | 319 |
| 321 | `opentofu-state-locking-drift-import` | IaC | Senior | Failure Lab | 320 |
| 322 | `opentofu-modules-environments` | IaC | Senior | Integration | 320,321 |
| 323 | `ansible-fundamentals` | IaC | Advanced | Integration | 264 |
| 324 | `ansible-advanced-roles-vault` | IaC | Senior | Integration | 323 |
| 325 | `devsecops-sast-dependency-scanning` | DevSecOps | Advanced | Integration | 305,307 |
| 326 | `container-security-sbom-signing` | DevSecOps | Senior | Integration | 309,325 |
| 327 | `policy-as-code-opa-gatekeeper-kyverno` | DevSecOps | Senior | Integration | 292,326 |
| 328 | `secrets-vault-dynamic-credentials` | DevSecOps | Senior | Integration | 123 |
| 329 | `kubernetes-security-hardening` | DevSecOps | Senior | Capstone | 281,292,326,327 |
## 19 - SRE HA Performance Release Engineering

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 330 | `sre-sli-slo-sla-error-budget` | SRE | Senior | Lab | 256 |
| 331 | `sre-red-use-golden-signals` | SRE | Senior | Lab | 330,256 |
| 332 | `sre-alerting-incident-management` | SRE | Senior | Integration | 258,330 |
| 333 | `sre-toil-oncall-escalation` | SRE | Senior | Lab | 332 |
| 334 | `sre-production-readiness-review` | SRE | Senior | Capstone | 330,332,329 |
| 335 | `high-availability-failover` | SRE | Senior | Integration | 210,275 |
| 336 | `horizontal-scaling-load-balancing` | SRE | Senior | Integration | 335,282 |
| 337 | `capacity-planning` | SRE | Senior | Lab | 256,336 |
| 338 | `finops-resource-efficiency` | Platform | Senior | Lab | 337 |
| 339 | `performance-engineering-jvm-database` | Performance | Senior | Failure Lab | 51,63,73,337 |
| 340 | `load-stress-spike-soak-testing` | Performance | Senior | Failure Lab | 339 |
| 341 | `chaos-engineering-failure-injection` | SRE | Senior | Failure Lab | 284,332,340 |
| 342 | `zero-downtime-db-migrations` | Release | Senior | Integration | 110,111,310 |
| 343 | `blue-green-deployments` | Release | Senior | Integration | 310,311 |
| 344 | `canary-deployments` | Release | Senior | Integration | 343,297 |
| 345 | `disaster-recovery-fundamentals-rpo-rto` | SRE | Senior | Integration | 300,335 |
| 346 | `postgresql-ha-pitr` | Data | Senior | Integration | 222,345 |
| 347 | `kafka-operational-ha` | Messaging | Senior | Integration | 198,345 |
| 348 | `redis-failover-recovery-drill` | Data | Senior | Integration | 135,345 |
## 20 - Advanced Architecture CQRS Event Sourcing Staff Principal

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 349 | `event-driven-architecture` | Architecture | Senior | Integration | 191,198,245 |
| 350 | `cqrs-fundamentals` | Architecture | Senior | Integration | 233,349 |
| 351 | `cqrs-eventual-consistency` | Architecture | Senior | Failure Lab | 350,221 |
| 352 | `event-sourcing-fundamentals` | Architecture | Senior | Integration | 233,349 |
| 353 | `event-sourcing-projections-snapshots` | Architecture | Staff | Integration | 352 |
| 354 | `advanced-service-boundaries` | Architecture | Staff | Lab | 236,241 |
| 355 | `api-event-contract-evolution` | Architecture | Staff | Failure Lab | 172,204 |
| 356 | `failure-domains-blast-radius` | Architecture | Staff | Failure Lab | 215,335 |
| 357 | `architecture-quality-attributes` | Architecture | Staff | Lab | 335,330 |
| 358 | `architecture-tradeoff-analysis` | Architecture | Staff | Comparison | 232,357 |
| 359 | `adr-rfc` | Architecture | Staff | Lab | 358 |
| 360 | `c4-architecture-documentation` | Architecture | Staff | Lab | 359 |
| 361 | `evolutionary-architecture` | Architecture | Staff | Integration | 354,359 |
| 362 | `platform-engineering-golden-path-design` | Platform | Staff | Lab | 310,311,334 |
| 363 | `architecture-governance` | Architecture | Principal | Capstone | 357,359,362 |
| 364 | `platform-engineering-golden-path-capstone` | Platform | Staff | Capstone | 362,312,329 |
| 365 | `backstage-idp-local-lab` | Platform | Staff | Integration | 364 |
## 21 - Capstones Failure Engineering Principal

| No | Proje | Track | Seviye | Tip | Önkoşul |
|---:|---|---|---|---|---|
| 366 | `modular-monolith-business-capstone` | Architecture | Senior | Capstone | 237,239,240 |
| 367 | `microservices-business-capstone` | Architecture | Senior | Capstone | 241,250,251 |
| 368 | `modular-monolith-vs-microservices` | Architecture | Staff | Comparison | 366,367 |
| 369 | `rest-vs-grpc-vs-messaging` | Architecture | Staff | Comparison | 242,244,245 |
| 370 | `kafka-vs-rabbitmq` | Messaging | Staff | Comparison | 197,209 |
| 371 | `polyglot-persistence-capstone` | Data | Staff | Capstone | 84,132,136,255 |
| 372 | `saga-outbox-failure-lab` | Distributed Systems | Staff | Failure Lab | 219,220,221 |
| 373 | `duplicate-delivery-idempotency-lab` | Distributed Systems | Staff | Failure Lab | 102,194,201 |
| 374 | `cache-failure-lab` | Data | Staff | Failure Lab | 137 |
| 375 | `database-concurrency-failure-lab` | Data | Staff | Failure Lab | 65,66,78 |
| 376 | `cascading-failure-lab` | SRE | Staff | Failure Lab | 213,214,215,216 |
| 377 | `kubernetes-failure-lab` | Kubernetes | Staff | Failure Lab | 284,341 |
| 378 | `observability-incident-lab` | Observability | Staff | Failure Lab | 262,332 |
| 379 | `performance-bottleneck-lab` | Performance | Staff | Failure Lab | 339,340 |
| 380 | `zero-downtime-production-release-capstone` | Release | Staff | Capstone | 310,312,342,343,344 |
| 381 | `ha-disaster-recovery-capstone` | SRE | Staff | Capstone | 335,345,346,347,348 |
| 382 | `secure-platform-capstone` | DevSecOps | Staff | Capstone | 118,122,326,327,329 |
| 383 | `system-design-comparison-capstone` | Architecture | Principal | Capstone | 358,360,368,369,371,380,381,382 |
| 384 | `principal-engineering-system-design-capstone` | Architecture | Principal | Capstone | 383,363,365 |

---

## Notlar

- `java-22`–`java-34` aralığı RDBMS, SQL, JDBC, JPA ve Hibernate'in temel/orta seviye konuları için ayrılmıştır.
- Frontend yeni roadmap'in kapsamı dışındadır; ana dil **Java**, ana framework **Spring Boot** olarak sabittir.
- Cloud'a bağımlı ücretli laboratuvarlar yerine mümkün olduğunca Docker, Docker Compose, local Kubernetes, WSL/VM ve GitHub tabanlı ücretsiz çalışmalar tercih edilir.
- Senior+ projelerde yalnızca happy-path değil; failure, troubleshooting, observability, performance ve trade-off analizi de aranır.