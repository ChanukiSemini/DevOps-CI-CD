public class CalculatorTest {
    public static void  main(String[] args){
          Calculator cal=new Calculator();
          if(cal.add(2,3)==5){
            System.out.println("Test passed");
          }else{
            System.out.println("Test failed");
          }

          if(cal.sub(6, 3)==2){
            System.out.println("Test passed");
          }else{
            System.out.println("Test failed");
          }

          if(cal.mul(6, 3)==18){
            System.out.println("Test passed");
          }else{
            System.out.println("Test failed");
          }

          if(cal.div(6, 3)==2){
            System.out.println("Test passed");
          }else{
            System.out.println("Test failed");
          }

    }
}
