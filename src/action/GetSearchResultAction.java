package action;

import com.opensymphony.xwork2.ActionSupport;

public class GetSearchResultAction extends ActionSupport {
	private String keyword;
	public GetSearchResultAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println();
	}
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}
