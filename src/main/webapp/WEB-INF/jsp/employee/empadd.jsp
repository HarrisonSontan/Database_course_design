
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
	<title>文档列表 - 光年(Light Year Admin)后台管理系统模板</title>
	<link rel="icon" href="favicon.ico" type="image/ico">
	<meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
	<meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
	<meta name="author" content="yinqi">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/materialdesignicons.min.css" rel="stylesheet">
	<link href="css/style.min.css" rel="stylesheet">
	<!--时间选择插件-->
	<link rel="stylesheet" href="js/bootstrap-datetimepicker/bootstrap-datetimepicker.min.css">
	<!--日期选择插件-->
	<link rel="stylesheet" href="js/bootstrap-datepicker/bootstrap-datepicker3.min.css">
</head>

<body>
<div class="lyear-layout-web">
	<div class="lyear-layout-container">
		<!--左侧导航-->
		<jsp:include page="../left.jsp"></jsp:include>
		<!--End 左侧导航-->

		<!--头部信息-->
		<jsp:include page="../header.jsp"></jsp:include>
		<!--页面主要内容-->
		<main class="lyear-layout-content">
			<div class="container-fluid">

				<div class="row">
					<div class="col-md-24">
						<div class="card">
							<div class="card-header"><h4>用户添加</h4></div>
							<div class="card-body">


								<form class="form-horizontal" action="${ctx}/empaddsave.action" method="get" enctype="multipart/form-data" >

									<div class="form-group">
										<label class="col-xs-12" for="username">姓名</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="username" name="name" placeholder="姓名..">
											<div class="help-block">输入更多信息</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="cardId">身份证号</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="cardId" name="cardId" placeholder="身份证号..">
											<div class="help-block"  id="cardmsgid"> 填写正确的15位或18位身份证号</div>
										</div>
									</div>


									<div class="form-group">
										<label class="col-xs-12" for="example-select">性别</label>
										<div class="col-xs-4">
											<select class="form-control" id="example-select" name="sex" size="1">
												<option value="0">--请选择性别--</option>
												<option value="1">男</option>
												<option value="2">女</option>
											</select>
										</div>
									</div>

									<div class="form-group">
										<label class="col-xs-12" for="job_id">职位</label>
										<div class="col-xs-4">
											<select class="form-control" id="job_id" name="job_id" size="1">
												<option value="0">--请选择职位--</option>
												<c:forEach items="${requestScope.jobList }" var="job">
													<option value="${job.id }">${job.name }</option>
												</c:forEach>
											</select>
										</div>
									</div>


									<div class="form-group">
										<label class="col-xs-12" for="education">学历</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="education" name="education" placeholder="学历..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="email">邮箱</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="email" name="email" placeholder="邮箱..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="phone">手机</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="phone" name="phone" placeholder="手机..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="tel">电话</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="tel" name="tel" placeholder="电话..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="party">政治面貌</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="party" name="party" placeholder="政治面貌..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="qqNum">QQ号码</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="qqNum" name="qqNum" placeholder="QQ号码..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="address">联系地址</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="address" name="address" placeholder="联系地址..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="postCode">邮政编码</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="postCode" name="postCode" placeholder="邮政编码..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="birthday">出生日期</label>
										<div class="col-xs-4">
<%--											<input class="form-control js-datepicker m-b-10" type="text" id="birthday" name="birthday" placeholder="yyyy-mm-dd" value="" data-date-format="yyyy-mm-dd" />--%>
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="race">民族</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="race" name="race" placeholder="民族..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="speciality">所学专业</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="speciality" name="speciality" placeholder="所学专业..">
										</div>
									</div>
									<div class="form-group">
										<label class="col-xs-12" for="hobby">爱好</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="hobby" name="hobby" placeholder="爱好..">
										</div>
									</div>


									<div class="form-group">
										<label class="col-xs-12" for="remark">备注</label>
										<div class="col-xs-4">
											<input class="form-control" type="text" id="remark" name="remark" placeholder="备注..">
										</div>
									</div>

									<div class="form-group">
										<label class="col-xs-12" for="dept_id">所属部门</label>
										<div class="col-xs-4">
											<select class="form-control" id="dept_id" name="dept_id" size="1">
												<option value="0">--请选择部门--</option>
												<c:forEach items="${requestScope.deptList}" var="dept">
													<option value="${dept.id }">${dept.name }</option>
												</c:forEach>
											</select>
										</div>
									</div>


									<div class="form-group">
										<div class="col-xs-12">
											<button class="btn btn-primary" type="submit">提交</button>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>

		</main>
	</div>
</div>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="js/main.min.js"></script>

<!--时间选择插件-->
<script src="js/bootstrap-datetimepicker/moment.min.js"></script>
<script src="js/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js"></script>
<script src="js/bootstrap-datetimepicker/locale/zh-cn.js"></script>
<!--日期选择插件-->
<script src="js/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
<script src="js/bootstrap-datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>

<script type="text/javascript">


	$(function()
	{
		$("#cardId").blur(function(){
			var cid =$("#cardId").val();
			var regIdNo = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
			if (regIdNo.test(cid)) {
				$.ajax({
					url:"getcardid.action",// 发送请求的URL字符串。
					dataType : "json", // 预期服务器返回的数据类型。
					type : "post", //  请求方式 POST或GET
					contentType:"application/json", //  发送信息至服务器时的内容编码类型
					// 发送到服务器的数据。
					data:JSON.stringify({cardId : cid}),
					async:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
					// 请求成功后的回调函数。
					success :function(data){
						if(data)
						{
							$("#cardmsgid").html('身份证验证成功');
						}else
						{
							$("#cardmsgid").html('<span style="color:red">身份证已经存在，请重新输入！</span>');
						}
					},
					// 请求出错时调用的函数
					error:function(){
						alert("数据发送失败");
					}
				});
			}else{
				$("#cardmsgid").html('请输入正确的15位或18位身份证号');
			}
			//异步请求
		});
	});
</script>
</body>
</html>