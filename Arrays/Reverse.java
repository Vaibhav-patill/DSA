mysql> use cse
ERROR 1049 (42000): Unknown database 'cse'
mysql> show databases
    -> ;
+--------------------+
| Database           |
+--------------------+
| college            |
| collegee           |
| information_schema |
| management         |
| mysql              |
| performance_schema |
| sakila             |
| shop               |
| sys                |
| world              |
+--------------------+
10 rows in set (0.03 sec)

mysql> create database cse;
Query OK, 1 row affected (0.02 sec)

mysql> use cse;
Database changed
mysql> CREATE VIEW all_customers AS
    -> SELECT DISTINCT L.branch-name, B.customer-name
    -> FROM borrower B
    -> JOIN loan L ON B.loan-number = L.loan-number
    -> UNION
    -> SELECT DISTINCT A.branch-name, D.customer-name
    -> FROM depositor D
    -> JOIN account A ON D.account-number = A.account-number;
ERROR 1146 (42S02): Table 'cse.borrower' doesn't exist
mysql> CREATE TABLE loan (
    ->     loan_number VARCHAR(20) PRIMARY KEY,
    ->     branch_name VARCHAR(50),
    ->     amount DECIMAL(10, 2)
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> CREATE TABLE borrower (
    ->     customer_name VARCHAR(100),
    ->     loan_number VARCHAR(20),
    ->     FOREIGN KEY (loan_number) REFERENCES loan(loan_number)
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE account (
    ->     account_number VARCHAR(20) PRIMARY KEY,
    ->     branch_name VARCHAR(50),
    ->     balance DECIMAL(10, 2)
    -> );
Query OK, 0 rows affected (0.01 sec)

mysql> CREATE TABLE depositor (
    ->     customer_name VARCHAR(100),
    ->     account_number VARCHAR(20),
    ->     FOREIGN KEY (account_number) REFERENCES account(account_number)
    -> );
Query OK, 0 rows affected (0.01 sec)

mysql> CREATE VIEW all_customers AS
    -> SELECT DISTINCT L.branch_name, B.customer_name
    -> FROM borrower B
    -> JOIN loan L ON B.loan_number = L.loan_number
    -> UNION
    -> SELECT DISTINCT A.branch_name, D.customer_name
    -> FROM depositor D
    -> JOIN account A ON D.account_number = A.account_number;
Query OK, 0 rows affected (0.02 sec)

mysql> INSERT INTO loan (loan_number, branch_name, amount) VALUES
    -> ('L001', 'downtown', 5000.00),
    -> ('L002', 'uptown', 3000.00),
    -> ('L003', 'downtown', 7000.00),
    -> ('L004', 'suburb', 2000.00),
    -> ('L005', 'uptown', 4500.00);
Query OK, 5 rows affected (0.02 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> INSERT INTO borrower (customer_name, loan_number) VALUES
    -> ('Vaibhav', 'L001'),
    -> ('Wasif', 'L002'),
    -> ('Jyoti', 'L003'),
    -> ('Shreyas', 'L001'),
    -> ('Ankit', 'L004'),
    -> ('Harsh', 'L005');
Query OK, 6 rows affected (0.01 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> INSERT INTO account (account_number, branch_name, balance) VALUES
    -> ('A001', 'downtown', 1500.00),
    -> ('A002', 'uptown', 2000.00),
    -> ('A003', 'suburb', 3000.00),
    -> ('A004', 'downtown', 2500.00),
    -> ('A005', 'uptown', 1000.00);
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> INSERT INTO depositor (customer_name, account_number) VALUES
    -> ('Vaibhav', 'A001'),
    -> ('Wasif', 'A002'),
    -> ('Jyoti', 'A003'),
    -> ('Shreyas', 'A001'),
    -> ('Ankit', 'A004'),
    -> ('Harsh', 'A005');
Query OK, 6 rows affected (0.01 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> CREATE VIEW all_customers AS
    -> SELECT DISTINCT L.branch_name, B.customer_name
    -> FROM borrower B
    -> JOIN loan L ON B.loan_number = L.loan_number
    -> UNION
    -> SELECT DISTINCT A.branch_name, D.customer_name
    -> FROM depositor D
    -> JOIN account A ON D.account_number = A.account_number;
ERROR 1050 (42S01): Table 'all_customers' already exists
mysql> drop table all_customers;
ERROR 1051 (42S02): Unknown table 'cse.all_customers'
mysql> drop table cse.all_customers;
ERROR 1051 (42S02): Unknown table 'cse.all_customers'
mysql> drop table all_customers;
ERROR 1051 (42S02): Unknown table 'cse.all_customers'
mysql> show tables;
+---------------+
| Tables_in_cse |
+---------------+
| account       |
| all_customers |
| borrower      |
| depositor     |
| loan          |
+---------------+
5 rows in set (0.01 sec)

mysql> delete table all_customers;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table all_customers' at line 1
mysql> drop table all_customers;
ERROR 1051 (42S02): Unknown table 'cse.all_customers'
mysql> DROP VIEW IF EXISTS all_customers;
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE VIEW all_customers AS
    -> SELECT DISTINCT L.branch_name, B.customer_name
    -> FROM borrower B
    -> JOIN loan L ON B.loan_number = L.loan_number
    -> UNION
    -> SELECT DISTINCT A.branch_name, D.customer_name
    -> FROM depositor D
    -> JOIN account A ON D.account_number = A.account_number;
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT customer_name
    -> FROM all_customers
    -> WHERE branch_name = 'downtown'
    -> ORDER BY customer_name ASC;
+---------------+
| customer_name |
+---------------+
| Ankit         |
| Jyoti         |
| Shreyas       |
| Vaibhav       |
+---------------+
4 rows in set (0.01 sec)

mysql> CREATE VIEW branch_loan_totals AS
    -> SELECT branch_name, SUM(amount) AS total_loan_amount
    -> FROM loan
    -> GROUP BY branch_name;
Query OK, 0 rows affected (0.01 sec)

mysql> desc branch_loan_totals;
+-------------------+---------------+------+-----+---------+-------+
| Field             | Type          | Null | Key | Default | Extra |
+-------------------+---------------+------+-----+---------+-------+
| branch_name       | varchar(50)   | YES  |     | NULL    |       |
| total_loan_amount | decimal(32,2) | YES  |     | NULL    |       |
+-------------------+---------------+------+-----+---------+-------+
2 rows in set (0.01 sec)

mysql> desc all_customers;
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| branch_name   | varchar(50)  | YES  |     | NULL    |       |
| customer_name | varchar(100) | YES  |     | NULL    |       |
+---------------+--------------+------+-----+---------+-------+
2 rows in set (0.06 sec)

mysql> SELECT SUM(amount) AS total_loan_amount
    -> FROM loan;
+-------------------+
| total_loan_amount |
+-------------------+
|          21500.00 |
+-------------------+
1 row in set (0.00 sec)

mysql> selectt * from view all_customers;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'selectt * from view all_customers' at line 1
mysql> selectt * from all_customers;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'selectt * from all_customers' at line 1
mysql> select * from all_customers;
+-------------+---------------+
| branch_name | customer_name |
+-------------+---------------+
| downtown    | Vaibhav       |
| downtown    | Shreyas       |
| uptown      | Wasif         |
| downtown    | Jyoti         |
| suburb      | Ankit         |
| uptown      | Harsh         |
| suburb      | Jyoti         |
| downtown    | Ankit         |
+-------------+---------------+
8 rows in set (0.02 sec)

mysql> create table branch();
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 1
mysql> CREATE TABLE branch (
    ->     branch_name VARCHAR(50) PRIMARY KEY,
    ->     branch_city VARCHAR(50),
    ->     assets DECIMAL(15, 2)
    -> );
Query OK, 0 rows affected (0.07 sec)

mysql> INSERT INTO branch (branch_name, branch_city, assets) VALUES
    -> ('Downtown Branch', 'Pune', 1500000.00),
    -> ('Uptown Branch', 'Kolhapur', 2000000.00),
    -> ('Central Branch', 'Mumbai', 5000000.00),
    -> ('North Branch', 'Delhi', 3000000.00),
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 5
mysql> ('North Branch', 'Delhi', 3000000.00);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''North Branch', 'Delhi', 3000000.00)' at line 1
mysql> INSERT INTO branch (branch_name, branch_city, assets) VALUES
    -> ('Downtown Branch', 'Pune', 1500000.00),
    -> ('Uptown Branch', 'Kolhapur', 2000000.00),
    -> ('Central Branch', 'Mumbai', 5000000.00),
    -> ('North Branch', 'Delhi', 3000000.00);
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> -- Assuming loan numbers L001, L002, and L003 are available.
mysql> INSERT INTO loan (loan_number, branch_name, amount) VALUES
    -> ('L006', 'downtown', 4000.00),
    -> ('L007', 'uptown', 2500.00),
    -> ('L008', 'suburb', 6000.00);
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO borrower (customer_name, loan_number) VALUES
    -> ('Smith', 'L006'),
    -> ('Ram', 'L007'),
    -> ('Jones', 'L008');
Query OK, 3 rows affected (0.02 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> -- Assuming account numbers A006, A007, and A008 are available.
mysql> INSERT INTO account (account_number, branch_name, balance) VALUES
    -> ('A006', 'downtown', 3000.00),
    -> ('A007', 'uptown', 1500.00),
    -> ('A008', 'suburb', 5000.00);
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO depositor (customer_name, account_number) VALUES
    -> ('Smith', 'A006'),
    -> ('Ram', 'A007'),
    -> ('Jones', 'A008');
Query OK, 3 rows affected (0.00 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT DISTINCT D.customer_name
    -> FROM depositor D
    -> JOIN account A ON D.account_number = A.account_number
    -> WHERE A.balance = (SELECT A2.balance
    ->                    FROM account A2
    ->                    JOIN depositor D2 ON A2.account_number = D2.account_number
    ->                    WHERE D2.customer_name = 'Ram');
+---------------+
| customer_name |
+---------------+
| Vaibhav       |
| Shreyas       |
| Ram           |
+---------------+
3 rows in set (0.00 sec)

mysql> UPDATE account A
    -> SET A.balance = A.balance * 1.05
    -> WHERE A.account_number IN (SELECT account_number
    ->                             FROM depositor
    ->                             WHERE customer_name = 'Smith');
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT DISTINCT D.customer_name
    -> FROM depositor D
    -> WHERE D.account_number NOT IN (SELECT loan_number
    ->                                  FROM borrower);
+---------------+
| customer_name |
+---------------+
| Vaibhav       |
| Wasif         |
| Jyoti         |
| Shreyas       |
| Ankit         |
| Harsh         |
| Smith         |
| Ram           |
| Jones         |
+---------------+
9 rows in set (0.01 sec)

mysql> SELECT DISTINCT D.customer_name
    -> FROM depositor D
    -> WHERE D.account_number IN (SELECT A.account_number
    ->                             FROM account A
    ->                             JOIN borrower B ON A.account_number = B.loan_number);
Empty set (0.00 sec)

mysql> SELECT branch_name
    -> FROM branch
    -> WHERE assets > (SELECT MAX(assets)
    ->                  FROM branch
    ->                  WHERE branch_city = 'Kolhapur');
+----------------+
| branch_name    |
+----------------+
| Central Branch |
| North Branch   |
+----------------+
2 rows in set (0.01 sec)