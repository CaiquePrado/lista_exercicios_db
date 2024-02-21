package multiplication_table.services;

import multiplication_table.models.MultiplicationTable;

public class MultiplicationTableService {

  private MultiplicationTable multiplicationTable;
  

  public MultiplicationTableService(MultiplicationTable multiplicationTable) {
    this.multiplicationTable = multiplicationTable;
  }

  public int multiplicationTable(){

    int num = multiplicationTable.getNumber();

    for(int i = 0; i < 11; i++){
      System.out.println(num + " x " + i + " = " +  num * i);
    }
    return num;
  }
}
