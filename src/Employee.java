import java.util.ArrayList;
import java.util.Collections;

class Employee {
    private String name;
    private String department;
    private int salary;
    
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
public String getDepartment() {
        return department;
    }
    
    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return name + " (" + department + ", " + salary + " 円)";
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(" 田中", " 開発部", 350000));
        employees.add(new Employee(" 鈴木", " 営業部", 380000));
        employees.add(new Employee(" 佐藤", " 開発部", 400000));
        employees.add(new Employee(" 高橋", " 人事部", 320000));
        employees.add(new Employee(" 伊藤", " 開発部", 370000));
        
        //  ここに「開発部」の社員のみを抽出し、給与の高い順にソートするコードを追加
        ArrayList<Employee> devEmployees = new ArrayList<>();

        for (Employee e : employees) {
        	if (e.getDepartment().equals(" 開発部")) {
        		devEmployees.add(e);
        	}
        }
        
        Collections.sort(devEmployees, (e1, e2) -> e2.getSalary() - e1.getSalary());
        
        //  出力結果: [  佐藤 ( 開発部, 400000 円),   伊藤 ( 開発部, 370000 円),   田中 ( 開発部, 350000円)]
        System.out.println(devEmployees);
    }
}