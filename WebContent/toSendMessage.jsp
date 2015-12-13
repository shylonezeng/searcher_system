<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; ">
<%@ taglib prefix="s" uri="/struts-tags" %>
<script src="http://code.jquery.com/jquery-2.1.1.js"> </script>

<script>
/*
	$(document).ready(function(){
		$("#sendMessage_but").click(function(){
					var sendReqUrl="<s:url action="sendMessage.action"/>";
					alert("确定发送，url:"+sendReqUrl);
					//开始请求发送短信
					$.get(sendReqUrl,function(data,status){
						alert("已经成功发送短信");						
					});
		});
	});
	*/
	$(document).ready(function(){
	    $("#sendMessage_but").click(function(){
	    	var sendReqUrl="<s:url action="sendMessage.action"/>";
	        $.get(sendReqUrl,function(data,status){
	        alert("成功发送信息\n"+"数据：" + data + "\n状态：" + status);

	    });
	  });
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="test.action">
		<input type="text" name="username" >
		<input type="submit" name="Submit" >
	</form>

	<button id="sendMessage_but">点击发送理财经理名片到您手机</button>
	<a href="<s:url action="sendMessage.action"/>">点击发送信息</a>
</body>

</html>