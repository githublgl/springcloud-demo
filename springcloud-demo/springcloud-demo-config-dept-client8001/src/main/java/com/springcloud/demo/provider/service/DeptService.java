package com.springcloud.demo.provider.service;

import java.util.List;

import com.springcloud.demo.entities.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
