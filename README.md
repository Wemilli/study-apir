# Study APIR

API Java para estudo de Spring Boot.

## MER
![](assets/img/mer.png)

## Instalação
- Limpar e criar pasta */target*
    ```
    mvn clean package
    ```

    
* Configuração do Swagger
    - https://springdoc.org/properties
  
- application properties
  ```
    server.port=9000
    spring.application.name=study-apir
    springdoc.swagger-ui.path=/
  ```
## Navegação
### Executar a API

- Executando o  **Maven**
    ```
    mvn spring-boot:run
    ```

### Documentação da API (Swagger)
- http://localhost:8080/swagger-ui

### Docker
    ```
    docker pull ubuntu
    docker images
    docker pull debian
    docker images
    ```

## Referências
