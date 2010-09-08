package com.ant.oms.dao.impl.hibernate;

import org.springframework.stereotype.Service;

import com.ant.oms.dao.ImageDAO;
import com.ant.oms.entity.Image;


@Service
public class ImageDAOImpl extends BaseDAOImpl<Image> implements ImageDAO{

	@Override
	protected Class<Image> getEntityClass() {
		return Image.class;
	}



	
}
