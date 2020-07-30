package chapter03.task02;

public class Trade {
    public static void main(String[] args) {
        // 定义一家银行   给静态变量（银行名称）赋值，可以直接使用类名访问
        Bank.bankName = "招商银行";
        // 银行打印欢迎语句   调用静态方法
        Bank.welcome();
        // 开户操作    通过构造方法进行开户操作
        Bank bank = new Bank("小梦", "654321", 100.0);
        // 进行存款操作
        bank.deposit(500.00);
        // 取款时密码输入错误,取款失败
        bank.withdrawal("123456", 200.0);
        // 取款时余额不足时，取款失败
        bank.withdrawal("654321", 1000.0);
        // 取款时密码正确，余额充足，取款成功
        bank.withdrawal("654321", 200.0);
        // 银行打印道别语句  调用静态方法
        Bank.welcomeNext();
    }
}

