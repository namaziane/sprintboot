Feature: Super smouthy loyouty cards

  The more smoothy you buy the more smothy you earn

  Background:
    Given the following drinks categories
      | Drink     | Category | Points |
      | Banana    | Regular  | 15     |
      | TBB       | Funcy    | 20     |
      | Earl Grey | Tea      | 30     |
  Scenario Outline: Eaning point when purshising smoothy
    Given Micheal is a morning freshness Member
    When Micheal pushes <Qnt><Drink> drinks
    Then he should earn <Points>
    Examples:
      | Drink     | Qnt | Points |
      | Banana    | 2   | 15     |
      | TBB       | 1   | 20     |
      | Earl Grey | 1   | 30     |
