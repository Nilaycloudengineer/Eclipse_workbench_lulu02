package com.lululemon.idpower;
import java.util.Objects;
public class idePowerTask {
	String Employee;
	String deptName;
	float sal;
	int age;
	String Address;
	public idePowerTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	public idePowerTask(String employee, String deptName, float sal, int age, String address) {
		super();
		Employee = employee;
		this.deptName = deptName;
		this.sal = sal;
		this.age = age;
		Address = address;
	}
	@Override
	public String toString() {
		return "idePowerTask [Employee=" + Employee + ", deptName=" + deptName + ", sal=" + sal + ", age=" + age
				+ ", Address=" + Address + ", hashCode()=" + hashCode() + ", getEmployee()=" + getEmployee()
				+ ", getDeptName()=" + getDeptName() + ", getSal()=" + getSal() + ", getAge()=" + getAge()
				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, Employee, age, deptName, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		idePowerTask other = (idePowerTask) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Employee, other.Employee) && age == other.age
				&& Objects.equals(deptName, other.deptName)
				&& Float.floatToIntBits(sal) == Float.floatToIntBits(other.sal);
	}
	public String getEmployee() {
		return Employee;
	}
	public void setEmployee(String employee) {
		Employee = employee;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

}
