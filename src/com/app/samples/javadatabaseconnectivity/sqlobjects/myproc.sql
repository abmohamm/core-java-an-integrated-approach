CREATE OR REPLACE PROCEDURE ABMOHAMM.myproc(p_empid IN NUMBER, updatedSalary OUT number) AS 
v_salary NUMBER;
BEGIN
	SELECT salary INTO v_salary FROM emptab WHERE empid = p_empid;
	updatedSalary := v_salary + 1000;
    update emptab set salary = updatedSalary where empid = p_empid;
END;