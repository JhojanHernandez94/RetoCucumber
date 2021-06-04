Feature:  Register
  I as a web user
  i wamt to register in advantage
  To be able to buy a product


  Scenario Outline: register

    Given enter the page to register
    When direct the form
    | userName   | email   | password   |
    | <userName> | <email> | <password> |
    Then should see him username in the portal
    | userName |
    | <userName>   |
    Examples:
      | userName | email      | password  |
      | Natalia | natalia@g.com | nata11 |
      | Paula | paula@g.com | pau12   |
      | Andrea | andrea@g.com | andrea13   |



