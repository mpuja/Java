package javabeanclass;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
public class Mybean {
	
	    private int id;
	    private String name;

	    public Mybean() {
	        id = 0;
	        name = "";
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
	
	    public static void main(String[] args) throws IntrospectionException {
	        BeanInfo beanInfo = Introspector.getBeanInfo(Mybean.class);

	        
	        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

	        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
	            String propertyName = propertyDescriptor.getName();
	            Class<?> propertyType = propertyDescriptor.getPropertyType();
	            String propertyTypeName = propertyType.getName();

	            System.out.println("Property name: " + propertyName);
	            System.out.println("Property type: " + propertyTypeName);
	        }
	    }
	}


