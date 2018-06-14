<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="keyword" content="具体的关键字,便于搜索引擎查找">
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
        body {
            background-repeat: no-repeat
        }
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
<a href="/user/register5">打开内部图片文件</a>
<a href="../s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=2&tn=baiduhome_pg&wd=springmvc%20&rsv_spt=1&oq=springmvc%2520%2540ResponseBody%25E6%258C%2587%25E5%25AE%259A%25E8%25BD%25AC%25E6%258D%25A2%25E5%2599%25A8&rsv_pq=a381d4780005df93&rsv_t=7672AZDRCEJNasHHORqooL7%2BQqWIsyB9eLWcE7aa7SUJnCNuJiUM4vopiW3zm0GUEdnW&rqlang=cn&rsv_enter=0&inputT=240&rsv_sug3=128&rsv_sug1=94&rsv_sug7=100&rsv_sug2=0&rsv_sug4=3367011&rsv_sug=2">访问百度网址</a>
<br><br>body中的text属性标记影响整个body标签中的文本的颜色
<hr size="10" noshade="noshade">
<br><br>
<hr size="10">
<ruby>
    花开花落花非去,梦醒梦中梦无痕.
    <rt>流水</rt>
</ruby>
<br>
<br>
<%--window.close()必须加分号,否则没效果--%>
<a href="javascript:window.close();">关闭窗口1</a><br><br>
<a href="javascript: window.open('', '_self', '');">关闭窗口2</a><br>
<session>
    文章内容
    <footer>
        分段内容的注脚
    </footer>
</session>
<br>
<canvas id="djx" width="300" height="300" style="border: 1px solid;">

</canvas>
<script>
    function drawDiagonal() {
        var canvas = document.getElementById("djx");
        var context = canvas.getContext('2d');



        //绘制图片
        //使用 context.putImageData(contextData, 0, 0);时必须使用
        //本服务器内的图片,其他服务器的图片不行,最终显示函数必须是
        //context.putImageData(contextData, 0, 0);
        // image = new Image();
        // // image.src = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1528971516209&di=c06c41abcab1edc232922655ea463388&imgtype=0&src=http%3A%2F%2Fi0.sinaimg.cn%2Fqc%2F2014%2F0926%2FU11295P33DT20140926091606.jpg";
        // image.src="/user/register5";
        //
        // image.onload = function (ev) {
        //     context.drawImage(image, 0, 0, 300, 300);
        //     //绘制局部放大
        //     // context.drawImage(image,23,5,57,90,110,0,100,100);
        //     var contextData = context.getImageData(0, 0, image.width, image.height);
        //     var s;
        //     for (var i = 0; i < contextData.data.length; i += 4) {
        //         // contextData.data[i + 0] = 125;
        //         // contextData.data[i + 1] = 125;
        //         // contextData.data[i + 2] = 125;
        //         // if (s===10000) {
        //         //     alert("原始值是:"+contextData.data[i + 0])
        //         // }
        //         contextData.data[i + 0] = 255 - contextData.data[i + 0];
        //         contextData.data[i + 1] = 255 - contextData.data[i + 1];
        //         contextData.data[i + 2] = 255 - contextData.data[i + 2];
        //         // if (s===10000) {
        //         //     alert("更改后的值是:"+contextData.data[i + 0])
        //         // }
        //         s=i;
        //
        //     }
        //     alert("i的最终值是"+s);
        //     context.putImageData(contextData, 0, 0,0,0,300,300);
        // }

        // //平移,缩放,旋转
        // context.fillStyle="#FFF";
        // context.fillRect(0,0,300,300);
        //
        // context.translate(200,50);
        // context.fillStyle="rgba(255,0,0,0.25)"
        //
        // for (var i = 0; i < 50; i++) {
        //     context.translate(25,25);
        //     context.scale(0.95,0.95);
        //     context.rotate(Math.PI/10);
        //     context.fillRect(0,0,100,50);
        // }
        // context.stroke();


        // //绘制渐变
        // var lingrad=context.createLinearGradient(0,0,300,300);
        // lingrad.addColorStop(0,"white");
        // lingrad.addColorStop(1,"black");
        //
        //
        // var ciclegrad=context.createRadialGradient(150,150,10,150,150,150);
        // ciclegrad.addColorStop(0,"white");
        // ciclegrad.addColorStop(1,"black");
        //
        // context.fillStyle=ciclegrad;
        // context.fillRect(0,0,300,300);
        // context.stroke();

        //设置整体透明度
        // context.fillStyle = "#FD0";
        // context.fillRect(0, 0, 75, 75)
        //
        // context.fillStyle = "#6C0";
        // context.fillRect(75, 0, 75, 75);
        //
        // context.fillStyle = "#09F";
        // context.fillRect(0, 75, 75, 75);
        //
        // context.fillStyle = "#F30";
        // context.fillRect(75, 75, 75, 75);
        //
        // context.globalAlpha=0.3;
        //
        // for (var i = 0; i < 7; i++) {
        //     context.beginPath();
        //     context.arc(75,75,10+10*i,0,Math.PI*2,true);
        //     context.fill();
        //     context.stroke();
        //
        // }


        // //绘制火柴人
        // context.fillStyle = "green";
        // context.strokeStyle = "red";
        // context.lineWidth = "1";
        //
        // context.beginPath();
        // context.arc(100, 50, 30, 0, 2 * Math.PI, true);
        // context.fill();
        // context.stroke();
        //
        // context.beginPath();
        // context.strokeStyle = "#c00"
        // context.lineWidth = "3";
        // context.arc(100, 50, 20, 0, Math.PI, false);
        // context.fill();
        // context.stroke();
        //
        // context.beginPath();
        // context.arc(90, 45, 3, 0, 2 * Math.PI, true);
        // context.fill();
        // context.stroke();
        // context.moveTo(113, 45);
        // context.arc(110, 45, 3, 0, 2 * Math.PI, true);
        // context.fill();
        // context.stroke();
        //
        // context.beginPath();
        // context.moveTo(100, 80);
        // context.lineTo(100, 180);
        // context.lineTo(75, 250);
        // context.moveTo(100, 180);
        // context.lineTo(125, 250);
        // context.moveTo(100, 90);
        // context.lineTo(75, 140);
        // context.moveTo(100, 90);
        // context.lineTo(125, 140);
        // context.stroke();

        // 绘制红心
        // context.beginPath();
        // context.fillStyle="#c00";
        // context.strokeStyle="#c00";
        // context.moveTo(75,40);
        // context.bezierCurveTo(75,37,70,25,50,25);
        // context.bezierCurveTo(20,25,20,62.5,20,62.5);
        // context.bezierCurveTo(20,80,40,102,75,120);
        // context.bezierCurveTo(110,102,130,80,130,62.5);
        // context.bezierCurveTo(130,62.5,130,25,100,25);
        // context.bezierCurveTo(85,25,75,37,75,40);
        // context.fill();
        // context.stroke();

        // 绘制对话框
        context.beginPath();
        context.strokeStyle="#c00";
        context.moveTo(75,25);
        context.quadraticCurveTo(25,25,25,62.5);
        context.quadraticCurveTo(25,100,50,100);
        context.quadraticCurveTo(50,120,30,125);
        context.quadraticCurveTo(60,120,65,100);
        context.quadraticCurveTo(125,100,125,62.5);
        context.quadraticCurveTo(125,25,75,25);
        // context.fill();
        context.stroke();
        context.toDataURL("/user/register5");


        //绘制不同颜色的矩形
        // for (var i = 0; i < 6; i++) {
        //     for (var j = 0; j < 6; j++) {
        //         context.fillStyle = "rgb("+Math.floor(255 - 42.5 * i)+","+ Math.floor(255 - 42.5 * j)+", 0)";
        //         // context.fillStyle = "rgb(255,120,120)";
        //         context.fillRect(j * 25, i * 25, 25, 25);
        //         context.stroke();
        //     }
        // }

        // context.fillRect(0,0,30,30);
        // context.strokeRect(30,30,50,50);
        // context.beginPath();
        // context.arc(50,50,80,0,2*Math.PI,true);
        // context.moveTo(100,100);
        // context.lineTo(100,200);
        // context.lineTo(200,200);
        // context.closePath();
        // context.fill();
        // context.stroke();
    }

    window.addEventListener("load", drawDiagonal, true);
    document.write("Hello World!");
</script>
</body>
</html>
