
package com.apis.service;
import org.springframework.stereotype.Service;
import com.apis.entity.*;
@Service
public class PredictionService{
public Result calculate(Student s,double mw,double aw){
double pi=(s.getMarks()*mw)+(s.getAssignment()*aw);
String grade=pi>=90?"A+":pi>=80?"A":pi>=70?"B":pi>=60?"C":pi>=50?"D":"F";
String risk=pi<50?"HIGH":pi<70?"MEDIUM":"LOW";
double stability=100-Math.abs(s.getMarks()-s.getAssignment());
Result r=new Result();
r.setStudent(s); r.setPi(pi); r.setGrade(grade); r.setRisk(risk); r.setStability(stability); r.setTrend("Improving");
return r;
}
}
