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

## 13. Integración con CI
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

## 17. Dashboard del Pipeline
Se agregó un resumen de las métricas de performance al resumen de GitHub Actions mediante `GITHUB_STEP_SUMMARY`.

## 18. Alertas
Se configuraron umbrales para detectar problemas de performance.

## 19. Evidencias
Se realizaron capturas de los escenarios BDD ejecutados, el reporte HTML, las métricas de performance, el resumen del pipeline y la validación de los umbrales.

Las capturas se incluyen en el informe de la evaluación.
