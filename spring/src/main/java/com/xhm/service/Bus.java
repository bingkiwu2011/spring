package com.xhm.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Bus {

	public java.lang.String getReceivedMsg(@WebParam(name = "account") java.lang.String account,
			@WebParam(name = "password") java.lang.String password, @WebParam(name = "param") int param);

	public int modifyPassword(@WebParam(name = "account") java.lang.String account, @WebParam(name = "oldPassword") java.lang.String oldPassword,
			@WebParam(name = "newPassword") java.lang.String newPassword);

	public java.lang.String getReceipt(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "taskID") int taskID);

	public int sendBatchMessage(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "destmobile") java.lang.String destmobile, @WebParam(name = "msgText") java.lang.String msgText);

	public int validateUser(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password);

	public int sendMessage(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "destmobile") java.lang.String destmobile, @WebParam(name = "msgText") java.lang.String msgText);

	public int sendTimelyMessage(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "sendDateTime") java.lang.String sendDateTime, @WebParam(name = "destmobile") java.lang.String destmobile,
			@WebParam(name = "msgText") java.lang.String msgText);

	public int sendMmsMessages(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "phones") java.lang.String phones, @WebParam(name = "mmsString") java.lang.String mmsString);

	public java.lang.String getUserInfo(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password);

	public int sendPersonalMessages(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "destMobiles") java.lang.String destMobiles, @WebParam(name = "msgContents") java.lang.String msgContents);

	public int gxmt(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "sendDateTime") java.lang.String sendDateTime, @WebParam(name = "destmobiles") java.lang.String destmobiles,
			@WebParam(name = "msgTexts") java.lang.String msgTexts);

	public int sendAudio(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "sendDateTime") java.lang.String sendDateTime, @WebParam(name = "destmobile") java.lang.String destmobile,
			@WebParam(name = "msgText") java.lang.String msgText, @WebParam(name = "srcMobile") java.lang.String srcMobile);

	public int sendBatchMessageTimelyExt(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "sendDateTime") java.lang.String sendDateTime, @WebParam(name = "destmobile") java.lang.String destmobile,
			@WebParam(name = "msgText") java.lang.String msgText, @WebParam(name = "ext") java.lang.String ext);

	public int sendGjBatchMessage(@WebParam(name = "account") java.lang.String account, @WebParam(name = "password") java.lang.String password,
			@WebParam(name = "sendDateTime") java.lang.String sendDateTime, @WebParam(name = "destmobile") java.lang.String destmobile,
			@WebParam(name = "msgText") java.lang.String msgText);

}
