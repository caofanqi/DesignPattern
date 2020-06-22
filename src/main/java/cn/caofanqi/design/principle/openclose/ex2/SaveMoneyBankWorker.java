package cn.caofanqi.design.principle.openclose.ex2;

/**
 * <p>Description: 负责存钱的银行职员 </p>
 *
 * @author caofanqi
 * @since 2020/6/21 23:13
 */
public class SaveMoneyBankWorker implements BankWorker{

    public void operate() {
        System.out.println("存钱");
    }

}
