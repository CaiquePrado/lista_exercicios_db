package age.services;

import age.models.Person;

public class PersonService {

  private Person person;

  public PersonService(int age) {
    this.person = new Person(age);
  }

  public String elderAge(){
    int age = person.getAge();
    if(age <= 0){
      return "Digite uma idade válida!";
    }else if(age >= 18){
      return "Voce eh maior de idade!";
    }else{
      return "Voce eh menor de idade!";
    }
  }
}