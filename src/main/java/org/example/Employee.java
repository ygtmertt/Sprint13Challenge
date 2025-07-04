package org.example;

public class Employee {
  private int id;
  private String fullName;
  private String email;
  private String password;
  private String[] healthPlans;

  public Employee(int id, String fullName, String email, String password, String[] healthplans) {
    this.id = id;
    this.fullName = fullName;
    this.email = email;
    this.password = password;
    this.healthPlans = healthplans;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String[] getHealthPlans() {
    return healthPlans;
  }

  public void setHealthPlans(String[] healthPlans) {
    this.healthPlans = healthPlans;
  }

  public void addHealthPlan(int index, String name) {
    if (index < 0 || index >= healthPlans.length) {
      System.out.println("Invalid index. Cannot add healthplan.");
    } else if (healthPlans[index] != null) {
      System.out.println("Index already occupied. Healthplan exists: " + healthPlans[index]);
    } else {
      healthPlans[index] = name;
      System.out.println("Healthplan added at index " + index);
    }
  }

  @Override
  public String toString() {
    StringBuilder hp = new StringBuilder();
    if (healthPlans != null) {
      for (String s : healthPlans) {
        hp.append(s).append(", ");
      }
    }
    return "Employee{" +
        "id=" + id +
        ", fullName='" + fullName + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", healthplans=" + hp.toString() +
        '}';
  }
}
