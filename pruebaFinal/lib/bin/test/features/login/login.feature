Feature: Iniciar sesión

  Scenario: Loguearse con credenciales validas
    Given El usuario ingresa al login
    When Ingresa credenciales validas
    Then Un usuario ingresa a la pagina principal

