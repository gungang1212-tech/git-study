SELECT * FROM employees
ORDER BY birth_date ;

SELECT * FROM titles 
ORDER BY to_date DESC;
    
SELECT MAX(salary) FROM salaries;
SELECT min(salary) AS '부자' FROM salaries ;
SELECT TRUNCATE(avg(salary),0   ) FROM salaries ;
SELECT sum(salary) FROM salaries ;
SELECT COUNT(*) FROM SALARIES;

SELECT COUNT(*) AS '직원 수' FROM EMPLOYEES;

SELECT count(*) AS '엔지니어 수'FROM TITLES
WHERE title = 'Engineer';

SELECT count(*) AS '1965년 이후' FROM employees
WHERE hire_date >= '1965-01-01';

-- 부서별 직원 수 구하기
-- 	- 직원 번호(emp_no),부서 번호 (dept_no)조회

SELECT count(*), dept_no FROM dept_emp
GROUP BY dept_no;


SELECT count(*) AS "cnt" ,gender FROM employees
GROUP BY gender ;

SELECT count(*) AS "직원 수",title FROM titles
GROUP BY title
ORDER BY title DESC;


SELECT count(*) AS "직원 수",title FROM titles

GROUP BY title
HAVING count(*) >= 100000
ORDER BY title DESC;

-- dept_emp

SELECT count(*), dept_no FROM dept_emp
GROUP BY dept_no
HAVING count(*) >= 50000;

-- 현재 재직중인 직원들 중 직무별 직원 수가 200명 미만인 직무만 조회
-- to_date가 9999-01-01이 재직중

SELECT title, count(*) FROM titles
WHERE to_date = '9999-01-01'
GROUP BY title
HAVING count(*) < 200;
GROUP BY title;  