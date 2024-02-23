package average.services;

import average.models.Grade;

public class GradeService {
  
  private Grade grade;

  public GradeService(Grade grade) {
    this.grade = grade;
  }

  public double average() {
    double alumnGrade[] = grade.getGrade();
    double sum = 0.0;

    for (int i = 0; i < 3; i++) {
        sum += alumnGrade[i];
    }

    double average = sum / 3;
    return average;
  }

  public String status(double average){
    if(average > 6){
      return "Aprovado";
    }else if(average >= 4 && average <= 6){
      return "Verificação Suplementar";
    }else{
      return "Reprovado";
    }
  }
}
