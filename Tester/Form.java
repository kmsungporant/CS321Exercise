public class Form {

  String name;
  String email;
  int birthMonth;
  int birthDay;
  int birthYear;
  boolean citizen;
  int ID;

  public Form(
    String name,
    String email,
    int birthMonth,
    int birthDay,
    int birthYear,
    boolean citizen,
    int ID
  ) {
    this.name = name;
    this.email = email;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
    this.birthYear = birthYear;
    this.citizen = citizen;
    this.ID = ID;
  }

  public string getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public string getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getBirthMonth() {
    return birthMonth;
  }

  public void setBirthMonth(int birthMonth) {
    this.birthMonth = birthMonth;
  }

  public int BirthDay() {
    return birthDay;
  }

  public void setBirthDay(int birthDay) {
    this.birthDay = birthDay;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public boolean isCitizen() {
    return citizen;
  }

  public void setCitizen(boolean citizen) {
    this.citizen = citizen;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }
}
