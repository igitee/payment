
package com.igomall.dao;

import com.igomall.entity.Sn;

/**
 * Dao - 序列号
 * 
 * @author IGOMALL  Team
 * @version 1.0
 */
public interface SnDao {

	/**
	 * 生成序列号
	 * 
	 * @param type
	 *            类型
	 * @return 序列号
	 */
	String generate(Sn.Type type);

}