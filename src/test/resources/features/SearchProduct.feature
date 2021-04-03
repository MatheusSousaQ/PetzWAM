  Feature: Search a Product
    Scenario: Search Simple Product with Success
      Given I acces Petz homepage
      When search "Aquário"
      Then see list of product "Aquário Boyu Curvo 60 99 Litros Preto Champagne"
      And acces at produt "Aquário Boyu Curvo 60 99 Litros Preto Champagne"
      Then show the title "Aquário Boyu Curvo 60 99 Litros Preto Champagne" and price "R$ 3.199,99"
