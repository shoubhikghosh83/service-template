Feature: the version can be retrieved
  Scenario: client makes call to GET /getHealth
    When the client calls /getHealth
    Then the client receives status code of 200
    And the client receives server health "UP"