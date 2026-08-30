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
