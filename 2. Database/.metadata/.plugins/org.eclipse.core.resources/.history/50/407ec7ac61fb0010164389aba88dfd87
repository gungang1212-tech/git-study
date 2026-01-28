-- 사번, 이름, 연봉 조회
SELECT *
FROM employees e
JOIN salaries s
ON e.emp_no = s.emp_no
WHERE s.to_date = '9999-01-01';

-- 사번, 이름, 직무 조회 (현재 재직중인)
SELECT e.emp_no, first_name, title
FROM employees e
JOIN titles t
ON e.emp_no = t.emp_no
WHERE to_date = '9999-01-01';

-- 사번, 이름, 연봉, 직무
SELECT *
FROM employees e
JOIN salaries s 
ON e.emp_no = s.emp_no
JOIN titles t
ON e.emp_no = t.emp_no;

SELECT * FROM titles;

-- Q6. 부서 이름(dept_name)과 부서별 사원 수(count)를 조회하세요.
--  - dept_name 컬럼은 departments 테이블에 있음
--  - dept_emp에 사원 수(emp_no의 수)가 있음
SELECT *
FROM employees e
JOIN dept_emp de ON e.emp_no = de.emp_no
JOIN departments d ON de.dept_no = d.dept_no ;





















