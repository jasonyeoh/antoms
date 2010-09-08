package com.ant.oms.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.ImageDAO;
import com.ant.oms.entity.Image;
import com.ant.oms.service.ImageService;
@Service
public class ImageServiceImpl implements ImageService{
	@Autowired
	private ImageDAO dao;
	@Override
	public Image createFromPath(String name, String coverImage) {
		Image image = new Image();
		image.setName(name);

		try {
			File img = new File(coverImage);
			FileInputStream fis = new FileInputStream(img);
			byte[] data = new byte[(int) img.length()];
			fis.read(data, 0, (int) img.length());
			image.setData(data);
			image.setImageSize((int) img.length());
			dao.saveNew(image);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
	@Override
	public Image get(Serializable id) {
		return dao.get(id);
	}
	@Override
	public void delete(Image image) {
		dao.delete(image);
		
	}
	public void save(Image image){
		dao.saveNew(image);
	}
	

}
