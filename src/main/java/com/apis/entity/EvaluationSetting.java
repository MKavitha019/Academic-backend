
package com.apis.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity @Data
public class EvaluationSetting{
@Id @GeneratedValue
private Long id;
private double marksWeight=0.6;
private double assignmentWeight=0.4;
}
