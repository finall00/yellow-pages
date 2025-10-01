# Yellow Pages API

## Pré-requisitos

- Docker 20.10+
- Docker Compose 2.0+
- Git

**OU** para desenvolvimento local:
- Java 17+
- Maven 3.9+
- PostgreSQL 15+

## Iniciando com Docker 

### 1. Clone o repositório
```bash
git clone <url-do-repositorio>
cd yellow-pages
```

### 2. Configure as variáveis de ambiente
```bash
cp .env.example .env
```

### 3. Execute com Docker Compose
```bash
# Build e inicia todos os serviços
docker-compose up --build

# Ou em modo background
docker-compose up -d --build
```

## 📦 Serviços Disponíveis

| Serviço | URL | Descrição |
|---------|-----|-----------|
| **API** | http://localhost:8080/yellow-pages/api | Endpoints da aplicação |
| **Swagger UI** | http://localhost:8080/yellow-pages/api/swagger | Documentação interativa |
| **API Docs** | http://localhost:8080/yellow-pages/api/docs | Documentação OpenAPI |
| **Adminer** | http://localhost:8081 | Interface web para PostgreSQL |
| **PostgreSQL** | localhost:5432 | Banco de dados |

### Acessando o Adminer
1. Acesse http://localhost:8081
2. Preencha os dados:
    - **Sistema**: PostgreSQL
    - **Servidor**: DataBase
    - **Usuário**: postgres
    - **Senha**: \<Password>
    - **Base de dados**: yellow-db
```

### 3. Execute a aplicação
```bash
# Com Maven
mvn spring-boot:run

# Ou compile e execute o JAR
mvn clean package -DskipTests
java -jar target/*.jar
```


## Variáveis de Ambiente

| Variável | Descrição | Valor Padrão |
|----------|-----------|--------------|
| `APP_PORT` | Porta da aplicação | 8080 |
| `SPRING_PROFILE` | Perfil Spring ativo | prod |
| `CONTEXT_PATH` | Contexto da API | /yellow-pages/api |
| `DB_NAME` | Nome do banco | yellow-db |
| `DB_USER` | Usuário do banco | postgres |
| `DB_PASSWORD` | Senha do banco | 123456 |
| `DB_PORT` | Porta do PostgreSQL | 5432 |
| `DB_DDL_AUTO` | Hibernate DDL | none |
| `DB_SHOW_SQL` | Mostrar SQL no log | true |

