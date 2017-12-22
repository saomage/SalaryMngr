$(function() {
	$("#login_form").validate({
		rules : {
			username : {
				required : true
			},
			password : {
				required : true
			},
			staff : {
				required : true,
			},
		},
		messages : {
			username : {
				required : "请填写用户名"
			},
			password : {
				required : "请填写密码"
			},
			staff : {
				required : "请选择人员的类型",
			}
		}
	});
})