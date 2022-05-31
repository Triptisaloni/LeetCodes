# Write your MySQL query statement below

select name , sum(amount) as balance from transactions t, users u
where t.account= u.account
group by name
having balance > 10000