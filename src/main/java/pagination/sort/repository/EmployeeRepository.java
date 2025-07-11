package pagination.sort.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pagination.sort.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
