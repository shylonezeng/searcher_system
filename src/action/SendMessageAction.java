package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.log4j.PropertyConfigurator;
import org.apache.struts2.ServletActionContext;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;
import org.apache.log4j.Logger;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


//PropertyConfigurator.configure(".\\src\\log4j.properties");

public class SendMessageAction extends ActionSupport{
	static Logger logger=Logger.getLogger("my_logger");//Logger.getLogger("MyLogger")

	private String name;
	private String passwd;
	private String user_json;
	public SendMessageAction() {
		// TODO Auto-generated constructor stub
		super();
		//
		ActionContext context=ActionContext.getContext();
		HttpServletRequest request=ServletActionContext.getRequest();//(HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);
		String context_path="";
		try{
			context_path=request.getContextPath();
		}
		catch(Exception e){
		}
		System.out.print(context_path);
		PropertyConfigurator.configure(context_path+"\\WEB-INF\\classes\\log4j.properties");

	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//System.out.print("debug message from system output");
	    logger.debug("msg from apache logger\n");
	    ActionContext context=ActionContext.getContext();
	    HttpServletRequest request=(HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);
	    String name="empty name";
	    String passwd="empty passwd";
	    
	    try{
	    	name=request.getParameter("name");
	    	passwd=request.getParameter("passwd");
	    }
	    catch(Exception e){
	    	
	    }
	    
	    
	    context.getSession().put("session_name",name);
	    context.getSession().put("session_passwd",passwd);
		
	    return SUCCESS;
	    //return mapping.findForward("successSent");
	} 
	
	public void returnJson() throws IOException{
		//write self-defined string bytes to client
	    HttpServletResponse response=ServletActionContext.getResponse();
        response.setContentType("text/html");
        PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(null == response)
		{
			logger.info("response is NULL");
			return ;
		}
		out.write(this.toJsonString());
	    out.flush();
	    out.close();
	}
	
	
	
	/**getters and setters*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	

	public String toJsonString() throws IOException {
		// TODO Auto-generated method stub
		HashMap<String,String>  map=new HashMap<String,String>();
		
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("name", name);
		jsonObj.put("passwd",passwd);
		return jsonObj.toString();
	}
	

}
