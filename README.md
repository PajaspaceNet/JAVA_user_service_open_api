# User Service (Spring Boot REST API)

Jednoduchá mikroslužba pro správu uživatelů.- obsahuje prodrobne popsany YAML.

## Spuštění
```bash
mvn spring-boot:run
```

## API Rozhraní
- `GET /users` – vrátí všechny uživatele  
- `GET /users/{id}` – vrátí uživatele podle ID  
- `POST /users` – vytvoří nového uživatele  
  - tělo požadavku (JSON):
  ```json
  {
    "id": 1,
    "name": "Pepa"
  }
  ```
