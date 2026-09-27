# Kata 1 - Ingeniería del Software II

## Objetivo de la entrega
Este repositorio contiene la entrega de la primera Kata de la asignatura. El objetivo principal es construir un programa sencillo en Java aplicando buenas prácticas de diseño, control de versiones y uso eficiente del entorno de desarrollo.

## Dependencias y versión de JDK
* **JDK:** Oracle OpenJDK 26.0.2
* **Gestor de dependencias:** Maven
* **IDE:** IntelliJ IDEA

## ️ Estructura de la entrega y clases principales
El proyecto está contenido en el paquete `software.ulpgc.katas` y se divide en:
1. **Modelo de Dominio (`Person.java`):** Implementado como `record` para garantizar la inmutabilidad. La lógica (cálculo de años) se ha encapsulado en un método privado (`calculateYears`), usando constantes (`DAYS_PER_YEAR = 365`) para evitar números mágicos.
2. **Principal (`Main.java`):** Punto de entrada. Su única responsabilidad es instanciar la clase `Person` y mostrar el resultado, separando así la lógica del dominio de la presentación.

## Flujo Git usado y Repeticiones
Se ha seguido una estrategia de desarrollo basada en ramas:
* **`master`:** Rama principal que contiene el código final.
* **`develop`:** Rama de desarrollo donde se han realizado los *commits* y desde donde se hizo el *push* a GitHub antes del *merge* a la rama principal.
* **Ramas de repetición (`first-try`, `second-try`, `third-try`):** Ramas utilizadas para repetir la kata y mecanizar el uso de atajos en el IDE.

**Variación introducida en la repetición:**
Durante las sucesivas repeticiones de la kata, la variación introducida consistió en refactorizar el nombre del método de cálculo matemático(`Shift+F6`).

## Comando y pasos para clonar y compilar fuera de la carpeta original
Para comprobar que el proyecto funciona correctamente en un entorno limpio y aislado, se deben usar los siguientes comandos en la terminal:

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/ICAB6002/kata1.git
   ```
2. Acceder al directorio clonado:
   ```bash
   cd kata1
   ```
3. Abrir el proyecto en IntelliJ IDEA. Al estar configurado con Maven, el IDE sincronizará automáticamente el archivo `pom.xml`.
4. Navegar hasta `src/main/java/software/ulpgc/katas/Main.java` y ejecutar la clase principal.

## Evidencias de verificación
Se han realizado las siguientes comprobaciones para dar la entrega por válida:
* **Ejecución en consola:** Se instanció un objeto `Person` y se verificó por salida estándar que el cálculo de la edad era matemáticamente correcto y el programa compilaba sin errores.
* **Prueba de aislamiento:** Se clonó el repositorio en un directorio temporal ajeno al proyecto original, comprobando que el archivo `.gitignore` evitó correctamente la subida de archivos locales del IDE y que el código descargado de GitHub funcionaba a la primera.

## Enlace al vídeo explicativo
Vídeo de demostración mostrando el uso fluido de IntelliJ, refactorización y Git: https://youtu.be/gQBKaCFTvoA