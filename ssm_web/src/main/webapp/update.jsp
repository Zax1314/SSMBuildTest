<%--
  Created by IntelliJ IDEA.
  User: OCEAN
  Date: 2021/6/30
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="updateByName" METHOD="get">
    <div >
        <input type="text" id="ptitle" name="ptitle" typeof="string">
        <p></p>
    </div>
    <div>
        <textarea type="text" id="pcontext" name="pcontext"></textarea>1
        <p></p>
    </div>
    <div >
        <input type="submit" value="修改">
    </div>
</form>
<form action="find_postById" METHOD="get">
    <div >
        <input type="text" id="id" name="id" typeof="Integer">
        <p></p>
    </div>
    <div>
        <input type="text" id="end_id" name="end_id" typeof="Integer"/>
        <p></p>
    </div>
    <div >
        <input type="submit" value="查询">
    </div>
</form>
</body>
<script>
    let  textarea =  document.getElementById("pcontext");
    textarea.onblur=function (){
        let newString = textarea .value.replace(/\n/g, '_@').replace(/\r/g, '_#')
        newString = newString.replace(/_#_@/g, '<br/>')    // IE7-8
        newString = newString.replace(/_@/g, '<br/>')      // IE9、FF、chrome
        newString = newString.replace(/\s/g, '&nbsp;')     // 空格处理

        textarea.innerHTML=newString;
    }
</script>
</html>
