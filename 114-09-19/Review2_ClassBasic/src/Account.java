public class Account {
    // 帳戶號碼，唯一識別每個帳戶
    private String accountNumber;
    // 帳戶餘額，儲存目前帳戶的金額
    private double balance;

    /**
     * 建構子：初始化帳戶號碼與初始餘額
     * @param accountNumber 帳戶號碼
     * @param initialBalance 初始餘額
     */
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    /**
     * 取得帳戶號碼
     * @return 帳戶號碼
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 取得帳戶餘額
     * @return 帳戶餘額
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 存款方法，將指定金額存入帳戶
     * @param amount 存款金額，必須為正數
     * @throws IllegalArgumentException 如果存款金額不是正數則丟出例外
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // 增加帳戶餘額
        } else {
            throw new IllegalArgumentException("存款金額必須為正數。");
        }
    }

    /**
     * 提款方法，從帳戶提取指定金額
     * @param amount 提款金額，必須為正數且不得超過餘額
     * @throws IllegalArgumentException 如果餘額不足或提款金額不合法則丟出例外
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // 減少帳戶餘額
        } else {
            throw new IllegalArgumentException("餘額不足或提款金額不合法。");
        }
    }
}
