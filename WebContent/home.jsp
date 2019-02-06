<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="center">
            <form id="RegisterLogin" action="LoginRegister" name="login" onsubmit="return ShowResults()">

                <div class="sign_up_input" >
                    <label> Username </label>
                    <br>
                    <input type="text" name="Name" id="Name_signup" required>
                    <span id="name_status"></span>
                    <br>
                    <label> Email</label>
                    <br>
                    <input type="email" name="email">
                    <br/>
                    <label> Password </label>
                    <br>
                    <input type="password" name="password">
                    <br>
                    <br>
                    <br>
                    <input id="submit_btn" type="submit" value="submit">
                    </div>
                    </form>
                    </div>
</body>
</html>