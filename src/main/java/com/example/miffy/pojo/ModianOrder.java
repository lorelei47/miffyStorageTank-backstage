package com.example.miffy.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 摩点订单表
 * @author lorelei
 * @date 2018/11/29 10:35
 */
public class ModianOrder implements Serializable {
	private Integer modianOrderId;
	private Integer modianUserId;
	private Date payTime;
	private Double backer_money;
	private Integer modianProjectId;

}
