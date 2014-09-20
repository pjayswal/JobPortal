package com.mum.jobportal.Idao;

import java.util.List;

import com.mum.jobportal.domain.Vaccancy;

public interface IVaccancyDAO {
	public void create(Vaccancy vaccancy);
	public void update(Vaccancy vaccancy);
	public void delete(Vaccancy vaccancy);
	public Vaccancy get(long id);
	public List<Vaccancy> getAll();
}
