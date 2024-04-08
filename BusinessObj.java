public class BusinessObj {

  private class DateOfBirth {

    private int day;
    private int month;
    private int year;

    public DateOfBirth(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
    }

    @Override
    public String toString() {
      return day + "/" + month + "/" + year;
    }
  }

  private String name; // Name: First and Last
  private char gender; // Gender: 'M' or 'F'
  private DateOfBirth dob; // Date Of Birth: dd/mm/yyyy format using DateOfBirth class
  private boolean isImmigrant; // Is this person an immigrant?: true if the person is an immigrant

  public BusinessObj(
    String name,
    char gender,
    int day,
    int month,
    int year,
    boolean isImmigrant
  ) {
    this.name = name;
    this.gender = gender;
    this.dob = new DateOfBirth(day, month, year);
    this.isImmigrant = isImmigrant;
  }

  public DateOfBirth getDob() {
    return this.dob;
  }

  public String getName() {
    return this.name;
  }

  public char getGender() {
    return this.gender;
  }

  public boolean isImmigrant() {
    return this.isImmigrant;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public void setDob(int day, int month, int year) {
    this.dob = new DateOfBirth(day, month, year);
  }

  public void setImmigrant(boolean isImmigrant) {
    this.isImmigrant = isImmigrant;
  }
}
