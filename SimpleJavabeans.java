package javabeanclass;

public class SimpleJavabeans implements java.io.Serializable{

int id;
String name;
Boolean active;
int data[];
   public int[] getData() {
	return data;
}
public void setData(int[] data) {
	this.data = data;
}
public Boolean isActive() {
	return active;
}
public void setActive(Boolean active) {
	this.active = active;
}
public SimpleJavabeans(){
	   
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SimpleJavabeans obj=new SimpleJavabeans();
   obj.setId(1);
   obj.setName("Asha");
   obj.setActive(true);
   System.out.println("Id:"+obj.getId());
   System.out.println("Name:"+obj.getName());
   System.out.println("Active:"+obj.isActive());
	}

}
