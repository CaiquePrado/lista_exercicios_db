package prova.utils;

import java.text.DecimalFormat;

public class PriceFormatter {
  public String format(double value){
    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    return decimalFormat.format(value);
  }
}
