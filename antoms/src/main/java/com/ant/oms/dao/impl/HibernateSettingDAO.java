package com.ant.oms.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.SettingDAO;
import com.ant.oms.entity.Setting;
@Service
public class HibernateSettingDAO extends HibernateBaseDAO<Setting> implements SettingDAO{

	@Override
	public Setting getSettingForKey(String key) {
		return (Setting)ec().add(Restrictions.eq("key", key)).uniqueResult();
	}

	@Override
	public Setting getSettingForKey(String key, String namespace) {
		return (Setting)ec().add(Restrictions.eq("key", key)).add(Restrictions.eq("namespace", namespace)).uniqueResult();
	}

	@Override
	protected Class<Setting> getEntityClass() {
		return Setting.class;
	}

}
