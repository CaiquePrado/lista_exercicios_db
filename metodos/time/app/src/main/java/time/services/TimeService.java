package time.services;

import time.models.TimeModel;

public class TimeService {
  
  private TimeModel timeModel;
  
  public TimeService(TimeModel timeModel) {
    this.timeModel = timeModel;
  }

  public long getHouras(){
    long totalSeconds = timeModel.getSeconds();
    return totalSeconds / 3600;
  }

  public long getMiutes(){
    long totalSeconds = timeModel.getSeconds();
    return (totalSeconds % 3600) / 60;
  }

  public long getRemaingSeconds(){
    long totalSeconds = timeModel.getSeconds();
    return totalSeconds % 60;
  }

  public void totalTime(){
    System.out.println(getHouras() + "h " + getMiutes() + "m " + getRemaingSeconds() + "s");
  }
}
