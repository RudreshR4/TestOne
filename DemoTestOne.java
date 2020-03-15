package linkedListEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Implementation of linkedList-user can use functions like get(),add(),size(),set(),indexOf() etc.as Arraylist
public class DemoTestOne<E> {
private Cell<E> myList;


@Override
public String toString() {
	return "DemoTestOne [myList=" + myList + "]";
}

public DemoTestOne() {
	super();
	this.myList = null;
}

public void add(E item)
{
 if(myList==null)
    myList = new Cell<E>(item,null);
 else
    {
     Cell<E> ptr=myList;
     for(; ptr.next!=null; ptr=ptr.next) {}
     ptr.next = new Cell<E>(item,null);
    }
}

public int size()
{
 int count=0; 
 for(Cell <E> ptr=myList; ptr!=null; ptr=ptr.next, count++) {}
 return count;
}

public E get(int pos)
{
 Cell<E> ptr=myList;
 for(int count=0; count<pos&&ptr!=null; ptr=ptr.next, count++) {}
 if(ptr==null)
    throw new IndexOutOfBoundsException();
 return ptr.first;
}

public void set(int pos,E item)
{
 Cell<E> ptr=myList;
 for(int count=0; count<pos&&ptr!=null; ptr=ptr.next, count++) {}
 if(ptr==null)
    throw new IndexOutOfBoundsException();
 ptr.first=item;
}

public int indexOf(E item)
{
 int count=0;
 Cell<E> ptr=myList;
 for(; ptr!=null&&!item.equals(ptr.first); ptr=ptr.next, count++) {}
 if(ptr==null)
    return -1;
 else
    return count;
}

public void showList(){
for(Cell<E> ptr=myList;ptr!=null;ptr=ptr.next){
System.out.println(ptr.first);
}
}

private static class Cell <T>
		 {
		  T first;
		  Cell next;

		  Cell(T h,Cell t)
		  {
		   first=h;
		   next=t;
		  }

		 }
}