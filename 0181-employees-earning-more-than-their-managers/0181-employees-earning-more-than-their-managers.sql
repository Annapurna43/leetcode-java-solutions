/* Write your PL/SQL query statement below */
select name as employee from employee e where salary>(select salary from employee e2 where e2.id = e.managerid );