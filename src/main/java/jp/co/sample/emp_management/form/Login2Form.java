package jp.co.sample.emp_management.form;

/**
 * ログイン時に使用するフォーム.
 * 
 * @author aizawa
 * 
 */
public class Login2Form {
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	private String password2;

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	@Override
	public String toString() {
		return "LoginForm [mailAddress=" + mailAddress + ", password2=" + password2 + "]";
	}

}