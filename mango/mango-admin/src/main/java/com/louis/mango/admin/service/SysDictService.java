package com.louis.mango.admin.service;

import java.util.List;

import com.louis.mango.admin.model.SysDict;
import com.louis.mango.core.service.CurdService;

/**
 * 字典管理
 * @author jjc
 * @date Aug 15, 2020
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
