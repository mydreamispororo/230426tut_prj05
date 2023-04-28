package website.groupware.model;

import website.member.User;

public class GRPRegister extends User{
	//아이디, 비밀번호, 사번
	private String gid;
	
	public GRPRegister() {}
	

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}


	//method
	public String disp() {
		return "아이디 : "+ super.userid +"\t비밀번호 : "+ super.passwd +"\t사번 : "+ this.gid;
	}

	
	
	
	
	
	

}
