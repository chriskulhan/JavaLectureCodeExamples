/*notes from videos vid_2:

Databases 101: Operations

Databases support many operations on data
Databases allow for new data to be added, data deleted, modified
Query database for specific data

Database operations different types:

Create - add new rows of data
Read -query DB to fetch date
Update - modify existing data
Delete - remove rows


Databases 101 - Constraints (optional but very useful)

Restrictions on what data can be stored
Database will enforce - refuse to add/modify data that violates a constraint
Example constraints
Every email address is unique
A GPA is between 0 and 4
An age is not negative
A review title has a maximum length
A user's role is one of "Student", "Staff" or "Faculty"
The title and author of a book, together, must be unique
Specify constraints when you create a table

Talking to a database: client-server

Client-server: Configure application to connect to a separate database server
The database is managed by a database server application
Your applications connects to the database server as a client
    -More complex to set up, but more powerful and more flexible
    -Many users can connect; users may have different roles and permissions to control access to your data (so must consider authentication and access by users and applications)
    -Database server can be running on your computer, another computer on your network, another computer around the world…
    -Provides suite of management features for accounting, reports etc.
    -Other users/applications can talk to the database: very useful! For example, a web application can store orders in a database, and a shipping application can read that database to dispatch orders; an accounting application can get the value of all the orders; a re-stocking application can use it to figure out what products to order more of…
    -Examples: SQLServer, MySQL, PostgreSQL, Oracle, DB2…

Client-server databases are very common in industry
This is the type of setup you'll probably be working with as a developer

Talking to a database: embedded

OR you can embed the database and database server in your application
    -Simple setup, good for small databases, self-contained
    -Harder for other applications to use to this database
    -This might be a good thing or a bad thing
    -Embedded databases can typically run most CRUD operations but may lack the full set of features in a client/server architecture, e.g. authentication, reporting, auditing, encryption
    -The entire database is stored in one file
    -Examples: SQLite (very common in mobile apps, scripts, small programs, Python scripts…), Derby, H2...

We'll use SQLite for this class

The entire database itself will be a file stored in your file system
A Java library will provide the connection to the database

SQLite - an Embedded Database

-Smaller feature set than MySQL, SQLServer etc.
-Only one connection can edit the database
    -More than one connection can read data
-Only four data types:
    -integer, real (for floating point/double), text, blob
-Easier to set up, good if you don't need the features of a client-server DB
-Very widely used: every mobile device uses SQLite for app database storage
-Your web browser uses it for bookmarks, history
-Boeing uses it on their airplanes
-Commonly used for prototyping and testing in early stages of app development,
    before being switched out for a real client-server DB
-And many, many other applications

DB Connections

-To connect to a database, need to know where it is, and how to talk to it,
    and appropriate authentication credentials
-Provide a connection string in the form of a URI (like a URL) which must
    contain protocol (what type of DB:sqlite) and location of the DB
-A SQLite connection string to a SQLite database called movies.db looks like this
    -protocol = type of database (below sqlite)
    -location = for sqlite, the database file name (below movies.db)
						sqlite:movies.db


-For other databases, it also may contain information like the location of the
    database server, the name of the database, port number, and any authentication
     information needed, e.g. username and password

 */
package org.example.week_9;

public class vid_2_databases_101_operations {
}
