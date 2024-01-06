<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
  <title>首页 - 后台管理系统</title>
  <link rel="icon" href="favicon.ico" type="image/ico">
  <meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
  <meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
  <meta name="author" content="yinqi">
  <link href="../../css/bootstrap.min.css" rel="stylesheet">
  <link href="../../css/materialdesignicons.min.css" rel="stylesheet">
  <link href="../../css/style.min.css" rel="stylesheet">
  <style>
  </style>
</head>

<body>
<div class="lyear-layout-web">
  <div class="lyear-layout-container">
    <!--左侧导航-->
    <jsp:include page="left.jsp"></jsp:include>
    <!--End 左侧导航-->

    <!--头部信息-->
   <jsp:include page="header.jsp"></jsp:include>
    <!--End 头部信息-->

    <!--页面主要内容-->
    <main class="lyear-layout-content">
      <img src="https://www.gdou.edu.cn/__local/8/32/FD/AFA0000824ED609C4B5D18BB251_B0AC8381_6C5D5.jpg"
           width="990" height="480">
    </main>
    <!--End 页面主要内容-->
  </div>
</div>

<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="../../js/main.min.js"></script>

<!--图表插件-->
<script type="text/javascript" src="../../js/Chart.js"></script>
<script type="text/javascript">
  $(document).ready(function(e) {
    var $dashChartBarsCnt  = jQuery( '.js-chartjs-bars' )[0].getContext( '2d' ),
            $dashChartLinesCnt = jQuery( '.js-chartjs-lines' )[0].getContext( '2d' );

    var $dashChartBarsData = {
      labels: ['周一', '周二', '周三', '周四', '周五', '周六', '周日'],
      datasets: [
        {
          label: '注册用户',
          borderWidth: 1,
          borderColor: 'rgba(0,0,0,0)',
          backgroundColor: 'rgba(51,202,185,0.5)',
          hoverBackgroundColor: "rgba(51,202,185,0.7)",
          hoverBorderColor: "rgba(0,0,0,0)",
          data: [2500, 1500, 1200, 3200, 4800, 3500, 1500]
        }
      ]
    };
    var $dashChartLinesData = {
      labels: ['2003', '2004', '2005', '2006', '2007', '2008', '2009', '2010', '2011', '2012', '2013', '2014'],
      datasets: [
        {
          label: '交易资金',
          data: [20, 25, 40, 30, 45, 40, 55, 40, 48, 40, 42, 50],
          borderColor: '#358ed7',
          backgroundColor: 'rgba(53, 142, 215, 0.175)',
          borderWidth: 1,
          fill: false,
          lineTension: 0.5
        }
      ]
    };

    new Chart($dashChartBarsCnt, {
      type: 'bar',
      data: $dashChartBarsData
    });

    var myLineChart = new Chart($dashChartLinesCnt, {
      type: 'line',
      data: $dashChartLinesData,
    });
  });
</script>
</body>
</html>
