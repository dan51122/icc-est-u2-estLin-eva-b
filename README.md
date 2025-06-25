# Estructuras de Datos Lineales - Evaluación 

## Getting Started

Este proyecto es un ejercicio práctico sobre cómo implementar estructuras de datos lineales básicas en Java. 

Este repositorio se refiere a la segunda unidad de Estructuras de Datos, donde el primer capítulo cubre estructuras de datos lineales: Pilas, Colas y Listas Enlazadas.

## Requisitos
- Java JDK 11 o superior
- Git 2.20 o superior


## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---



## Explicación para el estudiante

A continuación se explica cómo implementar y probar cada uno de los métodos de la clase `LogicaClasificacion`:


### 1. invertirColaNombres(Queue<String> colaNombres)

- Simula la atención en orden FIFO (primero en entrar, primero en salir).

> **Concepto:**  
Este ejercicio sirve para representar una fila de personas que serán atendidas en orden.

> **Ejemplo de entrada y salida:**
Entrada: ["Ana", "Luis", "Marta"]  
Salida esperada (impresa):  

---

### 02. intercalarColas(Queue<Integer> cola1, Queue<Integer> cola2) {
-  Intercalar dos colas

> **Concepto:**  
Crea un método que reciba dos colas de enteros y retorne una nueva cola donde los elementos estén intercalados. Si una cola es más larga, añade los elementos restantes al final.

> **Ejemplo:**


 * Entrada:
 *   cola1: [1, 3, 5]
 *   cola2: [2, 4, 6, 8]


  * Salida:
 *   [1, 2, 3, 4, 5, 6, 8]
 
---

## Consejo general

Antes de programar, piensa en cómo usar las estructuras de datos adecuadas (pila, lista, cola) para cada problema. Si tienes dudas, prueba con ejemplos pequeños en papel.

## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial
```

¿Deseas que genere este `README.md` como archivo para descarga o lo dejo listo para que lo pegues tú manualmente?
