SELECT depatrment, count(*) as number_employees, MAX(salary) as max_salary, AVG(salary) as avg_salary
FROM employee
GROUP BY department
HAVING count(*) > 1;


-- Есть таблица employee с колонками name, department, salary.
-- Вывести максимальную и среднюю зарплату (salary) по каждому отделу, имеющему больше одного сотрудника.