# ROADMAP Ana Konular Envanteri

Bu dosya, `ROADMAP.md` içindeki proje sırasından bağımsız olarak repository boyunca öğrenilecek **benzersiz ana konuların envanteridir**.

Amaç; her mimariyi, yaklaşımı, prensibi, pattern'i, teknolojiyi, framework'ü, protokolü, veri teknolojisini, DevOps/platform aracını ve önemli mühendislik kavramını ayrı bir ana konu olarak görünür tutmaktır.

> **Kural:** Aynı ana konu birden fazla projede uygulanabilir; ancak bu dosyada yalnızca bir kez listelenir.  
> **ROADMAP.md:** öğrenme / uygulama sırasını ve projeleri gösterir.  
> **ROADMAP-TOPICS.md:** neyin öğrenileceğini, yani konu envanterini gösterir.

## Durum İşaretleri

- [ ] Henüz başlanmadı
- [~] Öğreniliyor
- [x] Temel seviye tamamlandı
- [xx] Uygulamalı / ileri seviye tamamlandı
- [xxx] Derinleşme / production / internals seviyesi tamamlandı

---

# 01 — Java & JVM

- [ ] Core Java
- [ ] Object-Oriented Programming
- [ ] Collections Framework
- [ ] Generics
- [ ] Stream API
- [ ] Optional
- [ ] Exception Handling
- [ ] Records
- [ ] Sealed Classes
- [ ] Pattern Matching
- [ ] Reflection
- [ ] Annotations
- [ ] Dynamic Proxies
- [ ] Java NIO
- [ ] Large File Processing
- [ ] Java Concurrency
- [ ] Java Memory Model
- [ ] Synchronization
- [ ] Locks
- [ ] Atomic Types
- [ ] Executors
- [ ] Thread Pools
- [ ] Future
- [ ] CompletableFuture
- [ ] Virtual Threads
- [ ] ThreadLocal
- [ ] Context Propagation
- [ ] JVM Memory Model
- [ ] Class Loading
- [ ] Garbage Collection
- [ ] Java Flight Recorder
- [ ] Java Mission Control
- [ ] JVM Profiling
- [ ] Memory Leak Analysis
- [ ] JMH Benchmarking
- [ ] GraalVM Native Image
- [ ] Spring AOT

# 02 — Build & Dependency Management

- [ ] Maven
- [ ] Maven Lifecycle
- [ ] Maven Dependency Management
- [ ] Maven BOM
- [ ] Maven Multi-Module Projects
- [ ] Gradle
- [ ] Gradle Deep Dive
- [ ] Reproducible Builds
- [ ] Semantic Versioning
- [ ] Dependency Convergence

# 03 — Spring Core & Spring Boot

- [ ] Spring Framework
- [ ] Spring IoC
- [ ] Dependency Injection
- [ ] BeanFactory
- [ ] ApplicationContext
- [ ] Spring Bean Lifecycle
- [ ] Spring Bean Scopes
- [ ] BeanPostProcessor
- [ ] Spring Proxy Mechanisms
- [ ] JDK Dynamic Proxy
- [ ] CGLIB
- [ ] Spring AOP
- [ ] Spring Transaction Management
- [ ] Transaction Propagation
- [ ] Spring Boot
- [ ] Spring Boot Auto-Configuration
- [ ] Conditional Beans
- [ ] Configuration Properties
- [ ] Configuration Precedence
- [ ] Spring Profiles
- [ ] Graceful Shutdown
- [ ] Spring Boot Actuator
- [ ] Spring Events
- [ ] Spring Async
- [ ] Spring Scheduling

# 04 — Web, HTTP & API Engineering

- [ ] Spring MVC
- [ ] Spring MVC Request Lifecycle
- [ ] Servlet Filters
- [ ] Spring Interceptors
- [ ] Argument Resolvers
- [ ] Jackson
- [ ] Bean Validation
- [ ] REST
- [ ] REST API Design
- [ ] HTTP
- [ ] HTTP Semantics
- [ ] HTTP Idempotency
- [ ] Pagination
- [ ] Filtering
- [ ] Sorting
- [ ] HTTP Caching
- [ ] ETag
- [ ] Conditional Requests
- [ ] RFC 9457 Problem Details
- [ ] OpenAPI
- [ ] Contract-First API Design
- [ ] Spring RestClient
- [ ] Spring WebClient
- [ ] GraphQL
- [ ] Spring GraphQL
- [ ] DataLoader
- [ ] Server-Sent Events
- [ ] WebSocket
- [ ] STOMP
- [ ] Polling
- [ ] REST vs gRPC vs Messaging
- [ ] WebSocket vs SSE vs Polling

# 05 — Reactive Programming

- [ ] Reactive Streams
- [ ] Project Reactor
- [ ] Spring WebFlux
- [ ] Backpressure
- [ ] R2DBC
- [ ] MVC vs WebFlux

# 06 — Relational Databases & SQL

- [ ] RDBMS
- [ ] SQL
- [ ] Query Planning
- [ ] EXPLAIN / EXPLAIN ANALYZE
- [ ] Indexing
- [ ] Transactions
- [ ] ACID
- [ ] Isolation Levels
- [ ] Locking
- [ ] Deadlocks
- [ ] Optimistic Locking
- [ ] Pessimistic Locking
- [ ] MVCC
- [ ] Partitioning
- [ ] Replication
- [ ] Primary / Replica Architecture
- [ ] Replication Lag
- [ ] Sharding
- [ ] Database Connection Pooling
- [ ] HikariCP
- [ ] JDBC
- [ ] JDBC Batching

## PostgreSQL

- [ ] PostgreSQL
- [ ] PostgreSQL Advanced SQL
- [ ] PostgreSQL JSONB
- [ ] PostgreSQL GIN Indexes
- [ ] PostgreSQL Query Planner
- [ ] PostgreSQL Statistics
- [ ] PostgreSQL VACUUM
- [ ] PostgreSQL AUTOVACUUM
- [ ] PostgreSQL Partitioning
- [ ] PostgreSQL HA
- [ ] PostgreSQL PITR

## MySQL

- [ ] MySQL
- [ ] MySQL Storage Engines
- [ ] MySQL Indexing
- [ ] MySQL EXPLAIN
- [ ] MySQL Transactions
- [ ] MySQL Replication
- [ ] MySQL Backup / PITR
- [ ] MySQL HA / Failover
- [ ] PostgreSQL vs MySQL

# 07 — ORM & Persistence

- [ ] ORM
- [ ] JPA
- [ ] Hibernate
- [ ] Persistence Context
- [ ] Dirty Checking
- [ ] Flush
- [ ] Fetch Strategies
- [ ] N+1 Problem
- [ ] Hibernate Batching
- [ ] Bulk Operations
- [ ] Spring Data JPA
- [ ] Spring Data JDBC
- [ ] jOOQ
- [ ] JDBC vs JPA/Hibernate vs jOOQ
- [ ] ORM Production Performance

# 08 — Database Migration & Schema Evolution

- [ ] Database Migration
- [ ] Schema Evolution
- [ ] Flyway
- [ ] Liquibase
- [ ] Flyway vs Liquibase
- [ ] Zero-Downtime Database Migration
- [ ] Expand / Contract Migration Pattern

# 09 — NoSQL, Cache & Specialized Data Stores

## Redis

- [ ] Redis
- [ ] Redis Data Structures
- [ ] Redis TTL
- [ ] Cache-Aside Pattern
- [ ] Spring Cache
- [ ] Redis Pub/Sub
- [ ] Redis Streams
- [ ] Redis Transactions
- [ ] Redis Pipelining
- [ ] Redis Distributed Lock
- [ ] Redis Rate Limiting
- [ ] Cache Invalidation
- [ ] Cache Stampede
- [ ] Hot Key Problem
- [ ] Redis Eviction
- [ ] Redis Sentinel
- [ ] Redis Cluster
- [ ] Redis HA / Failover

## MongoDB

- [ ] MongoDB
- [ ] Document Modeling
- [ ] MongoDB Indexing
- [ ] MongoDB Aggregation Pipeline
- [ ] MongoDB Transactions
- [ ] MongoDB Schema Evolution
- [ ] Spring Data MongoDB

## Local / Multi-Level Cache

- [ ] Caffeine
- [ ] Local Cache
- [ ] Two-Level Cache

## Cassandra

- [ ] Apache Cassandra
- [ ] Cassandra Data Modeling
- [ ] Cassandra Partition Keys
- [ ] Cassandra Consistency Levels
- [ ] Cassandra Replication
- [ ] Cassandra Compaction
- [ ] Cassandra Tombstones
- [ ] Cassandra Hot Partitions
- [ ] Spring Data Cassandra

## Graph Database

- [ ] Neo4j
- [ ] Cypher
- [ ] Graph Modeling
- [ ] Graph Traversal
- [ ] Spring Data Neo4j
- [ ] RDBMS vs Graph Database

## Analytical / Time-Series / Distributed SQL

- [ ] ClickHouse
- [ ] MergeTree
- [ ] ClickHouse Materialized Views
- [ ] OLTP vs OLAP
- [ ] TimescaleDB
- [ ] Distributed SQL
- [ ] CockroachDB
- [ ] YugabyteDB

# 10 — Software Architecture Styles

- [ ] N-Layer Architecture
- [ ] Clean Architecture
- [ ] Hexagonal Architecture
- [ ] Onion Architecture
- [ ] Modular Monolith Architecture
- [ ] Microservices Architecture
- [ ] Event-Driven Architecture
- [ ] CQRS Architecture
- [ ] Event Sourcing Architecture
- [ ] Serverless Architecture
- [ ] Evolutionary Architecture
- [ ] Polyglot Persistence
- [ ] Architecture Style Comparison
- [ ] Modular Monolith vs Microservices

# 11 — Architecture Principles & Engineering Principles

- [ ] SOLID
- [ ] Single Responsibility Principle
- [ ] Open/Closed Principle
- [ ] Liskov Substitution Principle
- [ ] Interface Segregation Principle
- [ ] Dependency Inversion Principle
- [ ] DRY
- [ ] KISS
- [ ] YAGNI
- [ ] Separation of Concerns
- [ ] High Cohesion
- [ ] Low Coupling
- [ ] Encapsulation
- [ ] Composition over Inheritance
- [ ] Convention over Configuration
- [ ] Fail Fast
- [ ] Idempotency
- [ ] Immutability
- [ ] Backward Compatibility
- [ ] Forward Compatibility
- [ ] Graceful Degradation
- [ ] Fault Isolation
- [ ] Defense in Depth
- [ ] Least Privilege

# 12 — Domain-Driven Design

- [ ] Domain-Driven Design
- [ ] DDD Tactical Design
- [ ] Entity
- [ ] Value Object
- [ ] Aggregate
- [ ] Aggregate Root
- [ ] Domain Service
- [ ] Repository Pattern
- [ ] Domain Event
- [ ] Factory Pattern
- [ ] Specification Pattern
- [ ] Invariants
- [ ] DDD Strategic Design
- [ ] Bounded Context
- [ ] Context Map
- [ ] Ubiquitous Language
- [ ] Anti-Corruption Layer
- [ ] Shared Kernel
- [ ] Customer / Supplier
- [ ] Conformist
- [ ] Open Host Service
- [ ] Published Language

# 13 — Microservices Patterns

- [ ] Service Decomposition
- [ ] Service Boundaries
- [ ] Database per Service
- [ ] API Gateway Pattern
- [ ] Backend for Frontend Pattern
- [ ] Service Discovery Pattern
- [ ] Client-Side Load Balancing
- [ ] Externalized Configuration
- [ ] Circuit Breaker Pattern
- [ ] Retry Pattern
- [ ] Timeout Pattern
- [ ] Exponential Backoff
- [ ] Jitter
- [ ] Bulkhead Pattern
- [ ] Rate Limiting
- [ ] Load Shedding
- [ ] Saga Pattern
- [ ] Saga Choreography
- [ ] Saga Orchestration
- [ ] Compensation Transaction
- [ ] Transactional Outbox Pattern
- [ ] Inbox Pattern
- [ ] Idempotent Consumer
- [ ] Dead Letter Queue
- [ ] Strangler Fig Pattern
- [ ] Feature Flags
- [ ] Sidecar Pattern
- [ ] Ambassador Pattern
- [ ] Anti-Corruption Layer

# 14 — Spring Cloud Ecosystem

> Bu bölüm roadmap için **zorunlu kapsamdır**. Her Spring Cloud teknolojisi ayrı ana konudur.

- [ ] Spring Cloud Fundamentals
- [ ] Spring Cloud Release Train / BOM
- [ ] Spring Cloud Commons
- [ ] Spring Cloud Gateway
- [ ] Spring Cloud Config
- [ ] Spring Cloud Netflix Eureka
- [ ] Spring Cloud OpenFeign
- [ ] Spring Cloud LoadBalancer
- [ ] Spring Cloud Circuit Breaker
- [ ] Spring Cloud Stream
- [ ] Spring Cloud Bus
- [ ] Spring Cloud Contract
- [ ] Spring Cloud Vault
- [ ] Spring Cloud Function
- [ ] Spring Cloud Task
- [ ] Spring Cloud Kubernetes
- [ ] Spring Cloud Consul
- [ ] Spring Cloud Zookeeper
- [ ] Consul vs Zookeeper
- [ ] Eureka vs Consul vs Zookeeper vs Kubernetes Service Discovery
- [ ] Spring Cloud Gateway vs APISIX vs Kong
- [ ] Spring Cloud on Kubernetes
- [ ] Spring Cloud Resilience Integration

# 15 — Distributed Systems Fundamentals

- [ ] Distributed Systems Fundamentals
- [ ] CAP Theorem
- [ ] PACELC
- [ ] Strong Consistency
- [ ] Eventual Consistency
- [ ] Causal Consistency
- [ ] Replication
- [ ] Partitioning
- [ ] Sharding
- [ ] Quorum
- [ ] Consensus
- [ ] Leader Election
- [ ] Distributed Locking
- [ ] Distributed ID Generation
- [ ] Clock / Time Problems in Distributed Systems
- [ ] At-Most-Once Delivery
- [ ] At-Least-Once Delivery
- [ ] Exactly-Once Semantics
- [ ] Duplicate Delivery
- [ ] Ordering Guarantees
- [ ] Distributed Transactions
- [ ] Two-Phase Commit
- [ ] Eventual Consistency
- [ ] Failure Domains
- [ ] Blast Radius
- [ ] Cascading Failure
- [ ] Network Partitions
- [ ] Partial Failure
- [ ] Backpressure
- [ ] Overload Control

# 16 — Messaging & Event-Driven Systems

## Apache Kafka

- [ ] Apache Kafka
- [ ] Kafka Topics
- [ ] Kafka Partitions
- [ ] Kafka Ordering
- [ ] Kafka Consumer Groups
- [ ] Kafka Rebalancing
- [ ] Kafka Retry
- [ ] Kafka DLT
- [ ] Kafka Transactions
- [ ] Kafka Delivery Semantics
- [ ] Kafka Schema Registry
- [ ] Schema Evolution
- [ ] Kafka Streams
- [ ] Kafka Connect
- [ ] Kafka Consumer Lag
- [ ] Kafka HA / Operations

## RabbitMQ

- [ ] RabbitMQ
- [ ] Exchanges
- [ ] Routing Keys
- [ ] Queues
- [ ] Acknowledgements
- [ ] Retry
- [ ] Dead Letter Queue
- [ ] Publisher Confirms
- [ ] Competing Consumers
- [ ] Prefetch
- [ ] Quorum Queues
- [ ] RabbitMQ HA

## Event Streaming / CDC

- [ ] Change Data Capture
- [ ] Debezium
- [ ] Event-Driven Data Pipeline
- [ ] Apache Pulsar
- [ ] Kafka vs RabbitMQ
- [ ] Kafka vs Pulsar

# 17 — Security & Identity

- [ ] Spring Security
- [ ] Authentication
- [ ] Authorization
- [ ] RBAC
- [ ] Method Security
- [ ] BCrypt
- [ ] JWT
- [ ] Access Token
- [ ] Refresh Token
- [ ] Token Rotation
- [ ] Token Revocation
- [ ] OAuth 2.0
- [ ] OpenID Connect
- [ ] OAuth2 Resource Server
- [ ] Authorization Code Flow
- [ ] PKCE
- [ ] Client Credentials
- [ ] Keycloak
- [ ] Spring Authorization Server
- [ ] Service-to-Service Authentication
- [ ] mTLS
- [ ] TLS
- [ ] PKI
- [ ] CORS
- [ ] CSRF
- [ ] OWASP API Security
- [ ] IDOR / BOLA
- [ ] SSRF
- [ ] Injection
- [ ] Audit Trail
- [ ] Secrets Management
- [ ] HashiCorp Vault
- [ ] Dynamic Credentials
- [ ] External Secrets Operator
- [ ] SOPS

# 18 — Testing & Quality Engineering

- [ ] Unit Testing
- [ ] Integration Testing
- [ ] End-to-End Testing
- [ ] JUnit 5
- [ ] Mockito
- [ ] AssertJ
- [ ] MockMvc
- [ ] @WebMvcTest
- [ ] @DataJpaTest
- [ ] Testcontainers
- [ ] Multi-Service Testcontainers
- [ ] WireMock
- [ ] REST Assured
- [ ] Awaitility
- [ ] Contract Testing
- [ ] Spring Cloud Contract
- [ ] Backward Compatibility Testing
- [ ] Mutation Testing
- [ ] Property-Based Testing
- [ ] jqwik
- [ ] Architecture Testing
- [ ] ArchUnit
- [ ] Network Failure Testing
- [ ] Toxiproxy
- [ ] Load Testing
- [ ] Stress Testing
- [ ] Spike Testing
- [ ] Soak Testing
- [ ] Chaos Engineering
- [ ] Failure Injection

# 19 — Observability

- [ ] Observability
- [ ] Metrics
- [ ] Logging
- [ ] Structured Logging
- [ ] Distributed Tracing
- [ ] Correlation ID
- [ ] Trace Context Propagation
- [ ] Micrometer
- [ ] Micrometer Tracing
- [ ] OpenTelemetry
- [ ] Prometheus
- [ ] Prometheus Recording Rules
- [ ] Alertmanager
- [ ] Grafana
- [ ] Loki
- [ ] Tempo
- [ ] Metrics / Logs / Traces Correlation
- [ ] Cardinality Management
- [ ] Sampling
- [ ] Observability Cost Management

# 20 — Docker & Container Engineering

- [ ] Docker
- [ ] Dockerfile
- [ ] Docker Images
- [ ] Docker Containers
- [ ] Docker Registry
- [ ] Docker Hub
- [ ] Docker Compose
- [ ] Docker Layers
- [ ] Build Cache
- [ ] Multi-Stage Builds
- [ ] BuildKit
- [ ] Docker Networking
- [ ] Docker DNS
- [ ] Docker Volumes
- [ ] Health Checks
- [ ] Container Resource Limits
- [ ] Linux Namespaces
- [ ] cgroups
- [ ] OCI
- [ ] containerd
- [ ] OverlayFS
- [ ] PID 1
- [ ] Unix Signals
- [ ] Zombie Processes
- [ ] Buildx
- [ ] Multi-Platform Builds
- [ ] Rootless Containers
- [ ] Linux Capabilities
- [ ] seccomp
- [ ] Distroless Images

# 21 — Kubernetes

- [ ] Kubernetes
- [ ] Kubernetes Architecture
- [ ] Pod
- [ ] Deployment
- [ ] ReplicaSet
- [ ] Service
- [ ] ConfigMap
- [ ] Secret
- [ ] Probes
- [ ] Resource Requests / Limits
- [ ] Scheduling
- [ ] Ingress
- [ ] Gateway API
- [ ] PersistentVolume
- [ ] PersistentVolumeClaim
- [ ] StatefulSet
- [ ] DaemonSet
- [ ] Job
- [ ] CronJob
- [ ] PodDisruptionBudget
- [ ] RBAC
- [ ] NetworkPolicy
- [ ] Horizontal Pod Autoscaler
- [ ] Vertical Pod Autoscaler
- [ ] Cluster Autoscaling
- [ ] etcd
- [ ] Scheduler Internals
- [ ] Controller / Reconciliation Loop
- [ ] Finalizers
- [ ] Owner References
- [ ] CRI
- [ ] CNI
- [ ] CSI
- [ ] CoreDNS
- [ ] Kubernetes Service Discovery
- [ ] kube-proxy
- [ ] Admission Control
- [ ] CRD
- [ ] Custom Controller
- [ ] Operator Pattern
- [ ] Service Mesh
- [ ] Helm
- [ ] Kustomize
- [ ] Kubernetes Troubleshooting
- [ ] Kubernetes Security Hardening
- [ ] Multi-Cluster Architecture

# 22 — Linux & Networking

- [ ] Linux Processes
- [ ] Linux Files
- [ ] Linux Permissions
- [ ] systemd
- [ ] Linux Resource Troubleshooting
- [ ] Filesystems
- [ ] Inodes
- [ ] Page Cache
- [ ] Linux Kernel
- [ ] Syscalls
- [ ] TCP/IP
- [ ] DNS
- [ ] HTTP
- [ ] TLS
- [ ] Routing
- [ ] NAT
- [ ] Firewalls
- [ ] Reverse Proxy
- [ ] NGINX
- [ ] HAProxy
- [ ] Envoy
- [ ] Traefik
- [ ] Load Balancing
- [ ] TCP Congestion Control
- [ ] MTU
- [ ] Network Failure Diagnostics

# 23 — CI/CD, GitOps & Platform Engineering

- [ ] CI/CD
- [ ] Jenkins
- [ ] GitHub Actions
- [ ] GitLab CI
- [ ] Tekton
- [ ] SonarQube
- [ ] Nexus Repository
- [ ] Harbor
- [ ] Artifact Management
- [ ] SBOM
- [ ] Container Image Signing
- [ ] Supply Chain Security
- [ ] GitOps
- [ ] Argo CD
- [ ] Flux CD
- [ ] Infrastructure as Code
- [ ] Terraform
- [ ] Policy as Code
- [ ] OPA
- [ ] Gatekeeper
- [ ] Kyverno
- [ ] Platform Engineering
- [ ] Internal Developer Platform
- [ ] Golden Path
- [ ] Backstage

# 24 — API Gateway & Edge Technologies

- [ ] API Gateway
- [ ] Spring Cloud Gateway
- [ ] Apache APISIX
- [ ] Kong Gateway
- [ ] NGINX
- [ ] Envoy
- [ ] Traefik
- [ ] Routing
- [ ] Upstreams
- [ ] Gateway Authentication
- [ ] Gateway Rate Limiting
- [ ] Gateway Observability
- [ ] Kubernetes Ingress
- [ ] Kubernetes Gateway API
- [ ] Gateway Technology Comparison

# 25 — Batch, Workflow & Enterprise Integration

- [ ] Spring Batch
- [ ] Batch Restart / Recovery
- [ ] Parallel Batch Processing
- [ ] Quartz Scheduler
- [ ] ShedLock
- [ ] Distributed Scheduling
- [ ] Workflow Engines
- [ ] Long-Running Business Processes
- [ ] Temporal
- [ ] Temporal Workflows
- [ ] Temporal Activities
- [ ] Temporal Retry / Timeout
- [ ] Temporal Saga / Compensation
- [ ] Enterprise Integration Patterns
- [ ] Spring Integration
- [ ] Apache Camel
- [ ] SOAP
- [ ] Spring Web Services
- [ ] SOAP-to-REST Adapter
- [ ] Notification Architecture

# 26 — File & Object Storage

- [ ] Object Storage
- [ ] MinIO
- [ ] Presigned URLs
- [ ] File Upload Security
- [ ] Large File Streaming
- [ ] CSV Import / Export
- [ ] Excel Import / Export
- [ ] Large Dataset Export
- [ ] Document / Report Generation

# 27 — Search

- [ ] Full-Text Search
- [ ] Elasticsearch
- [ ] OpenSearch
- [ ] Indexing
- [ ] Search Relevance
- [ ] Event-Driven Search Indexing

# 28 — SRE, Reliability & Production Engineering

- [ ] Site Reliability Engineering
- [ ] SLI
- [ ] SLO
- [ ] SLA
- [ ] Error Budget
- [ ] RED Method
- [ ] USE Method
- [ ] Golden Signals
- [ ] Alerting
- [ ] Incident Management
- [ ] On-Call
- [ ] Escalation
- [ ] Toil
- [ ] Production Readiness Review
- [ ] High Availability
- [ ] Failover
- [ ] Horizontal Scaling
- [ ] Capacity Planning
- [ ] FinOps
- [ ] Resource Efficiency
- [ ] Performance Engineering
- [ ] Disaster Recovery
- [ ] RPO
- [ ] RTO
- [ ] Blue-Green Deployment
- [ ] Canary Deployment
- [ ] Zero-Downtime Release
- [ ] Chaos Engineering

# 29 — Architecture Governance & Staff+ Engineering

- [ ] Architecture Quality Attributes
- [ ] Architecture Trade-Off Analysis
- [ ] ADR
- [ ] RFC
- [ ] C4 Model
- [ ] Architecture Documentation
- [ ] Evolutionary Architecture
- [ ] Architecture Governance
- [ ] Technology Selection
- [ ] Decision Matrix
- [ ] System Design
- [ ] Failure Domain Analysis
- [ ] Blast Radius Analysis
- [ ] Service Boundary Design
- [ ] API Contract Evolution
- [ ] Event Contract Evolution

# 30 — Big Data & Distributed Data Processing

- [ ] Big Data Fundamentals
- [ ] Hadoop Ecosystem
- [ ] HDFS
- [ ] Distributed Storage
- [ ] Parquet
- [ ] Avro
- [ ] ORC
- [ ] Compression Codecs
- [ ] Apache Spark
- [ ] Spark DataFrames
- [ ] Spark Datasets
- [ ] Spark SQL
- [ ] Spark RDD
- [ ] Spark Partitioning
- [ ] Spark Shuffle
- [ ] Spark Join Strategies
- [ ] Spark Cache / Persist
- [ ] Spark Memory Model
- [ ] Spark Performance Tuning
- [ ] Spark Structured Streaming
- [ ] Spark + Kafka
- [ ] Spark Checkpointing
- [ ] Spark Watermarks
- [ ] Spark on Kubernetes
- [ ] Apache Flink
- [ ] Flink DataStream API
- [ ] Event Time
- [ ] Processing Time
- [ ] Watermarks
- [ ] Windows
- [ ] Keyed State
- [ ] Checkpoints
- [ ] Savepoints
- [ ] Flink Exactly-Once
- [ ] Flink Backpressure
- [ ] Flink + Kafka
- [ ] Apache Iceberg
- [ ] Lakehouse Architecture
- [ ] Schema Evolution
- [ ] Partition Evolution
- [ ] Snapshots / Time Travel
- [ ] Apache Trino
- [ ] Federated Query
- [ ] Apache Airflow
- [ ] DAG
- [ ] Backfill
- [ ] Data Quality
- [ ] Batch vs Stream Processing

---

# Spring Cloud Zorunlu Kapsam Kontrol Listesi

Aşağıdaki maddeler Spring Cloud öğrenme projesi tamamlanmadan **roadmap tamamlanmış sayılmaz**:

- [ ] Spring Boot
- [ ] Spring Cloud Gateway
- [ ] Spring Cloud Config
- [ ] Spring Cloud Netflix Eureka
- [ ] Spring Cloud OpenFeign
- [ ] Spring Cloud LoadBalancer
- [ ] Spring Cloud Circuit Breaker
- [ ] Spring Cloud Stream
- [ ] Spring Cloud Bus
- [ ] Spring Cloud Contract
- [ ] Spring Cloud Vault
- [ ] Spring Cloud Function
- [ ] Spring Cloud Task
- [ ] Spring Cloud Kubernetes
- [ ] Spring Cloud Consul
- [ ] Spring Cloud Zookeeper
- [ ] Consul / Zookeeper karşılaştırması

---

# Kullanım Kuralı

Yeni bir proje, teknoloji, pattern, mimari veya mühendislik konusu ROADMAP.md'ye eklendiğinde:

1. Önce bu dosyada aynı ana konunun bulunup bulunmadığı kontrol edilir.
2. Yoksa uygun kategoriye **tek bir ana konu** olarak eklenir.
3. Aynı konu farklı projelerde tekrar uygulansa bile burada çoğaltılmaz.
4. Bir teknoloji ailesinin bağımsız bileşenleri ayrı öğrenme hedefiyse ayrı ana konu olarak tutulur.
5. Ana konu tamamlanma durumu, yalnızca teorik okuma ile değil uygulama ve teknik doğrulama ile güncellenir.
