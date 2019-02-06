var map={}
$(document).ready(function() {
    $("#register").click(function() {
    var name = $("#name").val();
    var email = $("#email").val();
    var password = $("#password").val();
    var cpassword = $("#cpassword").val();
    
    if (name == '' || email == '' || password == '' || cpassword == '') {
    alert("Please fill all fields");}
    else if ((email.indexOf("@", 0) < 0) || (email.indexOf(".", 0) < 0) )
    {
        alert ("please enter a valid email");
    }
 else if ((password.length) < 8) 
    {
    alert("Password should atleast 8 character in length");
    } 
 else if (password != cpassword) {
    alert("Your passwords don't match. Try again?");
    } 
   
        else {


            
console.log("successful registeration");

map[name] = password;
    for (var i in map)
    {
    if (map.hasOwnProperty(i)) {
        console.log('name: ' + i + ' password: ' + map[i]);
    }
}

 window.open("file:///C:/Users/Mohammad/Documents/visualcode%20workspace/registerlogin/welcome.html");
$("form")[0].reset(); 
 }
    });
    });