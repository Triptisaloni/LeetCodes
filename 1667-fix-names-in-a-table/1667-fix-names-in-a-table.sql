# Write your MySQL query statement below

# # update users
# # set name = upper(substring(name,1,1))+lower(substring(name,2,1000))
# select * from users
# order by user_id;

select user_id, 
concat(upper(substring(name,1,1)),lower(substring(name,2,length(name)))) as name
from users
order by user_id;