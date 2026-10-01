package com.dc.DTO;

public class Client {
	private int id;
	private String clientName;
	private String companyName;
	private String Email;
	private long phone;
	
	
	
	public Client() {
		
	}

	public Client(int id, String clientName, String companyName, String email, Long phone) {
		this.id = id;
		this.clientName = clientName;
		this.companyName = companyName;
		this.Email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public String getClientName() {
		return clientName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getEmail() {
		return Email;
	}

	public long getPhone() {
		return phone;
	}

	
	//setters
	public void setId(int id) {
		this.id = id;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", clientName=" + clientName + ", companyName=" + companyName + ", Email=" + Email
				+ ", phone=" + phone + "]";
	}
	
}
