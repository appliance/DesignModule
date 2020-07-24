public class OperationDiv extends Operation{
    @Override
    public double getResult(double firstNum, double secondNum) {
        double result = 0;
        try{
            result = firstNum / secondNum;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
