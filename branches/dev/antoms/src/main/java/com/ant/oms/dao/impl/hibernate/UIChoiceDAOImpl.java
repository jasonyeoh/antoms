package com.ant.oms.dao.impl.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.UIChoiceDAO;
import com.ant.oms.entity.UIChoice;

@Service
public class UIChoiceDAOImpl extends BaseDAOImpl<UIChoice> implements UIChoiceDAO {

	@Override
	protected Class<UIChoice> getEntityClass() {
		return UIChoice.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UIChoice> getByChoiceId(String id, String locale) {
		Criteria c = ec().add(Restrictions.eq("choiceId", id));
		c = c.add(Restrictions.eq("locale", locale));
		return c.list();
	}

	@Override
	public boolean deleteChoice(String choiceId, String locale) {
		if(locale == null || locale.equals("")){
			hql("delete from UIChoice where choiceId=:choiceId and local=:locale")
			.setString("choiceId", choiceId)
			.setString("locale", locale)
			.executeUpdate();
			return true;
			//add(Restrictions.eq("choiceId", choiceId)).add(Restrictions.eq("locale", locale))
		}
		return false;
			
	}

	@Override
	public boolean deleteChoice(String choiceId) {
		hql("delete from UIChoice where choiceId=:choiceId").setString("choiceId", choiceId).executeUpdate();
		return true;
	}
	
	


}
