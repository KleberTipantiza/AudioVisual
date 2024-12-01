# Proyecto Audiovisual

Este proyecto es un sistema para gestionar contenidos audiovisuales como películas, series de TV, documentales y telenovelas, anime. Los contenidos se pueden agregar, guardar en archivos CSV y luego ser leídos desde estos archivos para mostrarlos al usuario.

## Descripción

El programa permite gestionar una lista de contenidos audiovisuales. Los usuarios pueden agregar contenidos de distintos tipos como:
- **Películas**
- **Series de TV**
- **Documentales**
- **Telenovelas**
- **Anime**

Los contenidos pueden ser almacenados en un archivo CSV, y luego ser leídos para mostrar los detalles de cada uno. Además, el sistema está implementado siguiendo principios de **código limpio** y **recodificación**, para asegurar que el código sea mantenible y fácil de entender.

### Funcionalidades principales

1. **Agregar contenido audiovisual**: El usuario puede agregar diferentes tipos de contenido (película, serie de TV, documental o telenovela).
2. **Guardar contenidos en archivo CSV**: Los contenidos se pueden guardar en un archivo CSV para su persistencia.
3. **Leer desde archivo CSV**: Los contenidos guardados en el archivo CSV pueden ser leídos y mostrados al usuario.
4. **Visualización de detalles**: El sistema permite mostrar los detalles de los contenidos agregados al sistema.

### Principios de Código Limpio aplicados

- **Nombres significativos**: Las clases, métodos y variables tienen nombres que reflejan claramente su propósito.
- **Funciones pequeñas**: Las funciones realizan tareas específicas y no están sobrecargadas.
- **Principio de responsabilidad única**: Cada clase y método tiene una única responsabilidad, lo que facilita su mantenimiento y comprensión.
- **Uso de encapsulación**: Los detalles de implementación de las clases están ocultos, permitiendo que los usuarios interactúen con el sistema a través de interfaces claras.
-  **Aplicación de Principios SOLID**

### Recodificación

El sistema fue diseñado para ser modular, permitiendo que los contenidos sean fácilmente extensibles en el futuro. Las clases `ContenidoAudiovisual`, `Pelicula`, `SerieDeTV`, `Documental`, y `Telenovela` son los componentes principales del sistema, y cada uno tiene su propia responsabilidad.

### Creación de CSV

El sistema utiliza archivos CSV para almacenar los contenidos audiovisuales. Cada tipo de contenido se guarda con sus detalles en formato CSV, lo que permite tanto la persistencia como la facilidad de uso en otros sistemas.

El archivo `GestorArchivos.java` maneja la creación, escritura y lectura de los archivos CSV. Los datos se separan por comas y se pueden leer para mostrar los detalles de los contenidos.

## Cómo clonar y ejecutar el proyecto

Para ejecutar el proyecto en Eclipse, sigue estos pasos:

### Clonar el repositorio

1. Abre una terminal o consola en tu computadora.
2. Navega aal repositoria para clonar el proyecto usando el link http.
3. Ejecuta el siguiente comando para clonar el repositorio:
   git clone https://github.com/KleberTipantiza/AudioVisual.git
4. Una vez clonado se puede ejecutar el programa en tu IDE de preferencia, se recomienda usar Eclipse
5. Por ultimo el programa se ejeuta desde la clase PruebaAudioVisual
