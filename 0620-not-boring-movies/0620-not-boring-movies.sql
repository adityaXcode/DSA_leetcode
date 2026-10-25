# Write your MySQL query statement below
select*
from (
    select *
    from Cinema
    where id%2!= 0 and description != 'boring' 
    ) as a
order by rating desc ;

