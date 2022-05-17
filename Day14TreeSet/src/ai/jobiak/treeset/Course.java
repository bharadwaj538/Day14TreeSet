package ai.jobiak.treeset;

import java.util.*;
public class Course {
	private int id;
	private String name;
	private int cost;
	public Course(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cost, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return cost == other.cost && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}
