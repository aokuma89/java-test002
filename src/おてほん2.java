
public class おてほん2 {
	
	
	public class Account {
	    private String accountNumber;
	    private double balance;
	    
	    // コンストラクタ、ゲッター、セッター
	    
	    public void deposit(double amount) {
	        // 入金処理
	    }
	    
	    public void withdraw(double amount) {
	        // 出金処理
	    }
	}

	// Customer.java
	public class Customer {
	    private String name;
	    private String address;
	    private String phone;
	    
	    // コンストラクタ、ゲッター、セッター
	    
	    public void updateInfo(String address, String phone) {
	        // 顧客情報更新
	    }
	}

	// BankSystem.java
	public class BankSystem {
	    private Account account;
	    private Customer customer;
	    
	    // コンストラクタ、ゲッター、セッター
	    
	    public void printStatement() {
	        // 明細印刷（Accountとカスタマー情報を使用）
	    }
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
