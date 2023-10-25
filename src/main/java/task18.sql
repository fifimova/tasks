SELECT depatrment, count(*) as number_employees, MAX(salary) as max_salary, AVG(salary) as avg_salary
FROM employee
GROUP BY department
HAVING count(*) > 1