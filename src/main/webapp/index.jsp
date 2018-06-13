<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="keyword"  content="具体的关键字,便于搜索引擎查找">
    <meta name="description" content="对页面的描述元语言">
    <meta name="generator" content="编辑该网页的软件">
    <meta name="author" content="作者的姓名kimonik">
    <meta name="robots" content="限制搜索引擎的方式">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <meta http-equiv="refresh" content="跳转时间;url=跳转的链接地址">
    <meta http-equiv="expires" content="网页有效期的到期时间">
    <%--禁用缓存--%>
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="set-cookie" content="GMT时间格式的时间">
    <%--强制在一个新窗口中打开网页--%>
    <meta http-equiv="windows-taget" content="_top">

    <meta http-equiv="page-enter" content="revealtrans(duration=10,transition=1)">
    <meta http-equiv="page-exist" content="revealtrans(duration=10,transition=8)">
    <%--设置baseurl--%>
    <%--<base href="http://www.baidu.com" target="_top">--%>
    <style type="text/css">
        body{background-repeat: no-repeat}
    </style>
</head>
<%--<body text="blue" bgcolor="#7fffd4" background="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4060471883,2421439507&fm=27&gp=0.jpg"--%>
    <%--margintop="200" marginleft="200"  topmargin="200"  leftmargin="500"--%>
<%-->--%>
<body>
<h2>Hello World!</h2><br><br>
<a href="/homepage">访问</a><br><br>
<a href="/user/register">注册</a><br><br>
<a href="/user/register1">spring标签测试</a><br><br>
<a href="/user/register2?name=sdyhifasidfhfsklahfsahfiosaf">spring标签测试1</a><br><br>
<a href="/user/register3" target="_blank">spring标签测试直接返回字符串</a><br><br>
<a href="/views/iii.html">打开内部文件</a>
<a href="../s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=2&tn=baiduhome_pg&wd=springmvc%20&rsv_spt=1&oq=springmvc%2520%2540ResponseBody%25E6%258C%2587%25E5%25AE%259A%25E8%25BD%25AC%25E6%258D%25A2%25E5%2599%25A8&rsv_pq=a381d4780005df93&rsv_t=7672AZDRCEJNasHHORqooL7%2BQqWIsyB9eLWcE7aa7SUJnCNuJiUM4vopiW3zm0GUEdnW&rqlang=cn&rsv_enter=0&inputT=240&rsv_sug3=128&rsv_sug1=94&rsv_sug7=100&rsv_sug2=0&rsv_sug4=3367011&rsv_sug=2">访问百度网址</a>
<br><br>body中的text属性标记影响整个body标签中的文本的颜色
<hr size="10" noshade="noshade">
<br><br>
<hr size="10">
<ruby>
    花开花落花非去,梦醒梦中梦无痕.
    <rt>流水</rt>
</ruby><br>
<br>
<%--window.close()必须加分号,否则没效果--%>
<a href="javascript:window.close();">关闭窗口1</a><br><br>
<a href="javascript: window.open('', '_self', '');">关闭窗口2</a>
</body>
</html>
