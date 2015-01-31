d<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="icon" href="img/pt.ico">

    
    <title>首页 </title>
	

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="css/carousel.css" rel="stylesheet">
    
    <style>
    
    
	.navbar-fedora .navbar-nav > .active > a,
	.navbar-fedora .navbar-nav > .active > a:hover,
	.navbar-fedora .navbar-nav > .active > a:focus {
	  color: #23c897;
	background-color:#ffffff;
	}

	.navbar-fedora .navbar-nav > .open > a,
	.navbar-fedora .navbar-nav > .open > a:hover,
	.navbar-fedora .navbar-nav > .open > a:focus {
	  color: #23c897;
	background-color: #ffffff;
	}
    </style>
  </head>
  
<!-- NAVBAR================================================== -->
<div class="navbar navbar-fedora navbar-fixed-top bs-docs-nav" id="primarynav" style="background-color: #fff;" role="navigation"> <!-- border-bottom:0px; -->
  <div class="container">
	<div class="navbar-header">
	  <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
	    <span class="sr-only">Toggle navigation</span>
	    <span class="icon-bar"></span>
	    <span class="icon-bar"></span>
	    <span class="icon-bar"></span>
	  </button>
      <a class="navbar-brand" href="#" style="color:white;font-size:30px;padding:0px;"><img src="img/pt.png" style="margin-top:0px;margin-bottom:0px;width:68px;height:60px;"></a>
    </div>

    <div class="collapse navbar-collapse navbar-ex1-collapse">
      <ul class="nav navbar-nav pull-right">
		<li class="navbar-el" style="font-size:20px">
		  <a href="http://localhost/ssh/" class="navbar-link" style="padding-top:21px; ;">首页</a>
	    </li>
		<li class="navbar-el" style="font-size:20px">
		  <a href="http://localhost/ssh/" class="navbar-link" style="padding-top:21px; ;">产品介绍</a>
	    </li>
	    <li class="navbar-el" style="font-size:20px">
		  <a href="http://localhost/ssh/" class="navbar-link" style="padding-top:21px; ;">常见问题</a>
	    </li>
	    <li class="navbar-el" style="font-size:20px">
		  <a href="http://localhost/ssh/" class="navbar-link" style="padding-top:21px; ;">关于我们</a>
	    </li>
	    <li class="navbar-el" style="font-size:20px">
	      <a href="https://ssl.usefedora.com/login_register.php?affcode=&site=2655#login" class="navbar-link" style="padding-top:21px; ;">登录</a>
	    </li>
          
        <a id="signup_button" class="btn btn-primary pull-right btn-lg" style="margin-top:7px;margin-left:10px;margin-bottom:-2px;"> 注册 </a>
      </ul>
	</div>
  </div>
</div>
    
<!-- Carousel================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class=""></li>
    <li data-target="#myCarousel" data-slide-to="1" class=""></li>
    <li data-target="#myCarousel" data-slide-to="2" class="active"></li>
  </ol>
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="img/1.jpg" alt="First slide">
        <div class="container">
          <div class="carousel-caption">
            <h1>测试页1</h1>
            <p>这是图片轮播的测试，<br />可以通过左侧和右侧的按钮进行切换，<br/>同时它可以自动轮播。</p>
            <!--  
            <p><a class="btn btn-lg btn-primary" href="http://v3.bootcss.com/examples/carousel/#myCarousel" role="button">Sign up today</a></p>
            -->
          </div>
        </div>
      </div>
      <div class="item">
        <img src="img/2.jpg" alt="Second slide">
        <div class="container">
          <div class="carousel-caption" >
            <h1>测试页2</h1>
            <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. <br />Donec id elit non mi porta gravida at eget metus. <br />Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <!--  
            <p><a class="btn btn-lg btn-primary" href="http://v3.bootcss.com/examples/carousel/#" role="button">Learn more</a></p>
            -->
          </div>
        </div>
      </div>
      <div class="item">
        <img src="img/3.jpg" alt="Third slide">
        <div class="container">
          <div class="carousel-caption">
            <h1>测试页3</h1>
            <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. <br />Donec id elit non mi porta gravida at eget metus. <br />Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <!--  
            <p><a class="btn btn-lg btn-primary" href="http://v3.bootcss.com/examples/carousel/#" role="button">Browse gallery</a></p>
            -->
          </div>
        </div>
      </div>
    </div>
    <a class="left carousel-control" href="http://v3.bootcss.com/examples/carousel/#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="http://v3.bootcss.com/examples/carousel/#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
    </div><!-- /.carousel -->


    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="img/b1.png" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>信用评估</h2>
          <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
          <!--  <p><a class="btn btn-default" href="http://v3.bootcss.com/examples/carousel/#" role="button">View details »</a></p>-->
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="img/b2.png" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>信用===财富</h2>
          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
          <!--  <p><a class="btn btn-default" href="http://v3.bootcss.com/examples/carousel/#" role="button">View details »</a></p>-->
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="img/b3.png" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>尽在掌中</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <!--  <p><a class="btn btn-default" href="http://v3.bootcss.com/examples/carousel/#" role="button">View details »</a></p>-->
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->


      
      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="http://v3.bootcss.com/examples/carousel/#">Back to top</a></p>
        <p>© 2015 安家乐, Inc. · @by Who'sKing FE Pearl' · <a href="http://localhost/ssh">Terms</a></p>
      </footer>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  

<div id="global-zeroclipboard-html-bridge" class="global-zeroclipboard-container" title="" style="position: absolute; left: 0px; top: -9999px; width: 15px; height: 15px; z-index: 999999999;" data-original-title="Copy to clipboard">      <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" id="global-zeroclipboard-flash-bridge" width="100%" height="100%">         <param name="movie" value="/assets/flash/ZeroClipboard.swf?noCache=1419866659929">         <param name="allowScriptAccess" value="sameDomain">         <param name="scale" value="exactfit">         <param name="loop" value="false">         <param name="menu" value="false">         <param name="quality" value="best">         <param name="bgcolor" value="#ffffff">         <param name="wmode" value="transparent">         <param name="flashvars" value="trustedOrigins=v3.bootcss.com%2C%2F%2Fv3.bootcss.com%2Chttp%3A%2F%2Fv3.bootcss.com">         <embed src="/assets/flash/ZeroClipboard.swf?noCache=1419866659929" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="100%" height="100%" name="global-zeroclipboard-flash-bridge" allowscriptaccess="sameDomain" allowfullscreen="false" type="application/x-shockwave-flash" wmode="transparent" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="trustedOrigins=v3.bootcss.com%2C%2F%2Fv3.bootcss.com%2Chttp%3A%2F%2Fv3.bootcss.com" scale="exactfit">                </object></div><svg xmlns="http://www.w3.org/2000/svg" width="500" height="500" viewBox="0 0 500 500" preserveAspectRatio="none" style="visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs></defs><text x="0" y="23" style="font-weight:bold;font-size:23pt;font-family:Arial, Helvetica, Open Sans, sans-serif;dominant-baseline:middle">500x500</text></svg></body></html>