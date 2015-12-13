package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TestAction  extends ActionSupport 
			implements ServletRequestAware {
	
	private HttpServletRequest request;
	private String username;
	
	public String execute(){
		username = request.getParameter("username");
		return "welcome";
	}

	
	
	public HttpServletRequest getRequest() {
		return request;
	}



	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.request = req;
	}

}
