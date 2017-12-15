package net.lotto.jse.bean;

public class LottoBean {
	private String money;
	private String num;

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "로또번호 =" + num;
	}
	
}
