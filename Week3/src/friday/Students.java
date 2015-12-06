package friday;

public class Students implements Comparable<Students> {
	
	private String name;
	private int grade;
	
	
	public Students(String _name , int _grade) {
		this.name = _name;
		this.grade = _grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public int hashCode(){		
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(!this.getClass().equals(obj.getClass())){
			return false;
		}
		Students s = (Students) obj;
		
		return (this.name.equals(s.name) && this.grade == s.grade);
	}

	@Override
	public int compareTo(Students o) {
		if(this.grade == o.grade){
			return this.name.compareTo(o.name);
		}
		else{
			if(this.grade < o.grade){
				return -1;
			}
			else{
				return 1;
			}
		}
	}
}
