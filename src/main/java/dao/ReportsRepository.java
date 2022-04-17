
package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Reports;
@Repository
public interface ReportsRepository extends JpaRepository<Reports, String> {

}
