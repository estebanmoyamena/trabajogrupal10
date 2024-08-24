# Gestión de Comandas y Garzones

Este proyecto es una aplicación web para la gestión de comandas y sus respectivos detalles, así como su asociación con los garzones. Utiliza Spring Boot, Spring Data JPA y Thymeleaf para ofrecer una interfaz de usuario dinámica y responsiva.

## Tecnologías Utilizadas

- **Java 21**: Lenguaje de programación principal.
- **Spring Boot**: Framework para construir aplicaciones basadas en Spring rápidamente.
- **Spring MVC**: Framework de Spring para el desarrollo de aplicaciones web.
- **Spring Data JPA**: Proporciona integración con JPA (Java Persistence API) para la gestión de la base de datos.
- **Thymeleaf**: Motor de plantillas para generar vistas dinámicas del lado del servidor.
- **Bootstrap 4.5**: Framework CSS para crear una interfaz de usuario responsiva y moderna.
- **MySQL**: Base de datos relacional para almacenamiento de datos.
- **Maven**: Herramienta de gestión y construcción de proyectos.

## Configuración del Proyecto

### Prerrequisitos

- **Java 11** o superior instalado en tu máquina.
- **Maven** instalado para gestionar dependencias.
- **MySQL** instalado y corriendo. Asegúrate de tener una base de datos configurada para el proyecto.

### Configuración de la Base de Datos

1. Crea una base de datos en MySQL para la aplicación:

    ```sql
    CREATE DATABASE trattoria;
    ```

2. Configura el archivo `application.properties` con las credenciales de tu base de datos:

### Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tu_usuario/gestion-comandas.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd gestion-comandas
    ```

3. Construye el proyecto usando Maven:

    ```bash
    mvn clean install
    ```

### Ejecución

1. Ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```

2. Abre tu navegador y ve a `http://localhost:8080/` para ver la lista de comandas.

## Uso de la Aplicación

### Página Principal (Listado de Comandas)

- Muestra una tabla con todas las comandas disponibles en el sistema.
- Cada fila de la tabla muestra información básica de la comanda, como su identificador, fecha de emisión y estado.
- Incluye un botón "Mostrar detalle" que redirige a una página de detalles de la comanda seleccionada.

### Página de Detalles de Comanda

- Muestra información detallada de la comanda seleccionada, incluyendo el identificador del detalle, el código del producto y la cantidad.
- También muestra información del garzón asociado a la comanda.

## Endpoints de la API REST

La aplicación también expone una API REST para gestionar comandas y detalles:

- **GET /api/comandas**: Recupera todas las comandas.
- **GET /api/comandas/{id}**: Recupera una comanda específica por su ID.
- **POST /api/comandas**: Crea una nueva comanda.
- **PUT /api/comandas/{id}**: Actualiza una comanda existente.
- **DELETE /api/comandas/{id}**: Elimina una comanda por su ID.

## Mejoras Futuras

- Añadir autenticación y autorización para la gestión de usuarios.
- Mejorar el manejo de errores con mensajes de error personalizados.
- Integración con un sistema de notificaciones para alertas de estado de comandas.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los pasos para clonar el repositorio y hacer un `pull request` para cualquier mejora.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Contacto

- Autor: Esteban Moya 

