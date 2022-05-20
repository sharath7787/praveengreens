Feature: Validating adactin login from the adactin application

  Scenario Outline: Validating login id and password
    Given launch of chrome browse
    When user enter "<username>" and "<password>" and login
    When user should enter the details "<Location>","<Hotel>","<Roomtype>","<noofroom>","<checkin>","<checkout>","<Adults>","<Childrens>","<Firstname>","<Lastname>","<Address>","<cardno>","<cardtype>","<cardmonth>","<cardyear>","<cvvno>"
    And user logining in
    Then user verifies page is visible or not

    Examples: 
      | username   | password | Location | Hotel       | Roomtype | noofroom  | checkin  | checkout | Adults  | Childrens | Firstname  | Lastname | Address  | cardno           | cardtype         | cardmonth | cardyear | cvvno |
      | sharathsha | sujisura | Sydney   | Hotel Creek | Standard | 3 - Three | 3/5/2022 | 5/5/2022 | 2 - Two | 2 - Two   | sharathsam | imman    | whatever | 1234567891234567 | American Express | January   |     2022 |   297 |
      | sharathsha | sujisura | Sydney   | Hotel Creek | Standard | 3 - Three | 3/5/2022 | 5/5/2022 | 2 - Two | 2 - Two   | sharathsam | imman    | whatever | 1234567891234567 | American Express | January   |     2022 |   297 |
      | sharathsha | sujisura | Sydney   | Hotel Creek | Standard | 3 - Three | 3/5/2022 | 5/5/2022 | 2 - Two | 2 - Two   | sharathsam | imman    | whatever | 1234567891234567 | American Express | January   |     2022 |   297 |
      | sharathsha | sujisura | Sydney   | Hotel Creek | Standard | 3 - Three | 3/5/2022 | 5/5/2022 | 2 - Two | 2 - Two   | sharathsam | imman    | whatever | 1234567891234567 | American Express | January   |     2022 |   297 |
      | sharathsha | sujisura | Sydney   | Hotel Creek | Standard | 3 - Three | 3/5/2022 | 5/5/2022 | 2 - Two | 2 - Two   | sharathsam | imman    | whatever | 1234567891234567 | American Express | January   |     2022 |   297 |
