# Book_Application_Hibernate
This GitHub repository contains a Java application that demonstrates the usage of Hibernate Query Language (HQL) to perform various database operations, such as insertion, update, delete, and retrieval of records from a database. The application uses Hibernate for database interaction.

# Prerequisites
Before you run this application, make sure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Eclipse or any IDE
- Hibernate Framework
- Database Server (e.g., MySQL, PostgreSQL) and appropriate JDBC driver
- An XML configuration file for Hibernate (hibernate.cfg.xml) properly set up with your database connection details.

# Usage
1. Clone this repository to your local machine using the following command:
-> git clone https://

3. Open the project in your favorite Java IDE.
4. Ensure that you have set up the hibernate.cfg.xml file correctly with your database connection details.
5. Run the Bookmain.java file.
6. Uncomment and modify the code within the main method to test different HQL queries. The code is provided with comments for insertion, update, delete, and retrieval operations.
7. Compile and run the Bookmain.java file to see the results of the HQL queries.

## Demonstration Queries
# 1. Insertion
Book b = new Book();
b.setBname("Java");
b.setBprice(400);
session.save(b);
t.commit();

# 2. Update
Query q = session.createQuery("update Book set bname=:n,bprice=:p where bcode=:c");
q.setParameter("n", "python");
q.setParameter("p", 800);
q.setParameter("c", 2);
int i = q.executeUpdate();
t.commit();

# 3. Delete
Query q = session.createQuery("delete from Book where bcode=:c");
q.setParameter("c", 2);
int i = q.executeUpdate();
t.commit();

# 4. Display Records
Query q = session.createQuery("from Book");
List li = q.list();
for (Object b : li) {
    Book x = (Book) b;
    System.out.println(x.getBcode() + " " + x.getBname() + " " + x.getBprice());
}

# 5. Use of setFirstResult() and setMaxResults()
Query q = session.createQuery("from Book");
q.setFirstResult(0); // Row starts from 0
q.setMaxResults(2);
List li = q.list();
for (Object b : li) {
    Book x = (Book) b;
    System.out.println(x.getBcode() + " " + x.getBname() + " " + x.getBprice());
}

# 6. Find Book Records with Price >= 700
Criteria ct = session.createCriteria(Book.class);
ct.add(Restrictions.ge("bprice", 700));
List li = ct.list();
for (Object b : li) {
    Book x = (Book) b;
    System.out.println(x.getBcode() + " " + x.getBname() + " " + x.getBprice());
}

 # 7. Display Book Record with Highest Price
Query q = session.createQuery("select max(bprice) from Book");
List li = q.list();
System.out.println(li.get(0));




