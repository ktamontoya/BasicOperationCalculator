Feature: Basic Operations calculator
  me as a user
  I want to make use of the basic mathematical operations
  To test the operation of an calculator in app

  Scenario Outline: the user makes use of the calculator to validate the result of the four basic operations
    Given that the user is using the calculator
    When he decides to perform an operation
      | numberOne   | numberTwo   | operation   |
      | <numberOne> | <numberTwo> | <operation> |
    Then he will visualize the corresponding result
      | result   |
      | <result> |
    Examples:
      | numberOne | numberTwo | operation      | result |
      | 7         | 9         | suma           | 16     |
      | 9         | 3         | resta          | 6      |
      | 8         | 9         | multiplicacion | 72     |
      | 9         | 3         | division       | 3      |