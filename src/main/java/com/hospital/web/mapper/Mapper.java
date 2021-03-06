package com.hospital.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hospital.web.domain.Article;
import com.hospital.web.domain.Chart;
import com.hospital.web.domain.Doctor;
import com.hospital.web.domain.Info;
import com.hospital.web.domain.Nurse;
import com.hospital.web.domain.Patient;
import com.hospital.web.domain.Person;
@Repository
public interface Mapper {
	public int registPatient(Object o)throws Exception;
	public int registDoctor(Object o)throws Exception;
	public int registNurse(Object o)throws Exception;
	public int registerChartFile(Object o)throws Exception;
	public Patient findPatient(Map<?,?>map) throws Exception;
	public Doctor findDoctor(Map<?,?>map) throws Exception;
	public Nurse findNurse(Map<?,?>map) throws Exception;
	public List<Chart> chartList(Map<?,?>map) throws Exception;
	public List<Patient> findPatients(Map<?,?>map) throws Exception;
	public List<Doctor> findDoctors(Map<?,?>map) throws Exception;
	public List<Nurse> findNurses(Map<?,?>map) throws Exception;
	public List<Article> articleList(Map<?,?> Hashmap)throws Exception;
	public int updatePatient(Patient patient)throws Exception;
	public int updateDoctor(Doctor doctor)throws Exception;
	public int updateNurse(Nurse nurse)throws Exception;
	public int delete(Map<?,?>map)throws Exception;
	public int count(Map<?,?>map)throws Exception;
	public int exist(Map<?,?>map)throws Exception;
	public Object findAdmin(Object object);
}
