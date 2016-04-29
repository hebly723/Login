package Action;
import com.opensymphony.xwork2.ActionSupport;

public class userAction {
	private String name;
	private String password;
	public String info;
	
	//execute method(1)
	public String execute() throws Exception{
		System.out.println("用户名："+this.name+"\n密码："+this.password);
		if (getName().equals("Dick")&&getPassword().equals("Free"))
			return ActionSupport.SUCCESS;
		else
			return ActionSupport.ERROR;
	}
	
	//execute method(2)
	public String login() throws Exception{
		System.out.println("用户名："+this.name+"\n密码："+this.password);
		if (getName().equals("Dick")&&getPassword().equals("dick"))
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
	
	//getter and setters
	public String getName() {
		return name;
	}
	public void setName(String userName) {
		this.name = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
