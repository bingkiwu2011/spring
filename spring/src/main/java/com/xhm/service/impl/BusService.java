/** 
* @Title: BusService.java 
* @Package com.xhm.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* Copyright: Copyright (c)2009 
* Company:上海建周 
* @author bingki 
* @date 2015年9月29日 下午3:38:06 
*@version 1.0 
*/
package com.xhm.service.impl;

import javax.jws.WebService;

import com.xhm.service.Bus;

/** 
* @ClassName: BusService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author bingki 
* @date 2015年9月29日 下午3:38:06  
*/
@WebService
public class BusService implements Bus {

	/* （非 Javadoc）
	* <p>Title: getReceivedMsg</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param param
	* @return
	* @see com.xhm.service.IBus#getReceivedMsg(java.lang.String, java.lang.String, int)
	*/
	@Override
	public String getReceivedMsg(String account, String password, int param) {
		// TODO Auto-generated method stub
		return null;
	}

	/* （非 Javadoc）
	* <p>Title: modifyPassword</p>
	* <p>Description:</p>
	* @param account
	* @param oldPassword
	* @param newPassword
	* @return
	* @see com.xhm.service.IBus#modifyPassword(java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int modifyPassword(String account, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: getReceipt</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param taskID
	* @return
	* @see com.xhm.service.IBus#getReceipt(java.lang.String, java.lang.String, int)
	*/
	@Override
	public String getReceipt(String account, String password, int taskID) {
		// TODO Auto-generated method stub
		return null;
	}

	/* （非 Javadoc）
	* <p>Title: sendBatchMessage</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param destmobile
	* @param msgText
	* @return
	* @see com.xhm.service.IBus#sendBatchMessage(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int sendBatchMessage(String account, String password, String destmobile, String msgText) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: validateUser</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @return
	* @see com.xhm.service.IBus#validateUser(java.lang.String, java.lang.String)
	*/
	@Override
	public int validateUser(String account, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: sendMessage</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param destmobile
	* @param msgText
	* @return
	* @see com.xhm.service.IBus#sendMessage(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int sendMessage(String account, String password, String destmobile, String msgText) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: sendTimelyMessage</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param sendDateTime
	* @param destmobile
	* @param msgText
	* @return
	* @see com.xhm.service.IBus#sendTimelyMessage(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int sendTimelyMessage(String account, String password, String sendDateTime, String destmobile, String msgText) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: sendMmsMessages</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param phones
	* @param mmsString
	* @return
	* @see com.xhm.service.IBus#sendMmsMessages(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int sendMmsMessages(String account, String password, String phones, String mmsString) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: getUserInfo</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @return
	* @see com.xhm.service.IBus#getUserInfo(java.lang.String, java.lang.String)
	*/
	@Override
	public String getUserInfo(String account, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/* （非 Javadoc）
	* <p>Title: sendPersonalMessages</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param destMobiles
	* @param msgContents
	* @return
	* @see com.xhm.service.IBus#sendPersonalMessages(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int sendPersonalMessages(String account, String password, String destMobiles, String msgContents) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: gxmt</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param sendDateTime
	* @param destmobiles
	* @param msgTexts
	* @return
	* @see com.xhm.service.IBus#gxmt(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int gxmt(String account, String password, String sendDateTime, String destmobiles, String msgTexts) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: sendAudio</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param sendDateTime
	* @param destmobile
	* @param msgText
	* @param srcMobile
	* @return
	* @see com.xhm.service.IBus#sendAudio(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int sendAudio(String account, String password, String sendDateTime, String destmobile, String msgText, String srcMobile) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: sendBatchMessageTimelyExt</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param sendDateTime
	* @param destmobile
	* @param msgText
	* @param ext
	* @return
	* @see com.xhm.service.IBus#sendBatchMessageTimelyExt(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int sendBatchMessageTimelyExt(String account, String password, String sendDateTime, String destmobile, String msgText, String ext) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* （非 Javadoc）
	* <p>Title: sendGjBatchMessage</p>
	* <p>Description:</p>
	* @param account
	* @param password
	* @param sendDateTime
	* @param destmobile
	* @param msgText
	* @return
	* @see com.xhm.service.IBus#sendGjBatchMessage(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	@Override
	public int sendGjBatchMessage(String account, String password, String sendDateTime, String destmobile, String msgText) {
		// TODO Auto-generated method stub
		return 0;
	}

}
