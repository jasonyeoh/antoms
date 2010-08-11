package com.ant.oms.service;

import java.io.Serializable;

import com.ant.oms.entity.Image;

public interface ImageService {
	public Image createFromPath(String name, String coverImage);
	public Image get(Serializable id);
	public void delete(Image image);
}
