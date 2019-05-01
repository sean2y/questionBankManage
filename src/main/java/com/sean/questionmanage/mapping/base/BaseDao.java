package com.sean.questionmanage.mapping.base;

import java.util.List;

/**
 * 统一底层DAO支持类实现
 * @author Sean
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * 新增数据
	 * @param entity
	 */
	public void insert(T entity);
	
	/**
	 * 根据标识删除数据
	 * @param guid
	 */
	public void delete(String guid);
	
	/**
	 * 修改数据
	 * @param entity
	 */
	public void update(T entity);
	
	/**
	 * 获取单一数据
	 * @param entity
	 * @return
	 */
	public T get(T entity);
	
	/**
	 * 获取所有数据
	 * @param entity
	 * @return
	 */
	public List<T> getAllList(T entity);
	
	/**
	 * 分页获取所有数据
	 * @param entity
	 * @return
	 */
	public List<T> getListByPage(T entity);
	
	/**
	 * 获取数据总数
	 * @param entity
	 * @return
	 */
	public Long getCount(T entity);
}
