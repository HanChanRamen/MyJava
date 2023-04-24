class Student{
    String name;
  
    public double calculateAvg(double[] data) {
      double sum = 0;
      for( int i=0; i < data.length; i++ ) {
              sum += data[i];
            }
      double avg = sum/data.length;
      return avg;
    }
  
    public String jedge(double avg) {
      String result;
      if( avg >= 60 ) {
        result = "passed";
      } else {
        result = "failed";
      }
      return result;
    }
  }
  
  public class Lesson14_01{
    public static void main(String[] args){
      Student a001 = new Student();
      a001.name = "sato";
      double[] data = { 70, 65, 50, 90, 30};
  
      double avg = a001.calculateAvg(data);
      String result = a001.jedge(avg);    
  
      System.out.println(avg);
      System.out.println(a001.name + " " + result);
  
    }
  }