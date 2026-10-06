CREATE OR REPLACE FUNCTION ABMOHAMM.myfunc(p_empid IN NUMBER) RETURN NUMBER IS 
v_salary NUMBER;
updatedSalary NUMBER;
PRAGMA AUTONOMOUS_TRANSACTION;
BEGIN
	SELECT salary INTO v_salary FROM emptab WHERE empid = p_empid;
	updatedSalary := v_salary + 1000;
	update emptab set salary = updatedSalary where empid = p_empid;
    COMMIT;
	RETURN updatedSalary;
END;