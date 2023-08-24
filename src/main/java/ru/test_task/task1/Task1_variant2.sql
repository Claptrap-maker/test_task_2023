select surname from employee
where experience = (select distinct(experience) from employee e1
where (select count(distinct(experience)) = 2 from employee e2
where e1.experience <= e2.experience));
