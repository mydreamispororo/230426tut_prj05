package website.shop.model;

import website.member.User;

public class ShopRegister extends User{
	//아이디, 비밀번호, 포인트
	//field(멤버변수)
	private int point;
	
	//기본생성자(Constructor)
	public ShopRegister() {}

	//getter, setter
	

	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//method
	public String disp() {
		return "아이디 : "+ super.userid +"\t비밀번호 : "+ super.passwd +"\t포인트 : "+ this.point;
	}
	
	
	
	
	
	
	
}
