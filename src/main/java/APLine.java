public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine(int numA, int numB, int numC){
    a = numA;
    b = numB;
    c = numC;
  }
  public double getSlope(){
    return -1 * ((double) a / b);
  }
  public boolean isOnline(int x, int y){
    return ((a*x + b*y + c) == 0);
  }
}
