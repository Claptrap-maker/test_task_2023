SELECT surname FROM employee
WHERE experience = (SELECT DISTINCT(experience) FROM employee as e1
WHERE (SELECT COUNT(DISTINCT(experience))=2 FROM employee as e2
WHERE e1.experience <= e2.experience));
