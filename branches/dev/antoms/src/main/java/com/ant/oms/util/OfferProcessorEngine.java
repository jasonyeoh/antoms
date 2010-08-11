package com.ant.oms.util;

import com.ant.oms.entity.Order;

public interface OfferProcessorEngine {
	public void process(Order order, OMS context);
}
