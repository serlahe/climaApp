Feature: Consulta del clima de una ciudad

Como usuario
Quiero consultar el clima de una ciudad
Para obtener información climática de la ciudad seleccionada

Scenario: Consultar el clima de una ciudad válida
Given que el usuario selecciona la ciudad "Santiago"
When consulta la información climática
Then se muestra la información climática de "Santiago"

Scenario Outline: Consultar el clima de diferentes ciudades
Given que el usuario selecciona la ciudad "<ciudad>"
When consulta la información climática
Then se muestra la información climática de "<ciudad>"


Examples:
  | ciudad     |
  | Santiago   |
  | Valparaíso |
  | Melipilla  |
