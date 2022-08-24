<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Wallstant                Help         _55136e</name>
   <tag></tag>
   <elementGuidId>85630ef2-c8c1-4ccd-b7a2-12443b410714</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body.login_signup_body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>login_signup_body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  ×
  

    
    
        
                Wallstant
                Help
                Terms
                Privacy policy
                
                    Login
                    Sign Up
                
        
        
        
        Welcome to Wallstant
        Meet new friends and stay connected with your family and with who you are interested anytime anywhere.
            
                
                    Login now
                    
                    
                     Forgot your password?
                    Login
                    User password incorrect! You have 2 attempts to login
                
                
                    
                
            
        
        
            Don't have an account? Sign Up for free.
                English • العربية
        


function loginUser(){
var username = document.getElementById(&quot;un&quot;).value;
var password = document.getElementById(&quot;pd&quot;).value;
$.ajax({
type:'POST',
url:'includes/login_signup_codes.php',
data:{'req':'login_code','un':username,'pd':password},
beforeSend:function(){
$('.login_signup_btn1').hide();
$('#login_wait').html(&quot;Loading...&quot;);
},
success:function(data){
$('#login_wait').html(data);
if (data == &quot;Welcome...&quot;) {
    $('#login_wait').html(&quot;&lt;p class='alertGreen'>Welcome..&lt;/p>&quot;);
    setTimeout(' window.location.href = &quot;home&quot;; ',2000);
}else{
    $('.login_signup_btn1').show();
}
},
error:function(err){
alert(err);
}
});
}
$('#loginFunCode').click(function(){
loginUser();
});
$(&quot;.login_signup_textfield&quot;).keypress( function (e) {
    if (e.keyCode == 13) {
        loginUser();
    }
});



/html[1]/body[@class=&quot;login_signup_body&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;login_signup_body&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
  ×
  

    
    
        
                Wallstant
                Help
                Terms
                Privacy policy
                
                    Login
                    Sign Up
                
        
        
        
        Welcome to Wallstant
        Meet new friends and stay connected with your family and with who you are interested anytime anywhere.
            
                
                    Login now
                    
                    
                     Forgot your password?
                    Login
                    User password incorrect! You have 2 attempts to login
                
                
                    
                
            
        
        
            Don&quot; , &quot;'&quot; , &quot;t have an account? Sign Up for free.
                English • العربية
        


function loginUser(){
var username = document.getElementById(&quot;un&quot;).value;
var password = document.getElementById(&quot;pd&quot;).value;
$.ajax({
type:&quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
url:&quot; , &quot;'&quot; , &quot;includes/login_signup_codes.php&quot; , &quot;'&quot; , &quot;,
data:{&quot; , &quot;'&quot; , &quot;req&quot; , &quot;'&quot; , &quot;:&quot; , &quot;'&quot; , &quot;login_code&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;un&quot; , &quot;'&quot; , &quot;:username,&quot; , &quot;'&quot; , &quot;pd&quot; , &quot;'&quot; , &quot;:password},
beforeSend:function(){
$(&quot; , &quot;'&quot; , &quot;.login_signup_btn1&quot; , &quot;'&quot; , &quot;).hide();
$(&quot; , &quot;'&quot; , &quot;#login_wait&quot; , &quot;'&quot; , &quot;).html(&quot;Loading...&quot;);
},
success:function(data){
$(&quot; , &quot;'&quot; , &quot;#login_wait&quot; , &quot;'&quot; , &quot;).html(data);
if (data == &quot;Welcome...&quot;) {
    $(&quot; , &quot;'&quot; , &quot;#login_wait&quot; , &quot;'&quot; , &quot;).html(&quot;&lt;p class=&quot; , &quot;'&quot; , &quot;alertGreen&quot; , &quot;'&quot; , &quot;>Welcome..&lt;/p>&quot;);
    setTimeout(&quot; , &quot;'&quot; , &quot; window.location.href = &quot;home&quot;; &quot; , &quot;'&quot; , &quot;,2000);
}else{
    $(&quot; , &quot;'&quot; , &quot;.login_signup_btn1&quot; , &quot;'&quot; , &quot;).show();
}
},
error:function(err){
alert(err);
}
});
}
$(&quot; , &quot;'&quot; , &quot;#loginFunCode&quot; , &quot;'&quot; , &quot;).click(function(){
loginUser();
});
$(&quot;.login_signup_textfield&quot;).keypress( function (e) {
    if (e.keyCode == 13) {
        loginUser();
    }
});



/html[1]/body[@class=&quot;login_signup_body&quot;]&quot;) or . = concat(&quot;
  ×
  

    
    
        
                Wallstant
                Help
                Terms
                Privacy policy
                
                    Login
                    Sign Up
                
        
        
        
        Welcome to Wallstant
        Meet new friends and stay connected with your family and with who you are interested anytime anywhere.
            
                
                    Login now
                    
                    
                     Forgot your password?
                    Login
                    User password incorrect! You have 2 attempts to login
                
                
                    
                
            
        
        
            Don&quot; , &quot;'&quot; , &quot;t have an account? Sign Up for free.
                English • العربية
        


function loginUser(){
var username = document.getElementById(&quot;un&quot;).value;
var password = document.getElementById(&quot;pd&quot;).value;
$.ajax({
type:&quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
url:&quot; , &quot;'&quot; , &quot;includes/login_signup_codes.php&quot; , &quot;'&quot; , &quot;,
data:{&quot; , &quot;'&quot; , &quot;req&quot; , &quot;'&quot; , &quot;:&quot; , &quot;'&quot; , &quot;login_code&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;un&quot; , &quot;'&quot; , &quot;:username,&quot; , &quot;'&quot; , &quot;pd&quot; , &quot;'&quot; , &quot;:password},
beforeSend:function(){
$(&quot; , &quot;'&quot; , &quot;.login_signup_btn1&quot; , &quot;'&quot; , &quot;).hide();
$(&quot; , &quot;'&quot; , &quot;#login_wait&quot; , &quot;'&quot; , &quot;).html(&quot;Loading...&quot;);
},
success:function(data){
$(&quot; , &quot;'&quot; , &quot;#login_wait&quot; , &quot;'&quot; , &quot;).html(data);
if (data == &quot;Welcome...&quot;) {
    $(&quot; , &quot;'&quot; , &quot;#login_wait&quot; , &quot;'&quot; , &quot;).html(&quot;&lt;p class=&quot; , &quot;'&quot; , &quot;alertGreen&quot; , &quot;'&quot; , &quot;>Welcome..&lt;/p>&quot;);
    setTimeout(&quot; , &quot;'&quot; , &quot; window.location.href = &quot;home&quot;; &quot; , &quot;'&quot; , &quot;,2000);
}else{
    $(&quot; , &quot;'&quot; , &quot;.login_signup_btn1&quot; , &quot;'&quot; , &quot;).show();
}
},
error:function(err){
alert(err);
}
});
}
$(&quot; , &quot;'&quot; , &quot;#loginFunCode&quot; , &quot;'&quot; , &quot;).click(function(){
loginUser();
});
$(&quot;.login_signup_textfield&quot;).keypress( function (e) {
    if (e.keyCode == 13) {
        loginUser();
    }
});



/html[1]/body[@class=&quot;login_signup_body&quot;]&quot;))]</value>
   </webElementXpaths>
</WebElementEntity>
