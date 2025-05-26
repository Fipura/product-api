# Product API

A simple REST API to manage products, built with Java and Spring Boot.

## Features

- CRUD operations for products
- RESTful endpoints
- PostgreSQL (or H2 in-memory)
- Project structure with Service/Controller layers
- Lombok for cleaner code

## Technologies

- Java 21
- Spring Boot 3.5
- Spring Web
- Spring Data JPA
- Lombok
- PostgreSQL or H2

## API Endpoints
| Method | Endpoint          | Description                |
|--------|-------------------|----------------------------|
| GET    | /api/products     | Get all products           |
| GET    | /api/products/{id}| Get product by ID          |
| POST   | /api/products     | Create a new product       |
| PUT    | /api/products/{id}| Update an existing product |
| DELETE | /api/products/{id}| Delete a product           |

## Example JSON for POST/PUT
```json
{
  "name": "Laptop",
  "description": "A powerful laptop",
  "price": 1299.99
}
```
