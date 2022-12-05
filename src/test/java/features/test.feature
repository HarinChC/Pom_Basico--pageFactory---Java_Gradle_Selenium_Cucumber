Feature: Categoria Comics
  Como usuario quiero leer chistes de terster para reirme
  y pasar un buen rato

  Scenario: Ingresar a la categoria comics desde la pantalla home
    Given El usuario se encuentra en la pagina Home de imalittlester
    When Hace click sobre el boton the little tester comics
    Then Se debe redirigir a la pantalla comics
