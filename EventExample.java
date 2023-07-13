package javabeanclass;
import java.util.*;
public class EventExample {
private List<MyListener> listeners=new ArrayList<>();
public void addListener(MyListener listener){
	listeners.add(listener);

}
public void removeListener(MyListener listener){
	listeners.remove(listener);
	
}
private void firedlyEvent(MyEvent event){
	for(MyListener listener:listeners){
		listener.myEventOccurred(event);
	}
}
public void doSomething(){
	MyEvent event=new MyEvent(this);
	firedlyEvent(event);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
class MyListenerImpl implements MyListener{
	
	public void myEventOccurred(MyEvent event){
		System.out.println("myEvent occurred on"+ event.getSource());
	}
}
  EventExample ex=new EventExample();
  ex.addListener(new MyListenerImpl());
  ex.doSomething();
	}
	interface MyListener{
		void myEventOccurred(MyEvent event);
	}
	class MyEvent{
		private EventExample source;
		public MyEvent(EventExample source){
		this.source=source;	
		}
		public EventExample getSource(){
			return source;
		}
	}

}
