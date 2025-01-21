# Write your MySQL query statement below

# create a temporary result set RankedSalaries
WITH RankedSalaries AS(
    SELECT d.name AS Department, e.name AS Employee, salary AS Salary,
    DENSE_RANK() OVER(PARTITION BY departmentId ORDER BY salary DESC) AS Raank
    FROM Employee e
    INNER JOIN Department d
    ON e.departmentId = d.id
)
# this the main query which uses the result of the temporary result set
SELECT Department, Employee, Salary
FROM RankedSalaries
WHERE Raank <= 3;