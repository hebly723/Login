package Action;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class action extends ActionSupport
implements RequestAware, SessionAware, ApplicationAware{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	public String info = "You can see this!";
	public Model.model user = new Model.model();
	
//	private String name;
//	private String password;
	//execute method(1)
	public String execute() throws Exception{
		System.out.println("用户名："+this.user.getName()+"\n密码："+this.user.getPassword());
		if (this.user.getName().equals("Dick")&&this.user.getPassword().equals("Free"))
			return ActionSupport.SUCCESS;
		else
			return ActionSupport.ERROR;
	}
	
	//execute method(2)
	public String login() throws Exception{
		System.out.println("用户名："+this.user.getName()+"\n密码："+this.user.getPassword());
		String name = "Kytlin";
		//this.session.put("gg", name);
		System.out.println(name+"什么情况");
		if (this.user.getName().equals("Dick")&&this.user.getPassword().equals("dick"))
			return ActionSupport.SUCCESS;
		else
			return ActionSupport.ERROR;
	}
	
	//execute method(3)
	public String add() throws Exception{
		info = "添加用户信息";
		return "add";
	}
	
	//execute method(4)
	public String update() throws Exception{
		info = "更新用户信息";
		return "update";
	}
	@Override
	public void setApplication(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.application = application;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
//	//getter and setters
//	public String getName() {
//		return name;
//	}
//	public void setName(String userName) {
//		this.name = userName;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getInfo() {
//		return info;
//	}
//
//	public void setInfo(String info) {
//		this.info = info;
//	}
}
