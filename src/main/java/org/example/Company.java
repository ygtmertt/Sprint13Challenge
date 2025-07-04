package org.example;

public class Company {
  private int id;
  private String name;
  private double giro;
  private String[] developerNames;

  public Company(int id, String name, double giro, String[] developerNames) {
    this.id = id;
    this.name = name;
    setGiro(giro); // kontrol burada yapılacak
    this.developerNames = developerNames;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getGiro() {
    return giro;
  }

  public void setGiro(double giro) {
    if (giro < 0) {
      this.giro = 0;
    } else {
      this.giro = giro;
    }
  }

  public String[] getDeveloperNames() {
    return developerNames;
  }

  public void setDeveloperNames(String[] developerNames) {
    this.developerNames = developerNames;
  }

  public void addEmployee(int index, String name) {
    if (index < 0 || index >= developerNames.length) {
      System.out.println("Invalid index. Cannot add employee.");
    } else if (developerNames[index] != null) {
      System.out.println("Index already occupied. Developer exists: " + developerNames[index]);
    } else {
      developerNames[index] = name;
      System.out.println("Employee added at index " + index);
    }
  }

  @Override
  public String toString() {
    StringBuilder devs = new StringBuilder();
    if (developerNames != null) {
      for (String s : developerNames) {
        devs.append(s).append(", ");
      }
    }
    return "Company{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", giro=" + giro +
        ", developerNames=" + devs.toString() +
        '}';
  }
}
