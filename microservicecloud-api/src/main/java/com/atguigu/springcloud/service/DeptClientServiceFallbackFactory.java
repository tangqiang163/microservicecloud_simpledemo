package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptFeignClientService>
{
	@Override
	public DeptFeignClientService create(Throwable throwable)
	{
		return new DeptFeignClientService() {
			@Override
			public Dept get(long id)
			{

				Dept dept = new Dept("该ID：\" + id + \"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
				dept.setDeptno(id);
				dept.setDb_source("no this database in MySQL");
				return dept;
			}

			@Override
			public List<Dept> list()
			{
				return null;
			}

			@Override
			public boolean add(Dept dept)
			{
				return false;
			}
		};
	}
}
