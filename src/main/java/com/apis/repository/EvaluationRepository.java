
package com.apis.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.apis.entity.EvaluationSetting;
public interface EvaluationRepository extends JpaRepository<EvaluationSetting,Long>{}
