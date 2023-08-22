package HQLpack;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Restrictions;
import java.util.*;

public class Bookmain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory = c.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		//insertion
	/*	Book b = new Book();
		b.setBname("Java");
		b.setBprice(400);
		session.save(b);
		t.commit();	*/
		
		//update
	/*	Query q=session.createQuery("update Book set bname=:n,bprice=:p where bcode=:c");
		q.setParameter("n","python");
		q.setParameter("p", 800);
		q.setParameter("c",2);
		int i=q.executeUpdate();
		t.commit();	*/
		
	//delete
	/*	Query q=session.createQuery("delete from Book where bcode=:c");
		q.setParameter("c",2);
		int i=q.executeUpdate();
		t.commit();	*/
		
		//display records
	/*	Query q=session.createQuery("from Book");
		List li=q.list();
		for(Object b:li)
		{
			Book x=(Book)b;
			System.out.println(x.getBcode()+" "+x.getBname()+" "+x.getBprice());
		}	*/
		
		//use of setFirstResult() and setMaxResult()	
	/*	Query q=session.createQuery("from Book");
		q.setFirstResult(0); //row start from 0
		q.setMaxResults(2);
		List li=q.list();
		for(Object b:li)
		{
			Book x=(Book)b;
			System.out.println(x.getBcode()+" "+x.getBname()+" "+x.getBprice());
		}	*/
		
		//to find book records in which book price>=700
	/*	Criteria ct=session.createCriteria(Book.class);
		ct.add(Restrictions.ge("bprice",300));
		List li=ct.list();
		for(Object b:li)
		{
			Book x=(Book)b;
			System.out.println(x.getBcode()+" "+x.getBname()+" "+x.getBprice());
		}	*/
		
		//to display book record which have highest price
		Query q=session.createQuery("select max(bprice) from Book");
		List li=q.list();
		System.out.println(li.get(0));
		session.close();		
		System.out.println("Success..");
	}

}
