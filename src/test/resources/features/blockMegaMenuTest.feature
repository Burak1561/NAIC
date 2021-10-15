Feature: MegaMenu
  Scenario: User should see the all the 7 mega menu options
    Given User go to the NAIC main page
    When User validate mega menu id is "block-megamenu"
    And User validate mega menu has seven links
    And User validate those seven menu have "color-grey-dark" class

