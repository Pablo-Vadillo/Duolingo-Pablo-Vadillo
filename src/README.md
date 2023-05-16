# Word Dictionary 
### Pablo Vadillo

Este proyecto implementa un programa en Java que permite almacenar y gestionar palabras clasificadas por su inicial. Proporciona funcionalidades como agregar palabras, eliminar palabras, buscar palabras, mostrar iniciales disponibles y mostrar palabras por inicial.

## Estructura del proyecto

El proyecto está estructurado en los siguientes paquetes:

- `entities`: Contiene la clase `WordDictionary` que representa el diccionario de palabras y su clasificación por inicial.
- `utilities`: Contiene la clase `Menu` que implementa la interfaz con el usuario.
- `main`: Contiene la clase `Main` que contiene el método `main` y ejecuta el programa.

## Funcionalidades

El programa ofrece las siguientes funcionalidades:

1. Añadir palabra: Permite agregar una palabra al diccionario.
2. Eliminar palabra: Permite eliminar una palabra del diccionario.
3. Existe palabra: Permite buscar una palabra en el diccionario.
4. Mostrar iniciales disponibles: Muestra la lista de iniciales que tienen palabras almacenadas.
5. Ver palabras por inicial: Muestra todas las palabras almacenadas que comienzan con una inicial específica.
6. Cerrar programa: Permite salir del programa.

## Uso

1. Ejecuta la clase `Main` para iniciar el programa.
2. Se mostrará un menú con las opciones disponibles.
3. Selecciona una opción ingresando el número correspondiente.
4. Sigue las instrucciones para agregar, eliminar, buscar o mostrar palabras.
5. Para salir del programa, selecciona la opción "Cerrar programa".

## Consideraciones

- Las palabras ingresadas se sanitizan, lo que significa que se ignoran las mayúsculas y los espacios al comparar o almacenar las palabras.
- Cada palabra se clasifica por su inicial en el diccionario.
- Las palabras deben ser únicas y no se permiten duplicados en el diccionario.

---

Este proyecto fue desarrollado en Java sin utilizar repositorios externos y proporciona una forma sencilla de gestionar y clasificar palabras.