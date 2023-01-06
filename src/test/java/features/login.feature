Feature: test login

  @CoinHouse
  Scenario: test simple
    Given I go to the app
 #   When I add "tier_2.buyer@test.com" and "Thinkbigger12!"
    When I add credentials
    And click on login
  #  Then results are displayed

  @Google
  Scenario Outline:
      Given I open the site
      When I add text  "<testa>" and "<testb>"
      Then results are displayed

      Examples:
        | testa | testb  |
        | aaaa  | _bbbbb |
        | ccccc | _ddddd |



