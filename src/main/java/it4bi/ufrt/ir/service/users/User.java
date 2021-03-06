package it4bi.ufrt.ir.service.users;

public class User {
	
	private static int idCounter = 10000;
	private int id;
	private String name;
	private String surname;
	private String country;
	private UserSex sex;
	private String birthday;
	
	public User() {
	}

	public User(String name, String surname, String country, UserSex sex, String birthday) {
		this.id = idCounter++;
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.sex = sex;
		this.birthday = birthday;
	}
	
	public User(int id, String name, String surname, String country, UserSex sex, String birthday) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.sex = sex;
		this.birthday = birthday;
	}

	public int getID() {
		return id;
	}
	
	public void setID(int iD) {
		this.id = iD;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public UserSex getSex() {
		return sex;
	}
	
	public void setSex(UserSex sex) {
		this.sex = sex;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", country=" + country
				+ ", sex=" + sex + ", birthday=" + birthday + "]";
	}
}
