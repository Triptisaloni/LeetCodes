# Write your MySQL query statement below

select user_id as buyer_id , join_date , sum(case when Year(order_date)=2019 then 1 else 0 end)
as orders_in_2019
from 
users left join orders 
on user_id = buyer_id

group by user_id