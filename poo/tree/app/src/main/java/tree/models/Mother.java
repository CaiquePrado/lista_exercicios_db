package tree.models;

import tree.interfaces.IPerson;

public class Mother implements IPerson {

  private String name;
  private int age;

  public Mother(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getAge() {
    return age;
  }

  @Override
  public String sleep() {
    return "Mamãe está dormindo zzzzzzzzzzzz";
  }

  @Override
  public String eat() {
    return "Mamãe está comendo nhac-nhac";
  }

  @Override
  public String walk() {
    return "Mamãe está andando...";
  }

  public String beautySalon(){
    return "Mamãe está no salão";
  }
}
