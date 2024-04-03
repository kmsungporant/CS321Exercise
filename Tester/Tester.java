package Tester;

public class Tester {

  @Test // Checks if the name does not exceed 25 characters
  void FormNameTester() {
    FormData formData = new FormData(...);
    assertTrue(formData.getName().length < 25); // asserts true if the name is less than 25 characters
  }

  @Test // Checks to see if the email field is an email
  void FormEmailTester() { 
    FormData formData = new FormData(...);
    assertTrue(formData.getEmail().contains('@')); // asserts true if the email string contains a @ to indicate that it is an email.
  }

  @Test // Checks if the month does not exceed 12 and is not less than 0
  void FormBirthMonthTester() {
    FormData formData = new FormData(...);
    assertTrue(formData.getBirthMonth() <= 12 && formData.getBirthMonth > 0); // asserts true if the month exceeds 12 and is greater than 0
  }
  @Test // Checks if the day is not negative
  void FormBirthDayTester() {
    FormData formData = new FormData(...);
    assertTrue(formData.getBirthDay() > 1 && formData.getBirthDay() <= 31); // asserts true if the day is not negative
  }
  @Test // Checks if the year is negative and does not exceed the current year
  void FormBirthYearTester() {
    FormData formData = new FormData(...);
    assertTrue(formData.getBirthYear > 0 && formData.getBirthYear < 2025); // asserts true if the year is not negative and is less than the current year
  }

  @Test // Checks if the editing works for changing the name
  void EditFormNameTester(){
    FormData formData = new FormData(...);
    formData.setName("Doe");
    assertEquals(formData.getName(), "Doe"); // asserts true if the name is properly changed
  }

  @Test // Checks if the editing works for changing the Birth Month
  void EditFormBirthMonthTester(){
    FormData formData = new FormData(...);
    formData.setBirthMonth(3);
    assertEquals(formData.getBirthMonth(), 3); // asserts true if the Birth Month is properly changed
  }

  @Test // Checks if the editing works for changing the Birth Day
  void EditFormBirthDayTester(){
    FormData formData = new FormData(...);
    formData.setBirthDay(12);
    assertEquals(formData.getBirthDay(), 12); // asserts true if the Birth Day is properly changed
  }
  @Test // Checks if the editing works for changing the Birth Year
  void EditFormBirthYearTester(){
    FormData formData = new FormData(...);
    formData.setBirthYear(2000);
    assertEquals(formData.getBirthYear(), 2000); // asserts true if the Birth Year is properly changed
  }

  @Test // Checks if the person is a US citizen
    void FormCitizenTester(){
        FormData formData = new FormData(...);
        assertTrue(formData.isCitizen()); // asserts true if the person is a US citizen
    }

    @Test // Checks if the ID is an integer
    void FormIDTester(){
        FormData formData = new FormData(...);
        assertTrue(formData.getID() instanceof Integer); // asserts true if the ID is an integer
    }

    @Test // Checks if name is a string
    void FormNameTypeTester(){
        FormData formData = new FormData(...);
        assertTrue(formData.getName() instanceof String); // asserts true if the name is a string
    }

    @Test // Checks if email is a string
    void FormEmailTypeTester(){
        FormData formData = new FormData(...);
        assertTrue(formData.getEmail() instanceof String); // asserts true if the email is a string
    }

    @Test // Checks if the month is an integer
    void FormBirthMonthTypeTester(){
        FormData formData = new FormData(...);
        assertTrue(formData.getBirthMonth() instanceof Integer); // asserts true if the month is an integer
    }

    @Test // Checks if the day is an integer
    void FormBirthDayTypeTester(){
        FormData formData = new FormData(...);
        assertTrue(formData.getBirthDay() instanceof Integer); // asserts true if the day is an integer
    }

    @Test // Checks if the year is an integer
    void FormBirthYearTypeTester(){
        FormData formData = new FormData(...);
        assertTrue(formData.getBirthYear() instanceof Integer); // asserts true if the year is an integer
    }

    @Test // Checks if the citizen is a boolean
    void FormCitizenTypeTester(){
        FormData formData = new FormData(...);
        assertTrue(formData.isCitizen() instanceof Boolean); // asserts true if the citizen is a boolean
    }
}
