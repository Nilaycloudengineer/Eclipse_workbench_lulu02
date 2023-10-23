package com.lululemon.idpower;

import java.util.Objects;

public class idePowers {
	String deptName;
	float sal;
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
	public idePowers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public idePowers(String deptName, float sal) {
		super();
		this.deptName = deptName;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "idePowers [deptName=" + deptName + ", sal=" + sal + ", getDeptName()=" + getDeptName() + ", getSal()="
				+ getSal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptName, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		idePowers other = (idePowers) obj;
		return Objects.equals(deptName, other.deptName) && Float.floatToIntBits(sal) == Float.floatToIntBits(other.sal);
	}
	
	

}
