# # Write your MySQL query statement below

# SELECT id, 'Root' as type FROM Tree where p_id is null
# UNION
# SELECT id, 'Inner' as type FROM Tree where id in (SELECT p_id from Tree where p_id is not null) AND p_id is not null
# UNION
# SELECT id, 'Leaf' as type FROM Tree where id not in (SELECT p_id from Tree where p_id is not null) AND p_id is not null


select id, case
    when p_id is null then "Root"
    when id in(select p_id from tree) then "Inner"
    else "Leaf"
    end as type
from tree
order by id;