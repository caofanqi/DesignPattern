package cn.caofanqi.design.principle.openclose.ex2;

/**
 * <p>Description: 基金职员类 </p>
 *
 * @author caofanqi
 * @since 2020/6/21 23:16
 */
public class BuyFundBankWorker implements BankWorker {

    @Override
    public void operate() {
        System.out.println("买基金");
    }
}
