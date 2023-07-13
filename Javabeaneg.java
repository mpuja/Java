package jdbcnew;
import java.*;
public class Javabeaneg implements java. io.Serializable {
private String name;
private Boolean active;
private int data[];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Javabeaneg obj=new Javabeaneg();
	  
	   obj.setName("Puja");
	   obj.setActive(true);
	   System.out.println("Name:"+obj.getName());
	  // System.out.println("Boolean:"+obj.setActive());
		}
}
