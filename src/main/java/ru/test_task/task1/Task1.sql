select surname
from employee
where experience =
(select max(experience)
from employee
where experience < (select max(experience) from employee));