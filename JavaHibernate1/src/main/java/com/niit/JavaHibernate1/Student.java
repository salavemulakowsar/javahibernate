package com.niit.JavaHibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	StudentName name;
	@Id
int id;
//String name;
//String name;
int sem;
int avg;
public Student(int id, int sem, int avg, StudentName sname) {
		super();
		this.id = id;
		
		this.sem = sem;
		this.avg = avg;
		this.name = sname;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; }
	 */
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+id+"\t"+name+"\t"+sem+"\t"+avg;
	}

}
