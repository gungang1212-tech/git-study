SELECT * FROM employees;
SELECT * FROM salaries;

SELECT B.emp_no, A.salary
FROM employees AS B
JOIN salaries AS A ON A.emp_no = B.emp_no;

// do-while문
//	-조건식과 상관없이 최초 1번은 무조건 실행
//	- 참, 거짓을 판단하기 전에 무조건 1번 이상 실행해야 할 코드가 있을 경우 사용