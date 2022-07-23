package neipclova.survey.repository;

import neipclova.survey.domain.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    //@Query("select count(distinct v ) from Visitor v")
    //Integer countDistinct();

    @Query("select v from Visitor v where v.id = :visitor_id")
    public Visitor findOne(@Param("visitor_id") Long visitor_id);

}