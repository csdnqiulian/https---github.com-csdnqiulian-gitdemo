package com.modules.sys.dao;

import java.util.List;
import com.common.persistence.CrudDao;
import com.common.persistence.annotation.MyBatisDao;
import com.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author admin
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
