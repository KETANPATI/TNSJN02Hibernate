package Com.JAR;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookExecute
{
	public static void main(String[] args) 
	{
	   EntityManagerFactory fc=Persistence.createEntityManagerFactory("PU");
	   EntityManager  em=fc.createEntityManager();
	   em.getTransaction().begin();
	   BOOK b1=new BOOK(103,"DS","Lipschute","Data Structure",217);
	   BOOK b2=new BOOK(104,"OS","Nortron","DOS Guide",175);
	   BOOK b3=new BOOK(105,"DBMS","Palmer","Dbase Dummies",270);
	  
	   em.persist(b1);
	   em.persist(b2);
	   em.persist(b3);
	   em.getTransaction().commit();
	}
}
