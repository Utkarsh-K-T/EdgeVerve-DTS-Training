show databases;
use cart;
CREATE TABLE books (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    price INT
);

select * from books;
select max(price) from books; 
select min(price) from books; 
select avg(price) from books; 
select sum(price) from books;

CALL insertBook(1, 'The Great Gatsby', 20);
call findAll();
call updateBookById (1, 'AAAAA', 700); 
call findBookNameByID(1,@name);
select @name;

SELECT findPriceByID(1) AS Price;