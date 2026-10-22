# Write your MySQL query statement below
select
    d.name as Department,
    e.name as Employee,
    e.salary
from Employee as e
join Department as d
on e.departmentId= d.id
where salary= (
    select max(salary)
    from Employee
    where departmentId= e.departmentId
) ;