# Write your MySQL query statement below

select Max(salary) as SecondHighestSalary
from employee where 
salary not in (select MAX(salary) from employee);