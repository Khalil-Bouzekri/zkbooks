/* FakeSearchService.java

	Purpose:
		
	Description:
		
	History:
		2011/10/25 Created by Dennis Chen

Copyright (C) 2011 Potix Corporation. All Rights Reserved.
 */
package org.zkoss.reference.developer.spring.order.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hawk
 * 
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;
	

	public List<Order> list() {
		return orderDao.findAll();
	}

}
