package tree.models;

import tree.interfaces.IPerson;

public class Father implements IPerson {

  private String name;
  private int age;

  public Father(String name, int age) {
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
    return "Papai está dormindo zzzzzzzzzzzz";
  }

  @Override
  public String eat() {
    return "Papai está comendo nhac-nhac";
  }

  @Override
  public String walk() {
    return "Papai está andando...";
  }

  public String playSoccer(){
    return "Papai está jogando bola";
  } 
}
