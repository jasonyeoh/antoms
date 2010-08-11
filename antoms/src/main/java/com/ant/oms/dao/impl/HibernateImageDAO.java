package com.ant.oms.dao.impl;

import com.ant.oms.dao.ImageDAO;
import com.ant.oms.entity.Image;

public class HibernateImageDAO extends HibernateBaseDAO<Image> implements ImageDAO{

	@Override
	protected Class<Image> getEntityClass() {
		return Image.class;
	}



	
}
