<h1 align="center">🛒 E-Commerce Backend Project</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java&logoColor=white" alt="Java Badge" />
  <img src="https://img.shields.io/badge/SpringBoot-3.0-brightgreen?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Boot Badge" />
  <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven Badge" />
  <img src="https://img.shields.io/badge/JPA-Spring_Data-blue?style=for-the-badge&logo=hibernate&logoColor=white" alt="JPA Badge" />
  <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" alt="Status Badge" />
</p>

<p align="center">
  <b>A modern backend for an E-Commerce System.</b><br>
  RESTful, layered architecture built with <i>Spring Boot, JPA, and Maven</i> — designed to manage products with clean APIs and scalable design.
</p>

---

## ✨ Why This Project?

Most tutorials focus only on CRUD, but this project showcases **real-world backend architecture**:  
- 🚀 **Layered (Controller → Service → Repository → DB)**  
- 📦 **Preloaded data for testing**  
- ⚡ **Lightweight and extendable design**  
- 🌱 **Future ready (security, authentication, deployment)**  

### 🔍 Real-World Problem Solved

| Problem                          | ✅ Solution                                              |
| -------------------------------- | ------------------------------------------------------- |
| Complex business logic           | Encapsulated in **Service Layer**                      |
| Database interaction             | Simplified via **Spring Data JPA**                     |
| Difficult API testing            | **REST Endpoints**, Postman-ready                      |
| Scalability for new features     | **Modular architecture** (Controller/Service/Repo)     |

---

## 🛠️ Tech Stack

| Technology        | Purpose                          |
| ----------------- | -------------------------------- |
| `Java 17`         | Core language                   |
| `Spring Boot 3.0` | REST API framework              |
| `Spring Data JPA` | Database interaction (ORM)      |
| `H2/MySQL`        | Database                        |
| `Maven`           | Dependency management & build   |
| `JUnit`           | Testing framework               |

---

## 🎯 Features

| 🔧 Feature               | 💬 Description                                   |
| ------------------------ | ----------------------------------------------- |
| ➕ **Add Product**        | Create new product entries                      |
| 📖 **View Products**      | Fetch all products or a specific product by ID  |
| ✏️ **Update Product**     | Modify existing product details                 |
| ❌ **Delete Product**     | Remove products by ID                           |
| 📂 **Preloaded Data**     | Auto-inserted via `data1.sql`                   |

---




## Annotations Used



| Annotation                                                  | Layer        | Purpose                                 |
| ----------------------------------------------------------- | ------------ | --------------------------------------- |
| `@SpringBootApplication`                                    | Main App     | Entry point, enables auto-configuration |
| `@RestController`                                           | Controller   | Defines REST API controller             |
| `@RequestMapping`                                           | Controller   | Maps API endpoints (`/products`)        |
| `@GetMapping / @PostMapping / @PutMapping / @DeleteMapping` | Controller   | Define HTTP methods                     |
| `@Autowired`                                                | Service/Repo | Dependency injection                    |
| `@Service`                                                  | Service      | Marks business logic layer              |
| `@Repository`                                               | Repository   | JPA Repository for DB                   |
| `@Entity`                                                   | Entity       | Maps class to DB table                  |
| `@Id` + `@GeneratedValue`                                   | Entity       | Primary key, auto-generation            |



