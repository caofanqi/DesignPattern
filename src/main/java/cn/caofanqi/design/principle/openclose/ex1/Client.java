package cn.caofanqi.design.principle.openclose.ex1;

/**
 * <p>Description: Client </p>
 *
 * @author caofanqi
 * @since 2020/6/21 23:01
 */
public class Client {

    public static void main(String[] args) {

        BankWorker bankWorker = new BankWorker();
        bankWorker.saveMoney();

        //如果，想买基金，要在BankWorker类中添加买基金的方法
        bankWorker.buyFund();

        //如果后续还有股票，转账...，都要修改BankWorker类。
    }

}
