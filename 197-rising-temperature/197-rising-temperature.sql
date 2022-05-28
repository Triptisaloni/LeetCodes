# Write your MySQL query statement below
select t1.id from weather t1, weather t2
where
# t1.id = t2.id-1 
datediff(t1.recorddate , t2.recorddate)=1
and t1.temperature> t2.temperature