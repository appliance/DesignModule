public class CashContext {
    private CashSuper cashSuper;

    // 套用工厂模式
    public CashContext(String type){
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "more than 300 renturn 100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "8 discount":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    // 调用具体策略的方法
    public double getResult(double money){
       return cashSuper.acceptCash(money);
    }


}
