# ClimaApp

## 1. Objetivo
ClimaApp es un proyecto Java desarrollado con Maven, enfocado en una aplicación relacionada con el clima.

## 2. Tecnologías utilizadas
El proyecto utiliza Java 17, Maven, JUnit 5, Git, GitHub y GitHub Actions.

## 3. Configuración del proyecto
El proyecto fue configurado mediante Maven utilizando el archivo `pom.xml`.
Para comprobar la configuración de Maven se utilizó:
`mvn -version`
Para ejecutar las pruebas localmente se utilizó:
`mvn test`

## 4. Pruebas unitarias
Se implementaron dos pruebas unitarias.
Las pruebas se encuentran en `src/test/java/clima/AppTest.java`.
La ejecución local finalizo correctamente con 2 pruebas ejecutadas.

## 5. Control de versiones
Se utilizaron las ramas `main`, `develop` y `feature/clima-base`.

## 6. Archivo .gitignore
Se creó un archivo `.gitignore` para evitar que archivos generados automáticamente sean incluidos en el repositorio.

## 7. Pipeline de Integración Continua
Se configuró un pipeline mediante GitHub Actions en el archivo `.github/workflows/ci.yml`.

## 8. Reporte de pruebas
El pipeline genera los reportes de pruebas mediante Maven Surefire.
Estos reportes se almacenan en GitHub Actions como un artefacto llamado `reporte-pruebas`.

## 9. Evidencias
Se realizaron pruebas de forma local y mediante GitHub Actions.
Las capturas de estas ejecuciones se incluyen en el informe de la evaluación.






## Segunda parte: BDD y Performance

## 10. Sesión Three Amigos
Se realizó una simulación de una sesión Three Amigos para definir la funcionalidad de consulta del clima de una ciudad.

## 11. Escenarios BDD
Se crearon escenarios en Gherkin para validar la consulta del clima.
Los escenarios se encuentran en `src/test/resources/consultaClima.feature`.

## 12. Step Definitions
Se implementaron los Step Definitions utilizando Java y Cucumber.
Los pasos se encuentran en `src/test/java/clima/ConsultaClimaSteps.java`.
Las pruebas BDD se ejecutan por `RunCucumberTest.java`.

## 3. Integración con CI
Las pruebas BDD fueron integradas al pipeline de GitHub Actions junto con las pruebas
El pipeline ejecuta las pruebas mediante el comando `mvn test`.

## 14. Reporte BDD
Se configuró un reporte HTML de Cucumber.
El reporte se genera como `target/cucumber-report.html` y se almacena como artefacto en GitHub Actions.

## 15. Prueba de Performance
Se elaboro una prueba básica de performance utilizando Apache JMeter.
La prueba utiliza 10 usuarios, con 10 iteraciones por usuario, realizando solicitudes HTTP
El archivo de prueba se encuentra en `performance/ClimaPerformance.jmx`.

## 16. Métricas de Performance
Se monitorearon las siguientes métricas:
- Samples: 100 solicitudes.
- Throughput: 22.8 solicitudes por segundo.
- Latencia promedio: 1 ms.
- Latencia máxima: 40 ms.
- Errores: 0.00 %.

## 7. Dashboard del Pipeline
Se agregó un resumen de las métricas de performance al resumen de GitHub Actions mediante `GITHUB_STEP_SUMMARY`.

## 8. Alertas
Se configuraron umbrales para detectar problemas de performance.

## 19. Evidencias
Se realizaron capturas de los escenarios BDD ejecutados, el reporte HTML, las métricas de performance, el resumen del pipeline y la validación de los umbrales.

## Las capturas se incluyen en el informe de la evaluación.








## Integración Continua y Pipeline de Pruebas

## 20. Pipeline de Build y Pruebas Automatizadas
Se configuró un pipeline de Integración Continua utilizando GitHub Actions.
El pipeline se encuentra en el archivo `.github/workflows/ci.yml` y permite automatizar la compilación del proyecto y la ejecución de las pruebas.

## 21. Etapa de Build
La primera etapa del pipeline corresponde a la compilación del proyecto.
Para realizar esta etapa se utiliza el comando:

`mvn clean compile`

## 22. Etapa de Pruebas Automatizadas
Una vez finalizada correctamente la etapa de Build, se ejecutan las pruebas automatizadas mediante:

`mvn test`

Esta etapa incluye las pruebas unitarias y las pruebas BDD implementadas con Cucumber.

## 23. Reportes de Pruebas
El pipeline genera los reportes de las pruebas automatizadas y los almacena como artefactos de GitHub Actions.
Se generan los siguientes reportes:

- `reporte-pruebas`: contiene los reportes generados por Maven Surefire.
- `reporte-bdd`: contiene el reporte HTML generado por Cucumber.

## 24. Ejecución del Pipeline
El pipeline fue ejecutado correctamente en GitHub Actions, completando las etapas de Build y Pruebas Automatizadas sin errores.

## 25. Pipeline de Deployment
Como parte de la tercera actividad, se implementó un pipeline de deployment utilizando GitHub Actions.
El pipeline se encuentra en el archivo `.github/workflows/deploy.yml` y permite ejecutar pruebas de aceptación, generar el artefacto de la aplicación y realizar el despliegue en un ambiente de prueba.

## 26. Pruebas de Aceptación
Antes del despliegue se ejecutan las pruebas de aceptación mediante Cucumber/BDD.
Para ejecutar estas pruebas se utiliza:

`mvn -Dtest=RunCucumberTest test`

El despliegue continúa solamente si las pruebas de aceptación finalizan correctamente.

## 27. Build y Despliegue
Una vez aprobadas las pruebas de aceptación, el pipeline genera el artefacto de la aplicación mediante:

`mvn clean package -DskipTests`

## 28. Validación del Despliegue
Después de copiar el artefacto, el pipeline comprueba que el archivo de la aplicación se encuentre correctamente desplegado en el ambiente de prueba.
Si la validación es correcta, el despliegue finaliza exitosamente.

## 29. Rollback
Se implementó un mecanismo de rollback que permite recuperar la versión anterior de la aplicación en caso de que ocurra un error durante la validación del despliegue.
Para demostrar su funcionamiento, se implementó una simulación controlada de error durante la validación de la nueva versión.

## 30. Evidencias del Deployment y Rollback
El pipeline de deployment fue ejecutado correctamente en GitHub Actions.
Las evidencias incluyen:

- Ejecución de las pruebas de aceptación.
- Generación del artefacto y despliegue en el ambiente de prueba.
- Validación del despliegue.
- Ejecución y validación del mecanismo de rollback.



## Las evidencias de la ejecución se incluyen en el informede la evaluacion.
