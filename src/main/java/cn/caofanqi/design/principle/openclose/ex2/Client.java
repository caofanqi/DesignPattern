package cn.caofanqi.design.principle.openclose.ex2;

/**
 * <p>Description: Client </p>
 *
 * @author caofanqi
 * @since 2020/6/21 23:14
 */
public class Client {

    public static void main(String[] args) {

        BankWorker saveMoneyBankWorker = new SaveMoneyBankWorker();
        saveMoneyBankWorker.operate();

        //如果想要购买基金，只需要添加一个基金职员类实现BankWorker接口即可。
        BankWorker buyFundBankWorker = new BuyFundBankWorker();
        buyFundBankWorker.operate();

        //如果后续还有股票，转账...，只需要添加对应的职员类即可，不用修改原来的代码就能扩展功能。

    }

}
