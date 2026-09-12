# Write your MySQL query statement below
SELECT(SELECT MAX(salary) FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee))AS SecondHighestSalary;

-- SELECT (
--     SELECT MAX(salary)
--     FROM Employee
--     WHERE salary < (
--         SELECT MAX(salary)
--         FROM Employee
--     )
-- ) AS SecondHighestSalary;