# The Big Bang Theory Web Application

## Descripción del Proyecto
Esta aplicación web representa la popular serie de televisión "The Big Bang Theory". La aplicación proporciona información detallada sobre la serie, incluyendo:
- Póster, creador y clasificación general
- Promedio de calificación de los episodios
- Capítulo mejor calificado
- Lista de personajes principales con fotos y descripciones
- Información de temporadas y capítulos, incluyendo detalles específicos de cada episodio

### Tecnologías Utilizadas
- **Backend**: Java 22, Spring Boot, Maven
- **Frontend**: HTML, CSS, JavaScript
- **Base de Datos**: MySQL en Clever Cloud
- **Entorno de Desarrollo**: IntelliJ IDEA

### Uso de la API

GET http://localhost:8080/

###
GET http://localhost:8080/api/serie/1/detalle

###
GET http://localhost:8080/api/personajes

###
GET http://localhost:8080/api/capitulos

###
GET http://localhost:8080/api/capitulos/3

###
GET http://localhost:8080/api/capitulos/temporada/2

###
GET http://localhost:8080/api/temporadas/serie/1


## Estructura del Proyecto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com.example.servicioTheBigBangTheory/
│   │       ├── controller/
│   │       │   ├── SerieController.java
│   │       │   ├── PersonajeController.java
│   │       │   ├── TemporadaController.java
│   │       │   └── CapituloController.java
│   │       ├── model/
│   │       │   ├── Serie.java
│   │       │   ├── Personaje.java
│   │       │   ├── Temporada.java
│   │       │   └── Capitulo.java
│   │       ├── repository/
│   │       │   ├── SerieRepository.java
│   │       │   ├── PersonajeRepository.java
│   │       │   ├── TemporadaRepository.java
│   │       │   └── CapituloRepository.java
│   │       ├── service/
│   │       │   └── SerieService.java
│   │       └── ServicioTheBigBangTheoryApplication.java
│   └── resources/
│       ├── static/
│       │   ├── index.html
│       │   ├── personajes.html
│       │   ├── temporadas.html
│       │   └── images/  (carpeta para las imágenes de los personajes)
│       └── application.properties
└── test/


