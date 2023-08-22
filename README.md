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
-> git clone https://github.com/your-username/HQLpack.git

2. Open the project in your favorite Java IDE.
3. Ensure that you have set up the hibernate.cfg.xml file correctly with your database connection details.
4. Run the Bookmain.java file.
5. Uncomment and modify the code within the main method to test different HQL queries. The code is provided with comments for insertion, update, delete, and retrieval operations.
6. Compile and run the Bookmain.java file to see the results of the HQL queries.

## Demonstration Queries
# 1. Insertion
Book b = new Book();
b.setBname("Java");
b.setBprice(400);
session.save(b);
t.commit();



